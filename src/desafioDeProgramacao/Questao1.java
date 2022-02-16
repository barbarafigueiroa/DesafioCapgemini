package desafioDeProgramacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		List<String> degraus = new ArrayList<>();

		 

		System.out.print("Digite um número para formar uma escada: ");
		int numDegraus = leia.nextInt();

		 

		for (int i = 0; i < numDegraus; i++) {
		degraus.add(" ".repeat(numDegraus - i) + "*".repeat(i + 1));
		}

		 

		for (String d : degraus ) {
		System.out.println(d);
		}
		
		leia.close();

	}

}
