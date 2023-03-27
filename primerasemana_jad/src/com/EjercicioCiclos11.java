package com;

import java.util.Scanner;

public class EjercicioCiclos11 {

	public static void main(String[] args) {
		int filas,col;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el número de filas:");
		filas=entrada.nextInt();
		System.out.println("introduzca el número de columnas:");
		col=entrada.nextInt();
		for(int i=0;i<filas;i++) {
			
			for(int j=0;j<col;j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
