package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import br.com.sistema.entidade.Fornecedor;
import br.com.sistema.util.Constantes;

public class BdFornecedor {

	private ArrayList<Fornecedor> fornecedores;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdFornecedor() {
		abrirArquivo();
		this.fornecedores = new ArrayList<Fornecedor>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				Fornecedor f = converterlinhaParaFornecedor(linha);
				fornecedores.add(f);
				linha = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}
	}

	private Fornecedor converterlinhaParaFornecedor(String linha) {
		Fornecedor fornecedor = new Fornecedor();
		try {
			String fornecedorLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			fornecedor.setId(Integer.parseInt(fornecedorLinha[0]));
			fornecedor.setNome(fornecedorLinha[1]);
			fornecedor.setDocumento(fornecedorLinha[2]);
			fornecedor.setInscricaoEstadual(fornecedorLinha[3]);
			fornecedor.getEndereco().setRua(fornecedorLinha[4]);
			fornecedor.getEndereco().setBairro(fornecedorLinha[5]);
			fornecedor.getEndereco().setNumero(Integer.parseInt(fornecedorLinha[6]));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao converte linha para Fornecedor");
			System.exit(0);
		}
		return fornecedor;
	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_FORNECEDOR, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_FORNECEDOR));
		} catch (IOException e) {
			System.out.println("Problema ao Abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private boolean salvarFornecedorNoArquivo(Fornecedor fornecedor) {
		try {
			abrirArquivo();
			bw.write(fornecedor.fornecedorParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar fornecedor no Arquivo");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(Fornecedor fornecedor) {
		try {
			if (validarFornecedor(fornecedor)) {
				this.fornecedores.add(fornecedor);
				return salvarFornecedorNoArquivo(fornecedor);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao Salvar Fornecedor");
			System.exit(0);
		}
		return false;
	}

	public boolean validarFornecedor(Fornecedor fornecedor) {
		try {
			if (buscarPorCnpj(fornecedor.getDocumento()) != null) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao Validar Fornecedor");
			System.exit(0);
		}
		return true;
	}

	public ArrayList<Fornecedor> listarTodos() {
		return this.fornecedores;
	}

	public Fornecedor buscarPorCnpj(String cnpj) {
		try {
			for (Fornecedor fornecedor : this.fornecedores) {
				if (fornecedor.getDocumento().equals(cnpj)) {
					return fornecedor;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar Fornecedor pelo Cnpj");
			System.exit(0);
		}
		return null;
	}

}
