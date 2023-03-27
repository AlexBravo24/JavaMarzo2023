package com;

import java.util.Scanner;

public class Ejercicio7_PRSC {

	public static void main(String[] args) {
		/*
		 * 7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
		 * debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
		 * cobrar es la siguiente:
		 * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		 * De 50 a 99 alumnos, el costo es de 70 euros.
		 * De 30 a 49 alumnos, el costo es de 95 euros.
		 * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
		 * alumnos.
		 * Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
		 * pagar cada alumno por el viaje.
		 */

		double alumnos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el n�mero de alumnos:");
		alumnos = entrada.nextInt();
		
		switch ((alumnos>=100) ? 0: (alumnos >=50 && alumnos <=99) ? 1: (alumnos >=30 && alumnos <=49) ? 2: (alumnos <30) ? 3: 4 ) {
		case 0:
			System.out.println("El costo por alumno es: $65 euros y el pago a la compa��a es: $" + alumnos*65);
			break;
		case 1:
			System.out.println("El costo por alumno es: $70 euros y el pago a la compa��a es: $" + alumnos*70);
			break;
		case 2:
			System.out.println("El costo por alumno es: $95 euros y el pago a la compa��a es: $" + alumnos*95);
			break;
		case 3:
			System.out.printf("El costo por alumno es: " + 4000/alumnos + " y el pago a la compa��a es: $4000");
			break;
		}
			
	
	}

}
