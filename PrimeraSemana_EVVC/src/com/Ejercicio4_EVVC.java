package com;

import java.util.Scanner;

public class Ejercicio4_EVVC {

	public static void main(String[] args) {
		//  Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula
		String texto;
		String mayus;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce una oraci�n");
		texto = entrada.next();
		//System.out.println(texto);
		
		mayus=texto.toUpperCase();
		
		if (texto==mayus) {
			System.out.println("�La oraci�n est� en may�sculas!");
		} else {
			System.out.println("�La oraci�n no est� en may�sculas!");
		}
		

		
		
		
	}

}
