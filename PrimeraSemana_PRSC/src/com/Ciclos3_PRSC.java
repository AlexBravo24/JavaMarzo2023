package com;

import java.util.Scanner;

public class Ciclos3_PRSC {

	public static void main(String[] args) {
		/*
		 * 3. Realiza un programa para determinar si un String es palíndromo. 
		 */

		String palabra;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa tu palabra");
		palabra = entrada.next();
		
		String palin = new StringBuffer(palabra).reverse().toString();
		if (palabra.equalsIgnoreCase(palin))  {
			System.out.println("La palabra: " +palabra+ " es un palindromo");
		} else {System.out.println("La palabra: " +palabra+ " no es un palindromo");
		
		}
	}

}
