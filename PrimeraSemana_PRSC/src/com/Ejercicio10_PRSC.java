package com;

import java.util.Scanner;

public class Ejercicio10_PRSC {

	public static void main(String[] args) {
		/*
		 * 0.Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		 * mes correspondiente.
		 */

		int mes;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un n�mero entre 1 y 12");
		mes = entrada.nextInt();
		
		if (mes==1 || mes== 3 || mes== 5 || mes== 7 || mes==8 || mes==10 || mes==12) {
			System.out.println("El mes " + mes + " tiene 31 d�as");
	} else if (mes==4 || mes== 6 || mes== 9 || mes== 11) {
		System.out.println("El mes " + mes + " tiene 30 d�as");
	} else if (mes==2) {
		System.out.println("El mes " + mes + " tiene 28 d�as");
	}

}

	
	}
