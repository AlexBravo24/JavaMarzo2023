package com;

import java.util.Scanner;

public class Ejercicio10_PRSC {

	public static void main(String[] args) {
		/*
		 * 0.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
		 * mes correspondiente.
		 */

		int mes;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un número entre 1 y 12");
		mes = entrada.nextInt();
		
		if (mes==1 || mes== 3 || mes== 5 || mes== 7 || mes==8 || mes==10 || mes==12) {
			System.out.println("El mes " + mes + " tiene 31 días");
	} else if (mes==4 || mes== 6 || mes== 9 || mes== 11) {
		System.out.println("El mes " + mes + " tiene 30 días");
	} else if (mes==2) {
		System.out.println("El mes " + mes + " tiene 28 días");
	}

}

	
	}
