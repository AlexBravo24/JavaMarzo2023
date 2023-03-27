package com;

import java.util.Scanner;

public class Ejercicio7_MVB {

	public static void main(String[] args) {
		
		// EJERCICIO 7:  El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto
		//debe cobrar a cada alumno y cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de
		//cobrar es la siguiente:
		// Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros.
		// De 50 a 99 alumnos, el costo es de 70 euros.
		// De 30 a 49 alumnos, el costo es de 95 euros.
	    // Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de
		//alumnos.
		// Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe
		//pagar cada alumno por el viaje.
		
		
		Scanner entrada = new Scanner (System.in);
		int numAlumnos;
		double costoAlumno, costoTotal;
		System.out.println("Ingrese la cantidad de alumnos: ");
		numAlumnos = entrada.nextInt();
		
		if(numAlumnos >= 100) {
			costoAlumno = 65;
		}else if (numAlumnos >=50 && numAlumnos <= 99) {
			costoAlumno = 70;
		}else if (numAlumnos >=30 && numAlumnos <= 49) {
			costoAlumno = 95;
		}else {
			costoAlumno= 4000.0 / numAlumnos;
		}
		
		costoTotal = numAlumnos * costoAlumno;
		
		System.out.println("El costo por alumno es de " + costoAlumno + "euros.");
		System.out.println("El costo total del viaje es de" + costoTotal + "euros.");

	}

}
