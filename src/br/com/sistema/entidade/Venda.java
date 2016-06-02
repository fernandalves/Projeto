package br.com.sistema.entidade;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Venda {
	
	private int id;
	private Calendar dataVenda;
	private Cliente cliente;
	private Funcionario funcionario;
	private List<ItemProduto> item;
	
	public Venda(){
		id = GeradorCodigo.gerarCodigoVenda();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(Calendar dataVenda) {
		this.dataVenda = Calendar.getInstance();
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public List<ItemProduto> getItem() {
		return item;
	}

	public void setItem(ArrayList<ItemProduto> itens) {
		this.item = itens;
	}
	
	public String vendaParaArquivo() {

		String linha = String.valueOf(getId()) 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getCliente()
//				+ Constantes.SEPARADOR_ARQUIVO 
//				+ getItem().
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getFuncionario()
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getDataVenda());
		return linha;
	}
	
	@Override
	public String toString() {
		return "Venda \nID = " + id + "\ndataVenda = " + dataVenda + "\ncliente = " + cliente + "\nfuncionario = " + funcionario
				+ "\nitem = " + item;
	}

}
