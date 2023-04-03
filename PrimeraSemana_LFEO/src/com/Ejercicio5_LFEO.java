package com;

import java.util.Scanner;

public class Ejercicio5_LFEO {
	/*
	 * . Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
parámetros: edad, nota y sexo.
* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
* Otros casos -> NO ACEPTADA
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int nota, edad;  //Creamos las variables con respecto al tipo de datos que almacenara cada una
		char sexo;
		
		System.out.println("INGRESA LA EDAD:");
		edad = entrada.nextInt();
		System.out.println("INGRESA LA NOTA:");   //PEDIMOS CADA DATO AL USUARIO Y GUARDAMOS EN SUS RESPECTIVAS VARIABLES
		nota = entrada.nextInt();
		System.out.println("INGRESA EL SEXO:");
		sexo = entrada.next().charAt(0);
		
		if(nota>=5 && edad>=18 && sexo == 'M') {  //Realizamos las condicionales y si se cumplen imprimira un resulta de la solicitud
			System.out.println("La solicitud es POSIBLE");
		}else if(nota>=5 && edad>=18 && sexo=='F') {
			System.out.println("La solicitud es ACEPTADA");
		}else {
			System.out.println("Solicitud NO ACEPTADA");
		}

	}

}
