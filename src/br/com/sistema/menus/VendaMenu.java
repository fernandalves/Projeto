package br.com.sistema.menus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.sistema.bd.BdCliente;
import br.com.sistema.bd.BdFuncionario;
import br.com.sistema.bd.BdItemProduto;
import br.com.sistema.bd.BdVenda;
import br.com.sistema.entidade.Cliente;
import br.com.sistema.entidade.Funcionario;
import br.com.sistema.entidade.ItemProduto;
import br.com.sistema.entidade.Produto;
import br.com.sistema.entidade.Venda;
import br.com.sistema.util.Util;

public class VendaMenu {

	private BdVenda bd;
	private BdItemProduto bdItem;
	private BdCliente bdCliente;
	private BdFuncionario bdFuncionario;
	private int op;
	private Scanner sc;

	public VendaMenu() {
		this.bd = new BdVenda();
		this.sc = new Scanner(System.in);
	}

	private void menu() {

		System.out.println("------Menu Venda------");
		System.out.println("1 - Realizar Venda");
		System.out.println("2 - Buscar Venda");
		System.out.println("3 - Editar Venda");
		System.out.println("4 - Apaguar Venda");
		System.out.println("0 - Sair");
		System.out.println("Digite sua opção");
		op = Util.receberInteiroDoScanner();
		// sc.nextLine();
	}

	public void iniciar() {
		do {
			menu();

			switch (op) {

			case 1:
				if (novaVenda()) {
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

	private boolean novaVenda() {
		System.out.println("------Realizando uma nova Venda------");
		System.out.println("\n");
		String nome;
		
		System.out.println("Digite o nome do Funcionario:");
		nome = sc.nextLine();
		
		List<Funcionario> lista = bdFuncionario.buscarPorNome(nome);

		if (!lista.isEmpty()) {
			for (Funcionario f : lista)
				System.out.println(f.getId() + " - " + f.getNome());
		} else {
			return false;
		}
		int cod;
		do {
			System.out.println("Informe o codigo do Funcionario:");
			cod = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (cod == -1);
		Funcionario funcionario = bdFuncionario.buscarPorCodigo(cod);
		if (funcionario == null) {
			System.out.println("Funcionario não existe!");
			return false;
		}
		
		System.out.println("Digite o nome do Cliente:");
		nome = sc.nextLine();
		
		List<Cliente> lista1 = bdCliente.buscarPorNome(nome);

		if (!lista1.isEmpty()) {
			for (Cliente c : lista1)
				System.out.println(c.getId() + " - " + c.getNome());
		} else {
			return false;
		}
		int cod1;
		do {
			System.out.println("Informe o codigo do Cliente:");
			cod = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (cod1 == -1);
		Cliente cliente = bdCliente.buscarPorCodigo(cod1);
		if (cliente == null) {
			System.out.println("Cliente não existe!");
			return false;
		}
		
		ArrayList<ItemProduto> itens = new ArrayList<ItemProduto>();
		ItemProduto item ;
		item = adicionarProdutos();
		if( item == null){
			System.out.println("Não existe item, compra encerrada.");
			return false;
		}
		itens.add(item);
		
		String o;
		do{
		System.out.println("Deseja adicionar mais algum item? (S/N)");
		o = sc.nextLine();
		if(o.equalsIgnoreCase("S") || o.equalsIgnoreCase("SIM")){
			item = adicionarProdutos();
			if( item == null){
				System.out.println("Não existe item, compra encerrada.");
				return false;
			}
			itens.add(item);
		}
		}while(o.equalsIgnoreCase("N")||o.equalsIgnoreCase("NAO"));
		
		
		
		Venda venda = new Venda();
		
		venda.setCliente(cliente);
		venda.setFuncionario(funcionario);
		venda.setItem(itens);
		
		return bd.salvar(venda);
	}

	private ItemProduto adicionarProdutos() {

		System.out.println("Digite o nome do Item:");
		String nome = sc.nextLine();

		List<ItemProduto> lista = bdItem.buscarPorNome(nome);

		if (!lista.isEmpty()) {
			for (ItemProduto i : lista)
				System.out.println(i.getId() + " - " + i.getProduto().getNome());
		} else {
			return null;
		}
		int cod;
		do {
			System.out.println("Informe o codigo do Item:");
			cod = Util.receberInteiroDoScanner();
			sc.nextLine();
		} while (cod == -1);
		ItemProduto item = bdItem.buscarPorCodigo(cod);
		if (item == null) {
			System.out.println("Item não existe!");
			return null;
		}

		return item;
	}

}
