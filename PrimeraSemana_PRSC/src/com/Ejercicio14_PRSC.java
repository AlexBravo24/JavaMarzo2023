package com;

import java.util.Scanner;

public class Ejercicio14_PRSC {

	public static void main(String[] args) {
		/*
		 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
		 * horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
		 * primeras 40 horas y $20 por cada hora extra
		 */

		int horas;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese sus horas trabajadas:");
		horas = entrada.nextInt();
		
		int ext = horas-40;
		
		if (horas<=40) {
			System.out.println("Su salario será de: " + horas*16 );
		} else if (horas>40) {
			System.out.println("Su salario será de: " + (640 + ext*20));
		}
	}

}
