package com;

import java.util.Scanner;

public class Ejercicio7_ELVM {

	public static void main(String[] args) {
		/*
		 * 7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto 
			debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de 
			cobrar es la siguiente:
		 * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		 * De 50 a 99 alumnos, el costo es de 70 euros.
		 * De 30 a 49 alumnos, el costo es de 95 euros.
		 * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de 
			alumnos.
			Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe 
			pagar cada alumno por el viaje.

		 */
		int alumnos=0;
		int DineroAlumnos=0;
		int TotalPagar=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("Cantidad de alumno que va al viaje?: ");
		alumnos=entrada.nextInt();
		if(alumnos>=100) {
			DineroAlumnos=DineroAlumnos+65;
		}else if(alumnos>=50 && alumnos<=99) {
			DineroAlumnos=DineroAlumnos+70;
		}else if(alumnos>=30 && alumnos<=49) {
			DineroAlumnos=DineroAlumnos+95;
		}else {
			System.out.println("el costo del autobus es de 4000 euros debido a los pocos alumnos");
		}
		TotalPagar=DineroAlumnos*alumnos;
		if(alumnos>=30) {
			System.out.println("la cantidad de dinero por viaje es de: "+TotalPagar);
		}else {
			System.out.println("");
		}
		
		

	}

}
