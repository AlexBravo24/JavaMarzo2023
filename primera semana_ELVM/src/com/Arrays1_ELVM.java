package com;

import java.util.Scanner;

public class Arrays1_ELVM {

	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
			Muestra por consola el índice y el valor al que corresponde.
		 */
		//int numero;
		int [] numeros= new int[10];
		Scanner entrada=new Scanner(System.in);
		for(int i=0;i<=10;i++) {
			System.out.println("dame el numero que se guardara");
			numeros[i] =entrada.nextInt();
			
		}
		int contador=0;
		for(int i:numeros) {
			contador++;
			System.out.println("["+contador+"] contiene: "+i);
		}
		
		
	}

}
