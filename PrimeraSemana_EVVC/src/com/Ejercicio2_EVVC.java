package com;

import java.util.Scanner;

public class Ejercicio2_EVVC {

	public static void main(String[] args) {
		//2.- Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		int valor;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un valor:");
		valor=entrada.nextInt();
		
		int residuo = valor%2;
		
		if (residuo == 0) {
			System.out.println("El número " + valor + " es par.");
		}else {
			System.out.println("El número " + valor + " es impar.");
		}

	}

}
