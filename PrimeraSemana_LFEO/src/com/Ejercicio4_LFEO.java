package com;

import java.util.Scanner;

public class Ejercicio4_LFEO {
	
	//4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		char letra;
		
		System.out.println("INGRESA UNA LETRA  : ");
		letra = entrada.next().charAt(0);
		
		System.out.println("LA LETRA INGRESADA ES: " +letra);
		
		if(Character.isUpperCase(letra)) {
			System.out.println("LA LETRA "+letra+ " ES MAYUSCULA");
		}else {
			System.out.println("LA LETRA "+letra+ " ES MINUSCULA");
		}
		
		
		
		

	}

}
