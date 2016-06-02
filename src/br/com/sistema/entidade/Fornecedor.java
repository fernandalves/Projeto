package br.com.sistema.entidade;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Fornecedor extends Pessoa {

	private String inscricaoEstadual;
	private int id;

	public String getInscricaoEstadual() {
		return inscricaoEstadual;
	}

	public void setInscricaoEstadual(String inscricaoEstadual) {
		this.inscricaoEstadual = inscricaoEstadual;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Fornecedor(){
		id = GeradorCodigo.gerarCodigoFornecedor();
	}
	
	public String fornecedorParaArquivo() {

		String linha = String.valueOf(getId())
				+ Constantes.SEPARADOR_ARQUIVO
				+ getNome()
				+ Constantes.SEPARADOR_ARQUIVO
				+ getDocumento()
				+ Constantes.SEPARADOR_ARQUIVO
				+ getInscricaoEstadual()
				+ Constantes.SEPARADOR_ARQUIVO
				+ getEndereco().getRua()
				+ Constantes.SEPARADOR_ARQUIVO
				+ getEndereco().getBairro()
				+ Constantes.SEPARADOR_ARQUIVO
				+ String.valueOf(getEndereco().getNumero());
		return linha;
	}

	

}
