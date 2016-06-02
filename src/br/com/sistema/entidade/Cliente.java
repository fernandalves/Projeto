package br.com.sistema.entidade;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Cliente extends Pessoa {

	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Cliente() {
		id = GeradorCodigo.gerarCodigoCliente();
	}

	public String clienteParaArquivo() {

		String linha = String.valueOf(getId()) 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getNome() 
				+ Constantes.SEPARADOR_ARQUIVO
				+ getDocumento() 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getTipo() 
				+ Constantes.SEPARADOR_ARQUIVO
				+ getEndereco().getRua() 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getEndereco().getBairro()
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getEndereco().getNumero());
		return linha;
	}

}
