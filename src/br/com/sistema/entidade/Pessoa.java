package br.com.sistema.entidade;

import java.util.ArrayList;

public class Pessoa {


	private String nome;
	private String documento;
	private String tipo;
	// private boolean status;
	private Endereco endereco;
	private ArrayList<Contato> contatos;

	public Pessoa() {
		// status true;
		endereco = new Endereco();
		contatos = new ArrayList<Contato>();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public ArrayList<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(ArrayList<Contato> contatos) {
		this.contatos = contatos;
	}

	public String toString() {
		return "nome = " + nome + "\n documento = " + documento + "\n tipo = " + tipo + "\n";
	}
}
