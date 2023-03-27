package com;
import java.util.Scanner;
public class Ejercicio5_EDT {

	public static void main(String[] args) {
		
		
//		5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
//		parámetros: edad, nota y sexo.
//		* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
//		* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//		* Otros casos -> NO ACEPTADA
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("introduzca sexo");
		String sexo = my_scanner.nextLine();
		System.out.println("Sexo: " + sexo);
		System.out.println();
		
		System.out.println("introduzca edad");
		int edad = my_scanner.nextInt();
		System.out.println("Edad: " + edad);
		System.out.println();
		
		System.out.println("introduzca nota");
		int nota = my_scanner.nextInt();
		System.out.println("Nota: " + nota);
		System.out.println();
		
		
		
		if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("H")) {
			System.out.println("Posiblemente seas aceptado");
		} else if (nota >= 5 && edad >= 18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("Has sido aceptada");
		} else {
			System.out.println("No has sido aceptada");
		}
		
	}
}
