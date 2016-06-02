package br.com.sistema.menus;

import java.util.List;
import java.util.Scanner;
import br.com.sistema.bd.BdItemProduto;
import br.com.sistema.bd.BdProduto;
import br.com.sistema.entidade.ItemProduto;
import br.com.sistema.entidade.Produto;
import br.com.sistema.util.Util;

public class EstoqueMenu {

	private BdItemProduto bd;
	private BdProduto bdProduto;
	private int op;
	private Scanner sc;

	public EstoqueMenu() {
		this.bd = new BdItemProduto();
		this.bdProduto = new BdProduto();
		this.sc = new Scanner(System.in);
	}

	private void menu() {

		System.out.println("------Menu Estoque------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar");
		System.out.println("3 - Listar Todos");
		System.out.println("0 - Sair");
		System.out.println("Digite sua opção");
		op = Util.receberInteiroDoScanner();
//		sc.nextLine();
	}

	public void iniciar() {
		do {
			menu();

			switch (op) {

			case 1:
				if (novoItem()) {
					System.out.println("Item Salvo com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar um Item");
				}
				break;
			case 2:
				System.out.println("Digite o nome a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorNome(nome) != null) {
					System.out.println(bd.buscarPorNome(nome));
				} else {
					System.out.println("Item não existe!!");
				}
				break;
			case 3:
				for (ItemProduto item : bd.listarTodos()) {
					System.out.println(item.getProduto().getNome() + " - " + item.getQuantidade());
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Item !");
				return;
			default:
				System.out.println("Opção Inválida!!");
				break;
			}
		} while (op != 0);
	}

	private boolean novoItem() {

		System.out.println("------Cadastrando um novo Item Produto------");
		System.out.println("\n");

		System.out.println("Digite o nome do produto:");
		String nome = sc.nextLine();

		List<Produto> lista = bdProduto.buscarPorNome(nome);

		if (!lista.isEmpty()) {
			for (Produto p : lista)
				System.out.println(p.getId() + " - " + p.getNome());
		} else {
			return false;
		}
		int cod;
		do {
			System.out.println("Informe o codigo do produto:");
			cod = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (cod == -1);
		Produto item = bdProduto.buscarPorCodigo(cod);
		if (item == null) {
			System.out.println("Produto não existe!");
			return false;
		}

		System.out.println("Digite a Data de Validade:");
		String dtVenc = sc.nextLine();
		
		int qtd;
		do {
			System.out.println("Informe a Quantidade:");
			qtd = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (qtd == -1);
		
		
		double precoCompra;
		do {
			System.out.println("Digite o preço de Compra");
			precoCompra = Util.receberDoubleDoScanner();
			sc.nextLine();
		} while (precoCompra == -1);

		int varejo;
		do {
			System.out.println("Digite a porcentagem para varejo");
			varejo = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (varejo == -1);
	
		int atacado;
		do {
			System.out.println("Digite a porcentagem para atacado");
			atacado = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (atacado == -1);
		
		ItemProduto itemProduto = new ItemProduto();
		
		itemProduto.setProduto(item);
		itemProduto.setDataValidade(dtVenc);
		itemProduto.setQuantidade(qtd);
		itemProduto.setPrecoCompra(precoCompra);
		itemProduto.setPorcentagemVendaVarejo(varejo);
		itemProduto.setPorcentagemVendaAtacado(atacado);
		
		return bd.salvar(itemProduto);
	}

}
