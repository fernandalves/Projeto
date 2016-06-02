package br.com.sistema.menus;

import java.util.Scanner;
import br.com.sistema.bd.BdFornecedor;
import br.com.sistema.bd.BdProduto;
import br.com.sistema.entidade.Fornecedor;
import br.com.sistema.entidade.Produto;
import br.com.sistema.util.Constantes;
import br.com.sistema.util.Util;

public class ProdutoMenu {

	private BdFornecedor bdFornecedor;
	private BdProduto bd;
	private int op;
	private Scanner sc;

	public ProdutoMenu() {
		this.bd = new BdProduto();
		this.sc = new Scanner(System.in);
		this.bdFornecedor = new BdFornecedor();
	}

	private void menu() {
		System.out.println("------Menu Produto------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar");
		System.out.println("3 - Listar Todos");
		// System.out.println("4 - Desativar Produto");
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
				if (novoProduto()) {
					System.out.println("Produto Salvo com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar um Produto");
				}
				break;
			case 2:
				System.out.println("Digite o nome a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorNome(nome) != null) {
					System.out.println(bd.buscarPorNome(nome));
				} else {
					System.out.println("Produto não existe!!");
				}
				break;
			case 3:
				for (Produto produto : bd.listarTodos()) {
					System.out.println(produto.getNome());
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Produto !");
				return;
			default:
				System.out.println("Opção Inválida!!");
				break;
			}
		} while (op != 0);

	}

	private boolean novoProduto() {
		System.out.println("------Cadastrando um novo Produto------");
		System.out.println("\n");

		System.out.println("Digite o nome do Produto:");
		String nome = sc.nextLine();

		String tipo = escolherTipo();

		System.out.println("Fornecedores: " + bdFornecedor.listarTodos().size());
		for (Fornecedor fornecedor : bdFornecedor.listarTodos()) {
			System.out.println(fornecedor);
		}
		System.out.println("Informe o CNPJ do fornecedor do produto");
		String cnpj = sc.nextLine();
		Fornecedor fornecedor = bdFornecedor.buscarPorCnpj(cnpj);
		if (fornecedor == null) {
			System.out.println("Fornecedor não existe!");
			return false;
		}

		Produto produto = new Produto();

		produto.setNome(nome);
		produto.setTipo(tipo);
		produto.setFornecedor(fornecedor);

		return bd.salvar(produto);
	}

	private String escolherTipo() {

		System.out.println("------Tipo------");
		System.out.println("1 - " + Constantes.ALIMENTO);
		System.out.println("2 - " + Constantes.LIMPEZA);
		System.out.println("3 - " + Constantes.ELETRONICO);
		System.out.println("0 - Sair");
		System.out.println("Digite sua opção");
		int opt = Util.receberInteiroDoScanner();
//		sc.nextLine();
		do {

			switch (opt) {
			case 1:
				return Constantes.ALIMENTO;

			case 2:
				return Constantes.LIMPEZA;

			case 3:
				return Constantes.ELETRONICO;
			default:
				System.out.println("Opção inválida!!");
				break;
			}
		} while (true);
	}
}
