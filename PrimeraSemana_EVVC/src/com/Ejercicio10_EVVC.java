package com;

import java.util.Scanner;

public class Ejercicio10_EVVC {

	public static void main(String[] args) {
		/*Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de 
		 * d�as que tiene el mes correspondiente.
		 */

		int mes;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce un n�mero del 1 al 12");
		mes=entrada.nextInt();
		
		switch ((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) ? 1 : (mes == 4 || mes == 6 || mes == 9 || mes == 11) ? 2 : (mes == 2) ? 3 : 4) {
		case 1:
			System.out.println("El mes n�mero " +mes + " tiene 31 d�as.");
			break;
		case 2: 
			System.out.println("El mes n�mero " +mes + " tiene 30 d�as.");
			break;
		case 3: 
			System.out.println("El mes n�mero " +mes + " tiene 28 d�as.");
			break;
		case 4: 
			System.out.println("�� Error!! \nIntroduce un valor v�lido");
			break;
		}
	}

}
