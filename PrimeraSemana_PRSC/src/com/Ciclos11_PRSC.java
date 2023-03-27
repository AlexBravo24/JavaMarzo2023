package com;

import java.util.Scanner;

public class Ciclos11_PRSC {

	public static void main(String[] args) {
		/*
		 * 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		 * ancho y el alto. Ejemplo: 8 x 8
		 */

		int al;
		int an;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el Alto:");
		al = entrada.nextInt();
		System.out.println("Ingresa el Ancho:");
		an = entrada.nextInt();
		
		for (int i=0; i<al; i++) {
			System.out.println();
			for (int j=0; j<an; j++) {
				System.out.print("+");
			}
		}
		
		
	}

}
