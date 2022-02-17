package desafioDeProgramacao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {

		String texto;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um texto qualquer : ");
		texto = leia.nextLine();

		anagrama(texto);
	}

	static void anagrama(String texto) {

		HashMap<String, Integer> caracteresColocados = new HashMap<>();

		for (int i = 0; i <= texto.length(); i++) {

			for (int j = i; j < texto.length(); j++) {

				char[] caracteres = texto.substring(i, j + 1).toCharArray();
				Arrays.sort(caracteres);

				String subCaracteres = new String(caracteres);

				if (caracteresColocados.containsKey(subCaracteres)) {
					caracteresColocados.put(subCaracteres, caracteresColocados.get(subCaracteres) + 1);
				} else {
					caracteresColocados.put(subCaracteres, 1);
				}
			}
		}

		int contaPares = 0;

		for (String cont : caracteresColocados.keySet()) {

			int n = caracteresColocados.get(cont);
			contaPares += (n * (n - 1)) / 2;
		}
		System.out.print("Existem " + contaPares + " anagramas nesse texto!");
	}

}
