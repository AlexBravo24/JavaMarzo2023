package com;

import java.util.Scanner;

public class ArrayBidimensional1_LARZ {

	public static void main(String[] args) {
		//
		/*1. Crea un programa que pida por pantalla cuatro pa�ses y a continuaci�n tres
			ciudades de cada uno de estos pa�ses. Los nombres de ciudades deben
			almacenarse en un array multidimensional cuyo primer �ndice sea el
			n�mero asignado a cada pa�s y el segundo �ndice el n�mero asignado a
			cada ciudad.
		 * 
		 */
		String [] pais= new String [4];
		String [][] ciudad= new String [4][3];
		int n=0,numero=1;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("Escribe el "+numero+" pais: ");
			pais [n]= sc.nextLine();
			n++;
			numero++;
		}while (n<4);
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Introduce una ciudad del pais "+ pais [i]);
				Scanner sc2=new Scanner(System.in);
				ciudad [i][j]= sc2.nextLine();
				} 
			} 
		System.out.println();
		for (int i=0; i<4; i++) { //Filas
			System.out.print("Pa�s: "+ pais [i]);
			System.out.print(" Ciudades:");
			for (int j=0; j<3; j++) { //columnas
				System.out.print(" "+ciudad [i][j]+",");
			}   System.out.println();

		
	}
	}
}
