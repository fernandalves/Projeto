package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import br.com.sistema.entidade.Cliente;
import br.com.sistema.util.Constantes;

public class BdCliente {

	private ArrayList<Cliente> clientes;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdCliente() {
		abrirArquivo();
		this.clientes = new ArrayList<Cliente>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				Cliente c = converterlinhaParaCliente(linha);
				clientes.add(c);
				linha = br.readLine();
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}
	}

	private Cliente converterlinhaParaCliente(String linha) {
		Cliente cliente = new Cliente();
		try {
			String clienteLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			cliente.setId(Integer.parseInt(clienteLinha[0]));
			cliente.setNome(clienteLinha[1]);
			cliente.setDocumento(clienteLinha[2]);
			cliente.setTipo(clienteLinha[3]);
			cliente.getEndereco().setRua(clienteLinha[4]);
			cliente.getEndereco().setBairro(clienteLinha[5]);
			cliente.getEndereco().setNumero(Integer.parseInt(clienteLinha[6]));
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao converte linha para Cliente");
			System.exit(0);
		}
		return cliente;
	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_CLIENTE, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_CLIENTE));
		} catch (IOException e) {
			System.out.println("Problema ao Abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private boolean salvarClienteNoArquivo(Cliente cliente) {
		try {
			abrirArquivo();
			bw.write(cliente.clienteParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar cliente no Arquivo");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(Cliente cliente) {
		try {
			if (validarCliente(cliente)) {
				this.clientes.add(cliente);
				return salvarClienteNoArquivo(cliente);
			}
		} catch (Exception e) {
			System.out.println("Problema ao Salvar Cliente");
			e.printStackTrace();
			System.exit(0);
		}
		return false;
	}

	private boolean validarCliente(Cliente cliente) {
		try {
			if (cliente.getNome().split(" ").length < 2) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Problema ao validar Cliente pelo tamanho do nome");
			e.printStackTrace();
			System.exit(0);
		}
		try {
			if (cliente.getTipo().equalsIgnoreCase("FÍSICA")) {
				validarCpf(cliente.getDocumento());
			}
			if (cliente.getTipo().equalsIgnoreCase("JURÍDICA")) {
				validarCnpj(cliente.getDocumento());
			}
		} catch (Exception e) {
			System.out.println("Problema ao validar Cliente pelo tipo");
			e.printStackTrace();
			System.exit(0);
		}
		try {
			if (buscarPorDocumento(cliente.getDocumento()) != null) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Problema ao validar Cliente pelo documento");
			e.printStackTrace();
			System.exit(0);
		}

		return true;
	}

	public Cliente buscarPorDocumento(String documento) {
		try {
			for (Cliente cliente : clientes) {
				if (cliente.getDocumento().equalsIgnoreCase(documento)) {
					return cliente;
				}
			}
		} catch (Exception e) {
			System.out.println("Problema ao buscar Cliente pelo Documento");
			e.printStackTrace();
			System.exit(0);
		}
		return null;
	}

	public boolean validarCpf(String cpf) {
		try {
			if (cpf.equals("111.111.111-11") || cpf.equals("222.222.222-22")) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Problema ao validar Cpf");
			e.printStackTrace();
			System.exit(0);
		}

		return true;
	}

	public boolean validarCnpj(String cnpj) {
		try {
			if (cnpj.equals("11.111.111/0001-11")) {
				return false;
			}
		} catch (Exception e) {
			System.out.println("Problema ao validar Cnpj");
			e.printStackTrace();
			System.exit(0);
		}
		return true;
	}

	public List<Cliente> buscarPorNome(String nome) {
		List<Cliente> lista = new ArrayList<Cliente>();
		try {
			for (Cliente cliente : listarTodos()) {
				if (cliente.getNome().contains(nome)) {
					lista.add(cliente);
				}
			}
		} catch (Exception e) {
			System.out.println("Problema ao buscar Cliente pelo nome");
			e.printStackTrace();
			System.exit(0);
		}
		return lista;
	}

	public Cliente buscarPorCodigo(int busca) {
		try {
			for (Cliente c : clientes) {
				if (c.getId() == busca) {
					return c;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro buscar cliente por Código ");
			System.exit(0);
		}
		return null;
	}
	public ArrayList<Cliente> listarTodos() {
		return this.clientes;
	}

}
