package br.com.sistema.menus;

import java.util.Scanner;
import br.com.sistema.bd.BdCliente;
import br.com.sistema.entidade.Cliente;
import br.com.sistema.util.Constantes;
import br.com.sistema.util.Util;

public class ClienteMenu {

	private BdCliente bd;
	private int op;
	private Scanner sc;

	public ClienteMenu() {
		this.bd = new BdCliente();
		this.sc = new Scanner(System.in);
	}

	private void menu() {

		System.out.println("------Menu Cliente------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar por CPF");
		System.out.println("3 - Buscar por CNPJ");
		System.out.println("4 - Listar por Nome");
		System.out.println("5 - Listar Todos");
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
				if (novoCliente()) {
					System.out.println("Cliente Cadastrado com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar Cliente");
				}
				break;
			case 2:
				
				System.out.println("Informe um CPF para busca:");
				String cpf = sc.nextLine();
				if (bd.buscarPorDocumento(cpf) == null) {
					System.out.println("Cliente não encontrado!");
				} else {
					System.out.println(bd.buscarPorDocumento(cpf));
				}
				break;
			case 3:
				System.out.println("Informe um CNPJ para busca:");
				String cnpj = sc.nextLine();
				if (bd.buscarPorDocumento(cnpj) == null) {
					System.out.println("Cliente não encontrado!");
				} else {
					System.out.println(bd.buscarPorDocumento(cnpj));
				}
				break;
			case 4:
				System.out.println("Digite o nome a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorNome(nome) != null) {
					System.out.println(bd.buscarPorNome(nome));
				} else {
					System.out.println("Cliente não existe!!");
				}
				break;
			case 5:
				for (Cliente cliente : bd.listarTodos()) {
					System.out.println(cliente);
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Cliente");
				break;
			default:
				System.out.println("Opção Inválida");
				break;
			}
		} while (op != 0);

	}

	private boolean novoCliente() {
		System.out.println("------Cadastrando um novo Cliente------");
		System.out.println("\n");		
		
		System.out.println("Digite o nome do Cliente:");
		String nome = sc.nextLine();
		if (nome.split(" ").length < 2) {
			System.out.println("Nome deve conter no mínimo Nome e Sobrenome.");
			return false;
		} 
		
		System.out.println("Pessoa Física ou Jurídica?");
		String docTipo = sc.nextLine();
		String documento;
		String tipo;
		if (docTipo.equalsIgnoreCase("FISICA")) {
			System.out.println("Digite o CPF:");
			documento = sc.nextLine();
			tipo = Constantes.FISICA;
		} else if (docTipo.equalsIgnoreCase("JURIDICA")) {
			System.out.println("Digite o CNPJ:");
			documento = sc.nextLine();
			tipo = Constantes.JURIDICA;
		} else {
			System.out.println("Tipo Inválido!!");
			return false;
		}
		
		System.out.println("Informe a Rua");
		String rua = sc.nextLine();
		
		System.out.println("Informe a Bairro");
		String bairro = sc.nextLine();
		
		int num;
		do{
		System.out.println("Informe o numero");
		num = Util.receberInteiroDoScanner();
		sc.nextLine();
		}while(num == -1);
		
		Cliente cliente = new Cliente();
		
		cliente.setNome(nome);
		cliente.setDocumento(documento);
		cliente.setTipo(tipo);
		cliente.getEndereco().setRua(rua);
		cliente.getEndereco().setBairro(bairro);
		cliente.getEndereco().setNumero(num);
		
		return bd.salvar(cliente);
	}

}
