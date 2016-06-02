package br.com.sistema.entidade;

import br.com.sistema.util.Constantes;
import br.com.sistema.util.GeradorCodigo;

public class Produto {

	private int id;
	private String nome;
	private String tipo;
	private Fornecedor fornecedor;
//	private boolean status;
	
	public Produto(){
		
		id = GeradorCodigo.gerarCodigoProduto();
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

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public String produtoParaArquivo() {

		String linha = String.valueOf(getId()) 
					   + Constantes.SEPARADOR_ARQUIVO 
					   + getNome()
					   + Constantes.SEPARADOR_ARQUIVO 
					   + getTipo() 
					   + Constantes.SEPARADOR_ARQUIVO 
					   + getFornecedor().getNome();
		return linha;

	}

	@Override
	public String toString() {
		return "Produto: \nid = " + id + "\nnome = " + nome + "\ntipo = " + tipo + "\nfornecedor = " + fornecedor;
	}
	
	
	
}
