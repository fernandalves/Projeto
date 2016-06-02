package br.com.sistema.menus;

import java.util.Scanner;

import br.com.sistema.bd.BdAnimal;
import br.com.sistema.entidade.Animal;
import br.com.sistema.util.Util;

public class AnimalMenu {

	private BdAnimal bd;
	private int op;
	private Scanner sc;

	public AnimalMenu() {
		this.bd = new BdAnimal();
		sc = new Scanner(System.in);
	}

	private void menu() {

		System.out.println("------Menu Animal------");
		System.out.println("1 - Cadastrar");
		System.out.println("2 - Listar por Nome");
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
				if (novoAnimal()) {
					System.out.println("Animal Salvo com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar um Animal");
				}
				break;
			case 2:
				System.out.println("Digite o nome a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorNome(nome) != null) {
					System.out.println(bd.buscarPorNome(nome));
				} else {
					System.out.println("Animal não existe!!");
				}
				break;
			case 3:
				for (Animal animal : bd.listarTodos()) {
					System.out.println(animal.getNome());
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Animal !");
				return;
			default:
				System.out.println("Opção Inválida!!");
				break;
			}
		} while (op != 0);

	}

	private boolean novoAnimal() {
		System.out.println("------Cadastrando um novo Animal------");
		System.out.println("\n");

		System.out.println("Digite o nome do animal:");
		String nome = sc.nextLine();

		// System.out.println("DONO");

		System.out.println("Informe a Especie:");
		String especie = sc.nextLine();

		System.out.println("Informe a Raça:");
		String raca = sc.nextLine();

		System.out.println("Informe a Cor:");
		String cor = sc.nextLine();

		System.out.println("Informe o Sexo:");
		String sexo = sc.nextLine();

		System.out.println("Informe a Data de Nascimento:");
		String dtNascimento = sc.nextLine();

		System.out.println("Informe a Observação sobre o Animal:");
		String obs = sc.nextLine();

		Animal animal = new Animal();

		animal.setNome(nome);
		animal.setEspecie(especie);
		animal.setRaca(raca);
		animal.setCor(cor);
		animal.setSexo(sexo);
		animal.setDataNascimento(dtNascimento);
		animal.setObs(obs);

		return bd.salvar(animal);
	}

}
