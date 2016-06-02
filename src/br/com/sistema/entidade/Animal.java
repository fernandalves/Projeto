package br.com.sistema.entidade;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Animal {

	private int id;
	private String nome;
	// private String nomeDono;
	private String raca;
	private String especie;
	private String cor;
	private String sexo;
	private String dataNascimento;
	private String obs;

	public Animal() {
		id = GeradorCodigo.gerarCodigoAnimal();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public String animalParaArquivo() {
		
		String linha = String.valueOf(getId())
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getNome()
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getEspecie()
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getRaca()
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getCor()
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getSexo()
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getDataNascimento()
				 + Constantes.SEPARADOR_ARQUIVO 
				 + getObs();
		return linha;
		// colocar dono tbm no arquivo
	}

	@Override
	public String toString() {
		return "Animal: \nid = " + id + "\nnome = " + nome + "\nraca = " + raca + "\nespecie = " + especie + "\ncor = "
				+ cor + "\nsexo = " + sexo + "\ndataNascimento = " + dataNascimento + "\nobs = " + obs;
	}

}
