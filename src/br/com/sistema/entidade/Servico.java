package br.com.sistema.entidade;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Servico {

	private int id;
	private String descricao;
	private double preco;

	public Servico() {
		id = GeradorCodigo.gerarCodigoServico();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String servicoParaArquivo() {

		String linha = String.valueOf(getId()) 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getDescricao()
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getPreco());
		return linha;

	}

	@Override
	public String toString() {
		return "Serviço: \nid = " + id + "\ndescricao = " + descricao + "\npreco = " + preco + "\n";
	}
}
