package com;

import java.util.Scanner;

public class Cilos11_EVVC {

	public static void main(String[] args) {
		/* Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		 * ancho y el alto. Ejemplo: 8 x 8
		 */
		
		int lado;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa el valor que tendra de ancho y alto tu cuadrado");
		lado=entrada.nextInt();
		
		for(int i=0 ; i<lado ; i++) {
			System.out.println();
			for (int j=0 ; j<lado ; j++) {
				System.out.print("+ ");
			}
		}
		

	}

}
