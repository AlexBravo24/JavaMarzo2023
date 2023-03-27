package com;

import java.util.Scanner;

public class Arrays2_EVVC {

	public static void main(String[] args) {
		/* Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. 
		 * Obtén la suma de todos ellos y la media.
		 */
		
		double num;
		double [] numeros = new double [100];
		double total =0;
		
		
		
		for (int i=0 ; i<100 ; i++) {
			num=1+i;
			numeros [i]=num;
			//System.out.println(num);
			}
		for (int h =0 ; h<100; h++) {
			total=numeros[h]+total;
			
		}

		System.out.println("La sumatoria de todos los valores es de " +total+ " y la media es de " + total/100);
	}

}
