package com;

import java.util.Scanner;

public class Ejercicio10_ELVM {

	public static void main(String[] args) {
		/*
		 * 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
			mes correspondiente.

		 */

		int mes=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("dame el mes del 1 al 12: ");
		mes=entrada.nextInt();
		
		switch (mes) {
		case 1:
			System.out.println("el mes de enero tiene 31 días");
			break;
		case 2:
			System.out.println("el mes de febrero tiene 28 días");
			break;
		case 3:
			System.out.println("el mes de marzo tiene 31 días");
			break;
		case 4:
			System.out.println("el mes de abril tiene 30 días");
			break;
		case 5:
			System.out.println("el mes de mayo tiene 31 días");
			break;
		case 6:
			System.out.println("el mes de junio tiene 30 días");
			break;
		case 7:
			System.out.println("el mes de julio tiene 31 días");
			break;
		case 8:
			System.out.println("el mes de agosto tiene 31 días");
			break;
		case 9:
			System.out.println("el mes de septiembre tiene 30 días");
			break;
		case 10:
			System.out.println("el mes de octubre tiene 31 días");
			break;
		case 11:
			System.out.println("el mes de noviembre tiene 30 días");
			break;
		case 12:
			System.out.println("el mes de diciembre tiene 31 días");
			break;
		default:
			System.out.println("desconocido,ERROR");
		}
		
	}

}
