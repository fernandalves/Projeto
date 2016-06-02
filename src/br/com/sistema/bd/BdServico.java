package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.sistema.entidade.Servico;
import br.com.sistema.util.Constantes;

public class BdServico {

	private ArrayList<Servico> servicos;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdServico() {
		abrirArquivo();
		this.servicos = new ArrayList<Servico>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				Servico s = converterlinhaParaServico(linha);
				servicos.add(s);
				linha = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}

	}

	private Servico converterlinhaParaServico(String linha) {
		Servico servico = new Servico();
		try {
			String servicoLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			servico.setId(Integer.parseInt(servicoLinha[0]));
			servico.setDescricao(servicoLinha[1]);
			servico.setPreco(Double.parseDouble(servicoLinha[2]));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao converte linha para serviço");
			System.exit(0);
		}

		return servico;
	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_SERVICO, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_SERVICO));
		} catch (IOException e) {
			System.out.println("Problema ao abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private boolean salvarServicoNoArquivo(Servico servico) {

		try {
			abrirArquivo();
			bw.write(servico.servicoParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar Serviço no Arquivo");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(Servico servico) {
		try {

			if (validarServico(servico)) {
				this.servicos.add(servico);
				return salvarServicoNoArquivo(servico);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar um Serviço");
			System.exit(0);
		}
		return false;
	}

	private boolean validarServico(Servico servico) {
		try {
			for (Servico s : servicos)
				if (s.getDescricao() == servico.getDescricao()) {
					return false;
				}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao validar serviço");
			System.exit(0);
		}
		return true;
	}

	public List<Servico> buscarPorNome(String nome) {
		List<Servico> lista = new ArrayList<Servico>();
		try {
			for (Servico servico : listarTodos()) {
				if (servico.getDescricao().contains(nome)) {
					lista.add(servico);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar serviço");
			System.exit(0);
		}
		return lista;
	}

	public ArrayList<Servico> listarTodos() {
		return servicos;
	}

}
