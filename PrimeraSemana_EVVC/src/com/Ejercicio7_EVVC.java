package com;

import java.util.Scanner;

public class Ejercicio7_EVVC {

	public static void main(String[] args) {
		/*El director de una escuela está organizando un viaje de estudios y requiere determinar 
		 * cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el 
		 * servicio. La forma de cobrar es la siguiente:
		 * Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
		 * De 50 a 99 alumnos, el costo es de 70 euros.
		 * De 30 a 49 alumnos, el costo es de 95 euros.
		 * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar 
		 * el número de alumnos.
		 * Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que 
		 * debe pagar cada alumno por el viaje.
		 */
		double alumnos;
		double pa; //pago del alumno
		double pc; //pago a la compañia
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el número de alumnos que van al viaje: ");
		alumnos = entrada.nextInt();
		
		switch ((alumnos >= 100) ? 0 : (alumnos>= 50 && alumnos <=99) ? 1 : (alumnos >= 30 && alumnos<=49) ? 2 : (alumnos<30) ? 3 : 4){
			case 0:
				pa=65;
				pc=pa*alumnos;
				System.out.println("El pago que se debe hacer a la compañia de autobuses es de " + pc +" euros" + "\nLo que debe pagar cada alumno es: " + pa + " euros" );
				break; 
			case 1: 
				pa=70;
				pc=pa*alumnos;
				System.out.println("El pago que se debe hacer a la compañia de autobuses es de " + pc +" euros" + "\nLo que debe pagar cada alumno es: " + pa + " euros" );
				break; 
			case 2: 
				pa=95;
				pc=pa*alumnos;
				System.out.println("El pago que se debe hacer a la compañia de autobuses es de " + pc +" euros" + "\nLo que debe pagar cada alumno es: " + pa + " euros" );
				break; 
			case 3:
				pa=4000/alumnos;
				pc=pa*alumnos;
				System.out.println("El pago que se debe hacer a la compañia de autobuses es de " + pc +" euros" + "\nLo que debe pagar cada alumno es: " + pa + " euros" );
				break; 
			case 4:
				System.out.println("Introduce valores validos");
			
			
			
			
		}
	}

}
