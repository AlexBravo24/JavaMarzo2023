package com;

import java.util.Scanner;

public class Ejercicio5_PRSC {

	public static void main(String[] args) {
		/*
		 * 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		 * parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA
		 */

		int nota;
		int edad;
		char sexo;
		
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce la nota");
		nota = entrada.nextInt();
		
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		
		System.out.println("Introduce tu sexo");
		sexo = entrada.next().charAt(0);
		
		char m = 'M';
		char f = 'F';
		
		if (nota>=5 && edad>=18 && sexo==m) {
		System.out.println("POSIBLE");
		} else if (nota>=5 && edad>=18 && sexo==f) {
		System.out.println("ACEPTADA");
		} else if (nota<5 && edad<18 && sexo==m) {
			System.out.println("NO ACEPTADA");
		}else if (nota<5 && edad<18 && sexo==f) {
			System.out.println("NO ACEPTADA");
		}
	}

}
