package br.com.sistema.bd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import br.com.sistema.entidade.Animal;
import br.com.sistema.util.Constantes;

public class BdAnimal {

	private ArrayList<Animal> animais;
	private BufferedWriter bw;
	private BufferedReader br;

	public BdAnimal() {
		abrirArquivo();
		this.animais = new ArrayList<Animal>();
		converterArquivoParaLista();
	}

	private void converterArquivoParaLista() {
		abrirArquivo();
		String linha;
		try {
			linha = br.readLine();
			while (linha != null) {
				Animal a = converterlinhaParaAnimal(linha);
				animais.add(a);
				linha = br.readLine();
			}
			br.close();

		} catch (IOException e) {
			System.out.println("Problema ao converter Arquivo para Lista");
			e.printStackTrace();
		}

	}

	private Animal converterlinhaParaAnimal(String linha) {
		Animal animal = new Animal();
		try {
			String animalLinha[] = linha.split(Constantes.SEPARADOR_ARQUIVO);
			animal.setId(Integer.parseInt(animalLinha[0]));
			animal.setNome(animalLinha[1]);
			animal.setEspecie(animalLinha[2]);
			animal.setRaca(animalLinha[3]);
			animal.setCor(animalLinha[4]);
			animal.setSexo(animalLinha[5]);
			animal.setDataNascimento(animalLinha[6]);
			animal.setObs(animalLinha[7]);
		} catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("Erro ao converte linha para Animal");
			System.exit(0);
		}
		return animal;

	}

	private void abrirArquivo() {
		try {
			bw = new BufferedWriter(new FileWriter(Constantes.ARQUIVO_ANIMAL, true));
			br = new BufferedReader(new FileReader(Constantes.ARQUIVO_ANIMAL));
		} catch (IOException e) {
			System.out.println("Problema ao Abrir Arquivo");
			e.printStackTrace();
			System.exit(0);
		}
	}

	private boolean salvarAnimalNoArquivo(Animal animal) {

		try {
			abrirArquivo();
			bw.write(animal.animalParaArquivo());
			bw.newLine();
			bw.flush();
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar animal no Arquivo");
			System.exit(0);
		}
		return true;
	}

	public boolean salvar(Animal animal) {
		try {
			if (isExistePorNome(animal)) {
				this.animais.add(animal);
				return salvarAnimalNoArquivo(animal);
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao salvar animal");
			System.exit(0);
		}
		return false;
	}

	private boolean isExistePorNome(Animal animal) {
		try {
			for (Animal a : listarTodos()) {
				if (a.getNome().equalsIgnoreCase(animal.getNome())) {
					return false;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao Verificar se animal existe");
			System.exit(0);
		}
		return true;
	}

	public List<Animal> buscarPorNome(String nome) {
		List<Animal> lista = new ArrayList<Animal>();
		try {
			for (Animal animal : listarTodos()) {
				if (animal.getNome().contains(nome)) {
					lista.add(animal);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao buscar Animal por Nome");
			System.exit(0);
		}
		return lista;
	}

	public ArrayList<Animal> listarTodos() {
		return this.animais;
	}

}
