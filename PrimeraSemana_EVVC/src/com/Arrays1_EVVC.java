package com;

import java.util.Scanner;

public class Arrays1_EVVC {

	public static void main(String[] args) {
		/*Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		 * Muestra por consola el �ndice y el valor al que corresponde.
		 */
		int num;
		int [] numeros = new int [10];
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese los valores ");
		
		for (int i=0 ; i<10 ; i++) {
			num=entrada.nextInt();
			numeros [i]=num;
			}
				
		for (int h=0 ; h<10; h++) {
			System.out.println("La posici�n " +h+ " tiene un valor de " + numeros [h]);
		}
		
			}
		

}
