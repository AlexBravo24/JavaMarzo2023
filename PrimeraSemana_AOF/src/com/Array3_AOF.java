package com;

import java.util.Scanner;

public class Array3_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

//		Pide al usuario por teclado una frase y pasa sus caracteres a un array de 
//		caracteres.
		String frase;
		char[] letras;
		System.out.println("Introduce una frase");
		frase = entrada.nextLine();
		
		letras = frase.toCharArray();
		for(int i=0; i<letras.length;i++) {
			System.out.println("La letra  "+letras[i]+"  esta en la posicion  "+i);
		
		
		
	}
	}
}

