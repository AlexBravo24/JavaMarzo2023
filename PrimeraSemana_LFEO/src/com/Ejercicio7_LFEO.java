package com;

import java.util.Scanner;

public class Ejercicio7_LFEO {
	/*7. El director de una escuela está organizando un viaje de estudios y requiere determinar cuánto
debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
cobrar es la siguiente:
* Si son 100 alumnos o más, el costo por cada alumno es de 65 euros.
* De 50 a 99 alumnos, el costo es de 70 euros.
* De 30 a 49 alumnos, el costo es de 95 euros.
* Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de
alumnos.
Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
pagar cada alumno por el viaje.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int alumnos, costoxAlum, pagocompa;
		
		System.out.println("INGRESE LA CANTIDAD DE ALUMNOS A VIAJAR:");
		alumnos = entrada.nextInt();
		
		if(alumnos>=100) { //Si son 100 o mas alumnos
			costoxAlum = 65; //el costo sera 65
			pagocompa = alumnos*costoxAlum; //se calcula el pago a la compañia
			System.out.println("CADA ALUMNO PAGARA :" +costoxAlum+ " EUROS"); //se imprime cuanto paga cada alumno
			System.out.println("TOTAL DE PAGAR A LA COMPAÑIA :" +pagocompa+ " EUROS");// se imprime total a pagar a la compañia
			
		}else if(alumnos>=50 && alumnos<=99) {//si son entre 50 y 99 alumnon
			costoxAlum = 70; //el costo sera de 70 euros
			pagocompa = alumnos*costoxAlum; //se calcula el total a pagar a la compañia
			System.out.println("CADA ALUMNO PAGARA :" +costoxAlum + " EUROS"); //se imprime cuanto paga cada alumnos
			System.out.println("TOTAL DE PAGAR A LA COMPAÑIA :" +pagocompa+ " EUROS"); //se imprime el total a pagar a la compañia
				
		}else if(alumnos>=30 && alumnos<=49) { //si son entre 30 y 49 alumnos
			costoxAlum = 95;    //el costo es de 95 euros
			pagocompa = alumnos*costoxAlum; //se calcula el pago a la compañia
			System.out.println("CADA ALUMNO PAGARA :" +costoxAlum + " EUROS"); //se imprime cuanto pagara cada alumno
			System.out.println("TOTAL DE PAGAR A LA COMPAÑIA :" +pagocompa+ " EUROS"); // se imprime total a pagar a la compañia
			
		}else if(alumnos<30 && alumnos>=1) { //si son menos de 30 alumnos pero mas o igual a 1
			pagocompa = 4000;  //se le pagara a la compañia 4000 euros
			costoxAlum = pagocompa/alumnos;  //se calcula cuanto pagara cada alumno
			System.out.println("CADA ALUMNO PAGARA :" +costoxAlum + " EUROS"); //se imprime cuanto pagara cada alumno
			System.out.println("TOTAL DE PAGAR A LA COMPAÑIA :" +pagocompa+ " EUROS"); //se imprime total a pagar a la compañia
			
		}else {
			System.out.println("POR LO MENOS UN ALUMNO DEBE VIAJAR!");
		}

	}

}
