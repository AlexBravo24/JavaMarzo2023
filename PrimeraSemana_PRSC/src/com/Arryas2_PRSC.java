package com;

public class Arryas2_PRSC {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		 * 1 al 100. Obt�n la suma de todos ellos y la media.
		 */

		int [] num = new int [100];
		double suma=0;
		double media;
		
		for (int i = 0; i <100; i++) {
			num [i] =i+1;
			suma = num[i] + suma; 
		}
		
		System.out.println("La suma de 1 a 100 es: " +suma);
		System.out.println("La media de la suma anterior es: " +suma/100);
	}

}
