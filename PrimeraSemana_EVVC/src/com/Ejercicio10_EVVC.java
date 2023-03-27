package com;

import java.util.Scanner;

public class Ejercicio10_EVVC {

	public static void main(String[] args) {
		/*Realiza un programa que pida un número entero entre uno y doce e imprima el número de 
		 * días que tiene el mes correspondiente.
		 */

		int mes;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un n´mero del 1 al 12");
		mes=entrada.nextInt();
		
		switch ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) ? 1 : (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 2 : (mes == 2) ? 3 : 4) {
		case 1:
			System.out.println("El mes número " +mes + " tiene 31 días.");
			break;
		case 2: 
			System.out.println("El mes número " +mes + " tiene 30 días.");
			break;
		case 3: 
			System.out.println("El mes número " +mes + " tiene 28 días.");
			break;
		case 4: 
			System.out.println("¡¡ Error!! \nIntroduce un valor válido");
			break;
		}
	}

}
