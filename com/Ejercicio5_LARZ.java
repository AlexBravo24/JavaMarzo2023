package com;

import java.util.Scanner;

public class Ejercicio5_LARZ {

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		//parámetros: edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//* Otros casos -> NO ACEPTADA

		System.out.println("Programa que calcula la aceptación de una solicitud en base a: Edad, Sexo y Nota.");
		System.out.println();
		
		final int edad = 18;
		final int nota = 5;
		final String sexof = "F";
		final String sexom = "M";
		
		int edad1;
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Dime la Edad: ");
		edad1 = entrada1.nextInt();
		
		int nota1; 
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Dime la Nota: ");
		nota1 = entrada2.nextInt();
		
		String sexo3; 
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Dime el Sexo: ");
		sexo3 = entrada3.next();
		
		if (edad!=edad1) {
			System.out.println("Rechazado");
		}else if (nota!=nota1) {
			System.out.println("Rechazado");
		}else if (sexof.equals(sexo3)) {
			System.out.println("Aceptable");
		}else if (sexom.equals(sexo3)) {
			System.out.println("Posible");
		}else {
			System.out.println("Rechazado");
		}
				
		
		
		
				
	}

}
