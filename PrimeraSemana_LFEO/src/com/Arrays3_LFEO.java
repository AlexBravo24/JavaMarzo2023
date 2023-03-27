package com;

import java.util.Scanner;

public class Arrays3_LFEO {
	/*
	 * Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
        caracteres.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String frase;
		
		System.out.println("INGRESA UNA FRASE: ");
		frase = entrada.nextLine();
		
		char [] caracteres = new char[frase.length()];
		
		for(int i=0; i<frase.length(); i++) {
			caracteres[i] = frase.charAt(i);
			System.out.println( caracteres[i]);
		}
		

	}

}
