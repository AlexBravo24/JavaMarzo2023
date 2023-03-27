package com;

import java.util.Scanner;

public class Arrays3_EVVC {

	public static void main(String[] args) {
		//Pide al usuario por teclado una frase y pasa sus caracteres a un array de caracteres.

		String frase;
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese una frase");
		frase=entrada.nextLine();
		
		char [] letras = new char[frase.length()];
		
		
		//letras = frase.toCharArray();// convierte string en char 
		
		for (int i=0 ; i<frase.length();i++) {
			letras[i] = frase.charAt(i);
			System.out.println("La letra "+ letras [i]+" esta en la posición " +i);
			
		}
	System.out.println(letras);
		
		
		
	}

}
