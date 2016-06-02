package br.com.sistema.menus;

//import java.util.Scanner;
import br.com.sistema.menus.AnimalMenu;
import br.com.sistema.menus.ClienteMenu;
import br.com.sistema.menus.EstoqueMenu;
import br.com.sistema.menus.FornecedorMenu;
import br.com.sistema.menus.FuncionarioMenu;
import br.com.sistema.menus.ProdutoMenu;
import br.com.sistema.menus.ServicoMenu;
import br.com.sistema.util.Util;

public class Sistema {

	private AnimalMenu animalMenu;
	private ClienteMenu clienteMenu;
	private FornecedorMenu fornecedorMenu;
	private FuncionarioMenu funcionarioMenu;
	private EstoqueMenu estoqueMenu;
	private ProdutoMenu produtoMenu;
	private ServicoMenu servicoMenu;
	private VendaMenu vendaMenu;
	private int op;
	private int op2;
	private int op3;
//	private Scanner sc;

	public Sistema() {
		Util.criarDiretorioArquivo();
		this.animalMenu = new AnimalMenu();
		this.clienteMenu = new ClienteMenu();
		this.fornecedorMenu = new FornecedorMenu();
		this.funcionarioMenu = new FuncionarioMenu();
		this.estoqueMenu = new EstoqueMenu();
		this.produtoMenu = new ProdutoMenu();
		this.servicoMenu = new ServicoMenu();
		this.vendaMenu = new VendaMenu();
//		sc = new Scanner(System.in);
	}

	public void MenuPrincipal() {

		System.out.println("------Menu Principal------");
		System.out.println("1 - Alimentar Sistema");
		System.out.println("2 - Operações");
		System.out.println("0 - Sair");
		System.out.println("Digite sua opção");
		op = Util.receberInteiroDoScanner();
//		sc.nextLine();
	}

	public void iniciar() {

		System.out.println("Iniciando o Sistema...");
		do {
			MenuPrincipal();

			switch (op) {

			case 1:
				iniciarAlimentacao();
				break;
			case 2:
				iniciarOperacoes();
				break;
			case 0:
				System.out.println("Programa Encerrado !!!");
				return;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (op != 0);
	}

	private void MenuAlimentacao() {

		System.out.println("------Menu de Alimentação Interna------");
		System.out.println("1 - Cliente");
		System.out.println("2 - Funcionario");
		System.out.println("3 - Animal");
		System.out.println("4 - Fornecedor");
		System.out.println("5 - Produto");
		System.out.println("6 - Estoque");
		System.out.println("7 - Serviço");
		System.out.println("0 - Sair");
		System.out.println("Digite sua opção");
		op2 = Util.receberInteiroDoScanner();
//		sc.nextLine();
	}

	private void iniciarAlimentacao() {

		System.out.println("Iniciando Menu de Alimentação Interna");

		do {
			MenuAlimentacao();

			switch (op2) {

			case 1:
				clienteMenu.iniciar();
				break;
			case 2:
				funcionarioMenu.iniciar();
				break;
			case 3:
				animalMenu.iniciar();
				break;
			case 4:
				fornecedorMenu.iniciar();
				break;
			case 5:
				produtoMenu.iniciar();
				break;
			case 6:
				estoqueMenu.iniciar();
				break;
			case 7:
				servicoMenu.iniciar();
				break;
			case 0:
				System.out.println("Saindo do Menu Alimentação");
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (op2 != 0);
	}

	private void MenuOperacoes() {

		System.out.println("------Menu de Operações do Sistema------");
		System.out.println("1 - Venda");
		System.out.println("2 - Perstação de Serviço");
		System.out.println("0 - Sair");
		System.out.println("Digite sua opção");
		op3 = Util.receberInteiroDoScanner();
//		sc.nextLine();
	}

	private void iniciarOperacoes() {

		System.out.println("Iniciando Menu de Operações");

		do {
			MenuOperacoes();

			switch (op3) {

			case 1:
				vendaMenu.iniciar();
				break;

			case 0:
				System.out.println("Saindo Menu de Operações");
				break;

			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while (op3 != 0);
	}
}