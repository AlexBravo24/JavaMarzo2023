package com;

import java.util.Scanner;

public class Ejercicio5_EVVC {

	public static void main(String[] args) {
		/*Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		 * parámetros: edad, nota y sexo.
		 * Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		 * Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		 * Otros casos -> NO ACEPTADA
		 */
		int nota;
		int edad;
		char sexo;
		char mas='M';
		char fem ='F';
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nota:");
		nota = entrada.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce tu edad:");
		edad = entrada2.nextInt();
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Introduce M para masculino o F para femenino");
		sexo= entrada3.next().charAt(0);
		
		
		if (nota>=5 && edad>=18) {
			if(sexo==mas) {
				System.out.println("Posible");
			}else if (sexo==fem) {
				System.out.println("Aceptada");
			}else {
				System.out.println("No aceptada");
			}
			
		}else {
			System.out.println("No aceptada");
		}
	}

}
