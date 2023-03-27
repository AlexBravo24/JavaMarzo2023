package com;

import java.util.Scanner;

public class Ciclos11_LARZ {

	public static void main(String[] args) {
		// 11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el
		//ancho y el alto. Ejemplo: 8 x 8 
		System.out.println("Programa que dibuja un cuadrante introduciendo el ancho y alto del mismo");
		System.out.println();
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Introduce el número de Filas: ");
		int fila= sc.nextInt();
		System.out.println("Introduce el número de Columnas: ");
		int columna= sc.nextInt();
		System.out.println();
		
		for (int i=0; i<fila; i++) {
			
			for (int j=0; j<columna; j++) {
				System.out.print("*");
			} System.out.println();
		}


	}

}
