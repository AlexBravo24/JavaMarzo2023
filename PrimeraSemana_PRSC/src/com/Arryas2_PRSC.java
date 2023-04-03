package com;

public class Arryas2_PRSC {

	public static void main(String[] args) {
		/*
		 * 2. Crea un array de números de 100 posiciones, que contendrá los números del 
		 * 1 al 100. Obtén la suma de todos ellos y la media.
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
