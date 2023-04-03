package com;

import java.util.Scanner;

public class ArraysBidimensional1_LFEO {
	/*
	 * 1. Crea un programa que pida por pantalla cuatro países y a continuación tres 
       ciudades de cada uno de estos países. Los nombres de ciudades deben 
       almacenarse en un array multidimensional cuyo primer índice sea el 
       número asignado a cada país y el segundo índice el número asignado a 
       cada ciudad.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String[][] ciudades = new String[4][3];
		String[] paises = new String[4];
		
		System.out.println("INTRODUZCA EL NOMBRE DE 4 PAISES:");
		
		for(int i=0; i<4; i++) {
			paises[i] = entrada.nextLine();
		}
		for(int i=0; i<4; i++) {
			System.out.println("INTRODUZCA 3 CIUDADES DE  "+paises[i]);
			for(int j=0; j<3; j++) {
				ciudades[i][j] = entrada.nextLine();
			}
		}
		System.out.println("LOS PAISES Y CIUDADES INTRODUCIDOS SON LOS SIGUIENTES :");
		
		for(int i =0; i<4; i++) {
			System.out.print(paises[i]);
			for(int j=0; j<3; j++) {
				System.out.print(ciudades[i][j]);
			}
		}
		

	}

}
