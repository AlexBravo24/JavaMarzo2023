package com;

import java.util.Scanner;

public class Ciclos11_LFEO {
	/*
	 * 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
       ancho y el alto. Ejemplo: 8 x 8
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int ancho, alto;
		
		System.out.println("INTRODUCIR ALTO DE CUADRADO: ");
		alto = entrada.nextInt();
		System.out.println("INTRODUCIR ANCHO DE CUADRADO: ");
		ancho = entrada.nextInt();
		
		
		for(int i=0; i<alto; i++) {
			System.out.println();
			for(int j=0; j<ancho; j++) {
				System.out.print("*");
			}
			
		}
		

	}

}
