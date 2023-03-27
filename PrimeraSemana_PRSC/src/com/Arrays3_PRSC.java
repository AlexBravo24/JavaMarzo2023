package com;

import java.util.Scanner;

public class Arrays3_PRSC {

	public static void main(String[] args) {
		
		/*3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
		 * caracteres.
		 */
		
		String frase;
		char [] letras;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese una frase:");
		frase = entrada.nextLine();
		letras=frase.toCharArray();
		
		for (int i=0; i<letras.length; i++) {
			System.out.println(letras[i]);
		}
		
		
	}
}
