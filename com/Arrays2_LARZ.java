package com;

import java.util.Scanner;

public class Arrays2_LARZ {

	public static void main(String[] args) {
		// 2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		//    1 al 100. Obt�n la suma de todos ellos y la media.
		 
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
