package com;
import java.util.Scanner;
public class Ejercicio7_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
//		debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
//		cobrar es la siguiente:
//		* Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
//		* De 50 a 99 alumnos, el costo es de 70 euros.
//		* De 30 a 49 alumnos, el costo es de 95 euros.
//		* Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
//		alumnos.
//		Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
//		pagar cada alumno por el viaje.

		Scanner my_scanner = new Scanner(System.in);
		System.out.println("�Cu�ntos alumnos van a ir?");
		int alumnos = my_scanner.nextInt();
		
		if (alumnos >= 100) {
			System.out.println("Por persona ser�n 65 euros");
			System.out.println("Con un total de: " + alumnos*65 + " euros");
		} else if (alumnos > 49 && alumnos < 100) {
			System.out.println("Por persona ser�n 70 euros" );
			System.out.println("Con un total de: " + alumnos*70 + " euros");
		} else if (alumnos > 29 && alumnos < 49) {
			System.out.println("Por persona ser�n 95 euros");
			System.out.println("Con un total de: " + alumnos*95 + " euros");
		} else if ( alumnos < 30) {
			System.out.println("Ser�n $4,000 eruos sin importar cu�ntos alumnos sean.");
		}
		
		
		
	}

}
