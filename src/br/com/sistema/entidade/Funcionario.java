package br.com.sistema.entidade;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Funcionario extends Pessoa {

	private String login;
	private String senha;
	private String cargo;
	private int id;

	public Funcionario() {
		id = GeradorCodigo.gerarCodigoFuncionario();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String funcionarioParaArquivo() {
		String linha = String.valueOf(getId()) 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getNome() 
				+ Constantes.SEPARADOR_ARQUIVO
				+ getDocumento() 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getEndereco().getRua()
				+ Constantes.SEPARADOR_ARQUIVO
				+ getEndereco().getBairro() 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ String.valueOf(getEndereco().getNumero())
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getCargo() 
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getLogin()
				+ Constantes.SEPARADOR_ARQUIVO 
				+ getSenha();
		return linha;
	}

	

}
