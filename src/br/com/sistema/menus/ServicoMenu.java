package br.com.sistema.menus;

import java.util.Scanner;
import br.com.sistema.bd.BdServico;
import br.com.sistema.entidade.Servico;
import br.com.sistema.util.Util;

public class ServicoMenu {
	
	private BdServico bd;
	private int op;
	private Scanner sc;

	public ServicoMenu(){
		this.bd = new BdServico();
		sc = new Scanner(System.in);
	}
	
	private void menu() {

		System.out.println("------Menu Servi�o------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Buscar Servi�o");
		System.out.println("3 - Listar Todos");
		System.out.println("0 - Sair");
		System.out.println("Digite sua op��o");
		op = Util.receberInteiroDoScanner();
//		sc.nextLine();
	}
	
	public void iniciar() {
		do {
			menu();

			switch (op) {

			case 1:
				if (novoServico()) {
					System.out.println("Servi�o Salvo com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar um Servi�o");
				}
				break;
			case 2:
				System.out.println("Digite o nome a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorNome(nome) != null) {
					System.out.println(bd.buscarPorNome(nome));
				} else {
					System.out.println("Servi�o n�o existe!!");
				}
				break;
			case 3:
				for (Servico servico : bd.listarTodos()) {
					System.out.println(servico.getDescricao());
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Servi�o !");
				return;
			default:
				System.out.println("Op��o Inv�lida!!");
				break;
			}
		} while (op != 0);
		
	}

	private boolean novoServico() {
		System.out.println("------Cadastrando um novo Servi�o------");
		System.out.println("\n");

		System.out.println("Digite o nome do Servi�o:");
		String nome = sc.nextLine();

	
		double preco;
		do {
			System.out.println("Digite o pre�o do Servi�o");
			preco = Util.receberDoubleDoScanner();
			sc.nextLine();
		} while (preco == -1);
		 

		Servico servico = new Servico();

		servico.setDescricao(nome);
		servico.setPreco(preco);

		return bd.salvar(servico);
	}

}
