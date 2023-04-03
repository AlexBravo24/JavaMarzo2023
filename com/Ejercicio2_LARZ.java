package com;

import java.util.Scanner;

public class Ejercicio2_LARZ {

	public static void main(String[] args) {
		//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.  
		
		System.out.println("Programa que indica si un numero es par o impar");
		System.out.println();
		
		int numero1;		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el número a comparar: ");
		numero1 = entrada.nextInt();
		
		if (numero1 % 2 == 0) {
			System.out.println("Es par");			
		}else {
			System.out.println("Es impar");
		}
				
	}
}
