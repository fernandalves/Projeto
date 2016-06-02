package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.com.sistema.entidade.Funcionario;
import br.com.sistema.entidade.Funcionario;
import br.com.sistema.util.Constantes;

public class BdFuncionario {

	private ArrayList<Funcionario> funcionarios;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdFuncionario() {
		abrirArquivo();
		this.funcionarios = new ArrayList<Funcionario>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				Funcionario f = converterlinhaParaFuncionario(linha);
				funcionarios.add(f);
				linha = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}

	}

	private Funcionario converterlinhaParaFuncionario(String linha) {
		Funcionario funcionario = new Funcionario();
		try {
			String funcionarioLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			funcionario.setId(Integer.parseInt(funcionarioLinha[0]));
			funcionario.setNome(funcionarioLinha[1]);
			funcionario.setDocumento(funcionarioLinha[2]);
			funcionario.getEndereco().setRua(funcionarioLinha[3]);
			funcionario.getEndereco().setBairro(funcionarioLinha[4]);
			funcionario.getEndereco().setNumero(Integer.parseInt(funcionarioLinha[5]));
//			funcionario.setCargo((funcionarioLinha[6]));
//			funcionario.setLogin((funcionarioLinha[7]));
//			funcionario.setSenha((funcionarioLinha[8]));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao converte linha para Funcionario");
			System.exit(0);
		}
		return funcionario;
	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_FUNCIONARIO, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_FUNCIONARIO));
		} catch (IOException e) {
			System.out.println("Problema ao Abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	private boolean salvarFuncionarioNoArquivo(Funcionario funcionario) {
		try {
			abrirArquivo();
			bw.write(funcionario.funcionarioParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar funcionario no Arquivo ");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(Funcionario funcionario) {
		try {
			if (validarFuncionario(funcionario)) {
				this.funcionarios.add(funcionario);
				return salvarFuncionarioNoArquivo(funcionario);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar Funcionario");
			System.exit(0);
		}
		return false;

	}
	
	public boolean validarFuncionario(Funcionario funcionario) {
		try {
			if (buscarPorDocumento(funcionario.getDocumento()) != null) {
				return false;
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao Validar Funcionario ");
			System.exit(0);
		}
		return true;
	}
	
	public Funcionario buscarPorDocumento(String documento) {
		try {
			for (Funcionario funcionario : this.funcionarios) {
				if (funcionario.getDocumento().equals(documento)) {
					return funcionario;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar funcionario por documento");
			System.exit(0);
		}
		return null;
	}

	public List<Funcionario> buscarPorNome(String nome) {
		List<Funcionario> lista = new ArrayList<Funcionario>();
		try {
			for (Funcionario funcionario : listarTodos()) {
				if (funcionario.getNome().contains(nome)) {
					lista.add(funcionario);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar funcionario por nome");
			System.exit(0);
		}
		return lista;
	}

	public Funcionario buscarPorCodigo(int busca) {
		try {
			for (Funcionario f : funcionarios) {
				if (f.getId() == busca) {
					return f;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro buscar FUncionario por Código ");
			System.exit(0);
		}
		return null;
	}
	public ArrayList<Funcionario> listarTodos() {
		return this.funcionarios;
	}

}
