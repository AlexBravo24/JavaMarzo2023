package com;

import java.util.Scanner;

public class Ejercicio4_PRSC {

	public static void main(String[] args) {
	
		/*
		 * 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		 */
		
		String texto;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu texto");
		
		texto = entrada.next();
		
		String palabra = texto;
		System.out.println(palabra.length());
		
	}

}
