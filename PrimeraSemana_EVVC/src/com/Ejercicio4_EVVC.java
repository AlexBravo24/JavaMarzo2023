package com;

import java.util.Scanner;

public class Ejercicio4_EVVC {

	public static void main(String[] args) {
		//  Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula
		String texto;
		String mayus;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una oración");
		texto = entrada.next();
		//System.out.println(texto);
		
		mayus=texto.toUpperCase();
		
		if (texto==mayus) {
			System.out.println("¡La oración está en mayúsculas!");
		} else {
			System.out.println("¡La oración no está en mayúsculas!");
		}
		

		
		
		
	}

}
