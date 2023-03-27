package com;

import java.util.Scanner;

public class Ciclos11_RICG {

	public static void main(String[] args) {
		//11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
		//ancho y el alto. Ejemplo: 8 x 8
		
		
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		System.out.println("Introduce el numero de filas ");
		n1 = entrada.nextInt();
		System.out.println("Introduce el numero de collumnas");
		n2 = entrada.nextInt();
	 
		for(int i=0; i<n1; i++) {
			for(int j=0; j<n2; j++) {
				System.out.println("*");
				
			}
			
			System.out.println("");
		}
	
	
	}

	}

