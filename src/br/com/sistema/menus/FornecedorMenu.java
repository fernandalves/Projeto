package br.com.sistema.menus;

import java.util.Scanner;
import br.com.sistema.bd.BdFornecedor;
import br.com.sistema.entidade.Fornecedor;
import br.com.sistema.util.Constantes;
import br.com.sistema.util.Util;

public class FornecedorMenu {

	private BdFornecedor bd;
	int op;
	private Scanner sc;

	public FornecedorMenu() {
		this.sc = new Scanner(System.in);
		this.bd = new BdFornecedor();
	}

	private void menu() {
		System.out.println("------Menu Fornecedor------");
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
				if (novoFornecedor()) {
					System.out.println("Fornecedor Salvo com Sucesso");
					return;
				} else {
					System.out.println("Problema ao Cadastrar um Fornecedor");
				}
				break;
			case 2:
				System.out.println("Digite CNPJ a ser buscado:");
				String nome = sc.nextLine();
				if (bd.buscarPorCnpj(nome) != null) {
					System.out.println(bd.buscarPorCnpj(nome));
				} else {
					System.out.println("Fornecedor não existe!!");
				}
				break;
			case 3:
				for (Fornecedor fornecedor : bd.listarTodos()) {
					System.out.println(fornecedor.getNome());
				}
				break;
			case 0:
				System.out.println("Saindo do Menu Fornecedor !");
				return;
			default:
				System.out.println("Opção Inválida!!");
				break;
			}
		} while (op != 0);
	}

	private boolean novoFornecedor() {
		System.out.println("------Cadastrando um novo Fornecedor------");
		System.out.println("\n");		
		
		System.out.println("Digite o nome do Fornecedor:");
		String nome = sc.nextLine();
		
		System.out.println("Digite o CNPJ:");
		String documento = sc.nextLine();
		
		String tipo = Constantes.JURIDICA;
		
		System.out.println("Informe a Inscrição Estadual:");
		String inscricao = sc.nextLine();
		
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
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome(nome);
		fornecedor.setDocumento(documento);
		fornecedor.setTipo(tipo);
		fornecedor.setInscricaoEstadual(inscricao);
		fornecedor.getEndereco().setRua(rua);
		fornecedor.getEndereco().setBairro(bairro);
		fornecedor.getEndereco().setNumero(num);
		
		return bd.salvar(fornecedor);
	}

}
