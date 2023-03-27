package com;

import java.util.Scanner;

public class Ciclos3_LARZ {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo. 
		System.out.println("Programa que te muestra si una palabra es un palíndromo.");
		System.out.println();
		
		String palabra;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la palabra: ");
		palabra = entrada.next();
		
		String invertida = "";
		
		for (int indice = palabra.length() - 1; indice >= 0; indice--) {
			invertida += palabra.charAt(indice);
		}
		if (palabra.equalsIgnoreCase(invertida)) {
			System.out.println("Es un palindromo");
		}else {
			System.out.println("No es un palindromo");
		}
			

	}

}
