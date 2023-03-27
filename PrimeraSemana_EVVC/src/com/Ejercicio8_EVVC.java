package com;

import java.util.Scanner;

public class Ejercicio8_EVVC {

	public static void main(String[] args) {
		/*. Realiza un programa que pida por teclado el resultado (dato entero) obtenido al lanzar 
		 * un dado de seis caras y muestre por pantalla el número en letras (dato cadena) de la cara
		 * opuesta al resultado obtenido.
		 * Nota 1: En las caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		 * Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se mostrará el 
		 * mensaje: 
		 * “ERROR: número incorrecto”
		 * 
		 */
		int dado;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Teclea el resultado de lanzar el dado:");
		dado = entrada.nextInt();
		
		
		
		switch (dado) {
		case 1:
			String uno="Seis";
			System.out.println("La cara opuesta es: " + uno);
			break;
		case 2: 
			String dos="Cinco";
			System.out.println("La cara opuesta es: " + dos);
			break;
		case 3:
			String tres="Cuatro";
			System.out.println("La cara opuesta es: " + tres);
			break;
		case 4:
			String cuatro="Tres";
			System.out.println("La cara opuesta es: " + cuatro);
			break;
		case 5:
			String cinco="Dos";
			System.out.println("La cara opuesta es: " + cinco);
			break;
		case 6:
			String seis="Uno";
			System.out.println("La cara opuesta es: " + seis);
			break;
			default: 
				System.out.println("¡¡ERROR!! \nNúmero Incorrecto");	
		
		}
		//} else {
		
	}

}
