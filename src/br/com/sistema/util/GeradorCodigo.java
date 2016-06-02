package br.com.sistema.util;

public class GeradorCodigo {

	private static int codigoAnimal = 0;
	private static int codigoCliente = 0;
	private static int codigoFornecedor = 0;
	private static int codigoFuncionario = 0;
	private static int codigoItemProduto = 0;
	private static int codigoProduto = 0;
	private static int codigoServico = 0;
	private static int codigoVenda = 0;
	
	public static int gerarCodigoAnimal() {

		codigoAnimal++;

		return codigoAnimal;
	}

	public static int gerarCodigoCliente() {

		codigoCliente++;

		return codigoCliente;
	}

	public static int gerarCodigoFornecedor() {

		codigoFornecedor++;

		return codigoFornecedor;
	}

	public static int gerarCodigoFuncionario() {

		codigoFuncionario++;

		return codigoFuncionario;
	}

	public static int gerarCodigoItemProduto() {

		codigoItemProduto++;

		return codigoItemProduto;
	}

	public static int gerarCodigoProduto() {

		codigoProduto++;

		return codigoProduto;
	}

	public static int gerarCodigoServico() {

		codigoServico++;

		return codigoServico;
	}
	
	public static int gerarCodigoVenda() {

		codigoVenda++;

		return codigoVenda;
	}

}
