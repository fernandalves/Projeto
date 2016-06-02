package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.com.sistema.entidade.ItemProduto;
import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class BdItemProduto {

	private ArrayList<ItemProduto> estoque;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdItemProduto() {
		abrirArquivo();
		this.estoque = new ArrayList<ItemProduto>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				ItemProduto c = converterlinhaParaItemProduto(linha);
				estoque.add(c);
				linha = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}

	}

	private ItemProduto converterlinhaParaItemProduto(String linha) {
		ItemProduto itemProduto = new ItemProduto();
		try {
			String itemLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			itemProduto.setId(Integer.parseInt(itemLinha[0]));
			itemProduto.getProduto().setNome(itemLinha[1]);
			itemProduto.setQuantidade(Integer.parseInt(itemLinha[2]));
			itemProduto.setPrecoCompra(Integer.parseInt(itemLinha[3]));
			itemProduto.setDataValidade(itemLinha[4]);
			// itemProduto.setDataCompra(itemLinha[5]);
			itemProduto.setPorcentagemVendaAtacado(Integer.parseInt(itemLinha[6]));
			itemProduto.setPorcentagemVendaVarejo(Integer.parseInt(itemLinha[7]));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao Conveter linha para Item Produto");
			System.exit(0);
		}
		return itemProduto;

	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_ITEMPRODUTO, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_ITEMPRODUTO));
		} catch (IOException e) {
			System.out.println("Problema ao Abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private boolean salvarItemProdutoNoArquivo(ItemProduto itemProduto) {
		try {
			abrirArquivo();
			bw.write(itemProduto.itemProdutoParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar ItemProduto no Arquivo");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(ItemProduto itemProduto) {
		try {
			itemProduto.setId(GeradorCodigo.gerarCodigoItemProduto());
			this.estoque.add(itemProduto);
			return salvarItemProdutoNoArquivo(itemProduto);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar um Item Produto");
			System.exit(0);
		}
		return false;
	}

	public List<ItemProduto> buscarPorNome(String nome) {
		List<ItemProduto> lista = new ArrayList<ItemProduto>();
		try {
			for (ItemProduto item : listarTodos()) {
				if (item.getProduto().getNome().contains(nome)) {
					lista.add(item);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar Item por Nome");
			System.exit(0);
		}
		return lista;
	}

	public ItemProduto buscarPorCodigo(int busca) {
		try {
			for (ItemProduto i : estoque) {
				if (i.getId() == busca) {
					return i;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro buscar Item por Código ");
			System.exit(0);
		}
		return null;
	}

	public ArrayList<ItemProduto> listarTodos() {
		return estoque;
	}

}
