package com;

import java.util.Scanner;

public class Ciclos02_PRSC {

	public static void main(String[] args) {
		/*
		 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		 * desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		 * 23 x 95 = ???
		 */

		int n1;
		int n2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el número del cual quieres la tabla:");
		n1 = entrada.nextInt();
		
		System.out.println("Ingresa hasta cuál número deseas multiplicar el número anterior:");
		n2 = entrada.nextInt();
		
		for (int i=1; i<=n2; i++) {
			System.out.println(n1 + " x " +i+ " = " +n1*i);
		}
	}

}
