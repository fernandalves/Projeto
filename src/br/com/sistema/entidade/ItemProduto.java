package br.com.sistema.entidade;

import java.util.Calendar;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class ItemProduto {

	private Calendar dataCompra;
	private int id;
	private Produto produto;
	private double precoCompra;
	private String dataValidade;
	private int quantidade;
	private double porcentagemVendaAtacado;
	private double porcentagemVendaVarejo;

	public ItemProduto() {

		id = GeradorCodigo.gerarCodigoItemProduto();
		dataCompra = Calendar.getInstance();
	}

	public Calendar getDataCompra() {
		return dataCompra;
	}

	public void setDataCompra(Calendar dataCompra) {
		this.dataCompra = dataCompra;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getPrecoCompra() {
		return precoCompra;
	}

	public void setPrecoCompra(double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPorcentagemVendaAtacado() {
		return porcentagemVendaAtacado;
	}

	public void setPorcentagemVendaAtacado(int porcentagemVendaAtacado) {
		this.porcentagemVendaAtacado = precoCompra + ((precoCompra * porcentagemVendaAtacado) / 100);
	}

	public double getPorcentagemVendaVarejo() {
		return porcentagemVendaVarejo;
	}

	public void setPorcentagemVendaVarejo(int porcentagemVendaVarejo) {
		this.porcentagemVendaVarejo = precoCompra + ((precoCompra * porcentagemVendaVarejo) / 100);
	}

	public String itemProdutoParaArquivo() {

		String linha = String.valueOf(getId())
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getProduto().getNome() 
				+ Constantes.SEPARADOR_ARQUIVO
				+ String.valueOf(getQuantidade())
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getPrecoCompra())
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getDataValidade()
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getDataCompra())
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getPorcentagemVendaAtacado())
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getPorcentagemVendaVarejo());
		return linha;
	}

	@Override
	public String toString() {
		return "ItemProduto: \nid = " + id + "\nproduto = " + produto + "\ndataCompra = " + dataCompra
				+ "\nprecoCompra = " + precoCompra + "\ndataValidade = " + dataValidade + "\nquantidade = " + quantidade
				+ "\nporcentagemVendaAtacado = " + porcentagemVendaAtacado + "\nporcentagemVendaVarejo = "
				+ porcentagemVendaVarejo;
	}

}
