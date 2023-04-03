package com;

import java.util.Scanner;

public class Arrays1_LFEO {
	/*
	 * 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
      Muestra por consola el índice y el valor al que corresponde.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int [] numeros = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.println("INGRESA UN NUMERO :");
			numeros[i] = entrada.nextInt();
			
			
		}
		for(int i=0; i<10; i++) {
			System.out.println(" EL NUMERO INGRESADO EN LA POSICION : "+i+" ES: "+numeros[i]);
		}
		

	}

}
