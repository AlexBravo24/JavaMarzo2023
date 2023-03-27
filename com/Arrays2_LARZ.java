package com;

import java.util.Scanner;

public class Arrays2_LARZ {

	public static void main(String[] args) {
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del 
		//    1 al 100. Obtén la suma de todos ellos y la media.
		 
		int  suma=0;
		double media;
		int [] numeros = new int [100];
		
				
		for (int i=0; i<numeros.length; i++) {
			numeros [i] = i + 1;
			suma += i + 1;	
		}
		media = (double) suma / numeros.length;
        System.out.println("La suma da: "+suma);
        System.out.println("La media da: "+media);

	}

}
