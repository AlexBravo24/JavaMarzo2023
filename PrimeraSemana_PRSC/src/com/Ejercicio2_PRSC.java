package com;

import java.util.Scanner;

public class Ejercicio2_PRSC {

	public static void main(String[] args) {
	
		/*
		 * 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar. 
		 */

		int numero;
		
Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un valor");
		numero = entrada.nextInt();
		
		int resultado = numero%2;
		
		if (resultado==0) {
			System.out.println("El número " + numero + " es par");
		} else { 
			System.out.println("El número " + numero + " es impar");
		}		
	
	}

}
