package desafioDeProgramacao;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		boolean validaNumero = false;
		boolean validaMaiuscula = false;
		boolean validaMinuscula = false;
		boolean validaSimbolo = false;

		System.out.println("|_______REQUISITOS PARA CRIAÇÃO DE SENHA_________|" + "\n" +
				"|* Possua no mínimo 6 caracteres_________________|" + "\n" +
				"|* Contenha no mínimo 1 digito___________________|" + "\n" +
				"|* Contenha no mínimo 1 letra em minúsculo_______|" + "\n" +
				"|* Contenha no mínimo 1 letra em maiúsculo_______|" + "\n" +
				"|* Contenha no mínimo 1 caractere especial: _____|" + "\n"
				+ "|(! @ # $ % ^ & * ( ) - + )______________________|" + "\n");
		System.out.print("Crie a sua senha: ");
		String senha1 = leia.next();

		if (senha1.length() < 6) {

			System.out.print("Sua senha não atende aos requisitos de segurança com apenas " + (senha1.length())
					+ " caracteres. É necessário conter no minimo 6. Quantidade de caracteres que falta(m): "
					+ (6 - senha1.length() + " caractere(s) \n"));
		} else {
			for (char c : senha1.toCharArray()) {
				if (c >= '0' && c <= '9') {
					validaNumero = true;
				} else if (c >= 'A' && c <= 'Z') {
					validaMaiuscula = true;
				} else if (c >= 'a' && c <= 'z') {
					validaMinuscula = true;
				} else {
					validaSimbolo = true;
				}
			}
		}

		if (!validaNumero) {
			System.out.println("Coloque um número na sua senha!");
		}
		if (!validaMaiuscula) {
			System.out.println("Coloque pelo menos uma letra Maiúscula!");
		}
		if (!validaMinuscula) {
			System.out.println("Coloque pelo menos uma letra Minúscula!");
		}
		if (!validaSimbolo) {
			System.out.println("Coloque pelo menos um caracter especial");
		}

		if (validaNumero && validaMaiuscula && validaMinuscula && validaSimbolo) {
			System.out.println("Senha validada com sucesso!");
		}

		leia.close();
	}

}
