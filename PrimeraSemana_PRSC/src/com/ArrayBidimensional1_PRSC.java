package com;

import java.util.Scanner;

public class ArrayBidimensional1_PRSC {

	public static void main(String[] args) {
		/*
		 * 1. Crea un programa que pida por pantalla cuatro países y a continuación tres 
		 * ciudades de cada uno de estos países. Los nombres de ciudades deben 
		 * almacenarse en un array multidimensional cuyo primer índice sea el 
		 * número asignado a cada país y el segundo índice el número asignado a 
		 * cada ciudad.
		 */

		String [][] tabla = new String [4][4];
		
		String país;
		String ciudad;
		
		Scanner entradap = new Scanner(System.in);
		Scanner entradac = new Scanner(System.in);
		
		for(int i=0;i<tabla.length;i++) {
		System.out.println("Ingresa el nombre de un país: ");
		país = entradap.nextLine();
		tabla[i][0]=país;
		System.out.println("Ingresa el nombre de 3 de sus ciudades:");
		for (int j=1; j<tabla.length;j++) {
			ciudad = entradac.nextLine();
			tabla[i][j]= ciudad;
		}
		}
				
			for (int a=0;a<tabla.length;a++) {
				System.out.print(tabla[a][0] + " ");
				for (int b=1; b<tabla.length;b++) {
					System.out.print(tabla[a][b] + " ");
			}
			System.out.println();
		
		
		}
	}

}
