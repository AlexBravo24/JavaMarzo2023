package com;

import java.util.Scanner;

public class Ejercicio8_PRSC {

	public static void main(String[] args) {
		/*
		 * . Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar un dado de 
		 * seis caras y muestre por pantalla el número en letras (dato cadena) de la cara opuesta al resultado 
		 * obtenido.
		 * Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el mensaje: 
		 * “ERROR: número incorrecto”.
		 */

		int dado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el valor de la cara de tu dado");
		dado = entrada.nextInt();
			
		switch (dado) {
		case 1:
			System.out.println("La cara opuesta de 1 es: seis");
			break;
		case 2:
			System.out.println("La cara opuesta de 2 es: cinco");
			break;
		case 3:
			System.out.println("La cara opuesta de 3 es: cuatro");
			break;
		case 4:
			System.out.println("La cara opuesta de 4 es: tres");
			break;
		case 5:
			System.out.println("La cara opuesta de 5 es: dos");
			break;
		case 6:
			System.out.println("La cara opuesta de 6 es: uno");
			break;
		
			default:
				System.out.println("¡¡ERROR!! ¡Número incorrecto!");
	}
}
}