package br.com.sistema.menus;

import java.util.Scanner;

import br.com.sistema.bd.BdFuncionario;
import br.com.sistema.entidade.Funcionario;
import br.com.sistema.util.Constantes;
import br.com.sistema.util.Util;

public class FuncionarioMenu {

	private BdFuncionario bd;
	private int op;
	private Scanner sc;

	public FuncionarioMenu() {
		this.sc = new Scanner(System.in);
		this.bd = new BdFuncionario();
	}

	private void menu() {
		System.out.println("------Menu Funcionario------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar por CPF");
		System.out.println("3 - Listar por Nome");
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
				if (novoFornecedor()) {
					System.out.println("Funcionario Salvo com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar um Funcinario");
				}
				break;
			case 2:
				System.out.println("Informe um CPF para busca:");
				String cpf = sc.nextLine();
				if (bd.buscarPorDocumento(cpf) == null) {
					System.out.println("Funcionario não encontrado!");
				} else {
					System.out.println(bd.buscarPorDocumento(cpf));
				}
				break;
			case 3:
				System.out.println("Digite o nome a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorNome(nome) != null) {
					System.out.println(bd.buscarPorNome(nome));
				} else {
					System.out.println("Funcionario não existe!!");
				}
				break;
			case 4:
				for (Funcionario funcionario : bd.listarTodos()) {
					System.out.println(funcionario.getNome());
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Funcionario !");
				return;
			default:
				System.out.println("Opção Inválida!!");
				break;
			}
		} while (op != 0);

	}

	private boolean novoFornecedor() {
		System.out.println("------Cadastrando um novo Funcionario------");
		System.out.println("\n");

		System.out.println("Digite o nome do Funcionario:");
		String nome = sc.nextLine();
		if (nome.split(" ").length < 2) {
			System.out.println("Nome deve conter no mínimo Nome e Sobrenome.");
			return false;
		}

		System.out.println("Digite o CPF:");
		String documento = sc.nextLine();

		String tipo = Constantes.FISICA;

		System.out.println("Informe a Rua");
		String rua = sc.nextLine();

		System.out.println("Informe a Bairro");
		String bairro = sc.nextLine();

		int num;
		do {
			System.out.println("Informe o numero");
			num = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (num == -1);

		Funcionario funcionario = new Funcionario();

		funcionario.setNome(nome);
		funcionario.setDocumento(documento);
		funcionario.setTipo(tipo);
		funcionario.getEndereco().setRua(rua);
		funcionario.getEndereco().setBairro(bairro);
		funcionario.getEndereco().setNumero(num);

		return bd.salvar(funcionario);
	}

}
