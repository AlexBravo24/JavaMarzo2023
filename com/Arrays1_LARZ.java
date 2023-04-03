package com;

import java.util.Scanner;

public class Arrays1_LARZ {

	public static void main(String[] args) {
		// 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		int n=0;
		int [] numeros = new int [10];
		
		do {
			Scanner sc= new Scanner(System.in);
			System.out.println("Dame un valor: ");
			numeros [n]= sc.nextInt();
			n++;
		}while (n<10);
						System.out.println();
		for (int i=0; i<10; i++) {
			System.out.println("El índice "+i+" tiene un valor "+ numeros[i]);
		}

	}

}
