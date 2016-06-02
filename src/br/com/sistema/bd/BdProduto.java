package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.sistema.entidade.Produto;
import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class BdProduto {

	private ArrayList<Produto> produtos;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdProduto() {
		abrirArquivo();
		this.produtos = new ArrayList<Produto>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				Produto p = converterlinhaParaProduto(linha);
				produtos.add(p);
				linha = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}
	}

	private Produto converterlinhaParaProduto(String linha) {
		Produto produto = new Produto();
		try {
			String produtoLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			produto.setId(Integer.parseInt(produtoLinha[0]));
			produto.setNome(produtoLinha[1]);
			produto.setTipo(produtoLinha[2]);
			produto.getFornecedor().setNome((produtoLinha[3]));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao Conveter linha para Produto");
			System.exit(0);
		}
		return produto;
	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_PRODUTO, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_PRODUTO));
		} catch (IOException e) {
			System.out.println("Problema ao Abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private boolean salvarProdutoNoArquivo(Produto produto) {
		try {
			abrirArquivo();
			bw.write(produto.produtoParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar Produto no Arquivo");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(Produto produto) {
		try {
			if (isExistePorNome(produto)) {
				produto.setId(GeradorCodigo.gerarCodigoProduto());
				this.produtos.add(produto);
				return salvarProdutoNoArquivo(produto);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao Salvar Produto");
			System.exit(0);
		}
		return false;
	}

	public boolean isExistePorNome(Produto produto) {
		try {
			for (Produto p : listarTodos()) {
				if (p.getNome().equalsIgnoreCase(produto.getNome())) {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao verificar se Produto o existe");
			System.exit(0);
		}
		return true;
	}

	public List<Produto> buscarPorNome(String nome) {
		List<Produto> lista = new ArrayList<Produto>();
		try {
			for (Produto p : listarTodos()) {
				if (p.getNome().contains(nome)) {
					lista.add(p);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar Produto por nome ");
			System.exit(0);
		}
		return lista;
	}

	public Produto buscarPorCodigo(int busca) {
		try {
			for (Produto p : produtos) {
				if (p.getId() == busca) {
					return p;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro buscar produto por Código ");
			System.exit(0);
		}
		return null;
	}

	public ArrayList<Produto> listarTodos() {
		return this.produtos;
	}

}
