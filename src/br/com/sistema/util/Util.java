package br.com.sistema.util;

import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Util {

	static Scanner sc = new Scanner(System.in);

	public static int receberInteiroDoScanner() {

		try {
			return sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Informe apenas numeros");
			sc.nextLine();
			return -1;
		}
	}
	
	public static double receberDoubleDoScanner() {

		try {
			return sc.nextDouble();
		} catch (InputMismatchException e) {
			System.out.println("Informe apenas numeros");
			sc.nextLine();
			return -1;
		}
	}

	// public static int converterStringParaOp(String valor) {
	//
	// try {
	// return Integer.parseInt(valor);
	// } catch (NumberFormatException e) {
	// System.out.println("Informe apenas numeros");
	// return -1;
	// }
	// }

	public static void criarDiretorioArquivo() {
		String diretorio = Constantes.DIRETORIO_ARQUIVO;
		File file = new File(diretorio);
		if (!file.isDirectory()) {
			file.mkdirs();
		}
	}
}
