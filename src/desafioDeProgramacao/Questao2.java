package desafioDeProgramacao;

import java.util.Scanner;


public class Questao2 {
	
	public static void main(String[] args){
	Scanner leia = new Scanner(System.in);
		
		boolean validaNumero = false;
	    boolean validaMaiuscula = false;
	    boolean validaMinuscula = false;
	    boolean validaSimbolo = false;
	    
	    
	    System.out.println("|_______REQUISITOS PARA CRIA��O DE SENHA_________|"+ "\n" +
	            "|* Possua no m�nimo 6 caracteres_________________|"+ "\n" +
	            "|* Contenha no m�nimo 1 digito___________________|"+ "\n" +
	            "|* Contenha no m�nimo 1 letra em min�sculo_______|" + "\n" +
	            "|* Contenha no m�nimo 1 letra em mai�sculo_______|" + "\n" +
	            "|* Contenha no m�nimo 1 caractere especial: _____|" + "\n" + "|(! @ # $ % ^ & * ( ) - + )______________________|" + "\n");
	    System.out.print("Crie a sua senha: ");
		String senha1 = leia.next();
		
		if (senha1.length() < 6) {
			
			System.out.print("Sua senha n�o atende aos requisitos de seguran�a com apenas " + (senha1.length()) + " caracteres. � necess�rio conter no minimo 6. Quantidade de caracteres que falta(m): " + (6 - senha1.length() + " caractere(s) \n"));
		}
		else {
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
		
		if(!validaNumero) {
			System.out.println("Coloque um n�mero na sua senha!");
		}
		if(!validaMaiuscula) {
			System.out.println("Coloque pelo menos uma letra Maiuscula!");
		}
		if(!validaMinuscula) {
			System.out.println("Coloque pelo menos uma letra Minuscula!");
		}
		if (!validaSimbolo) {
			System.out.println("Coloque pelo menos um caracter especial");
		}
		
		if(validaNumero && validaMaiuscula && validaMinuscula && validaSimbolo) {
			System.out.println("Senha validada com sucesso!");
		}
		
		
		leia.close();
	}

}



