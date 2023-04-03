package com;

import java.util.Scanner;

public class Ejercicio9_LARZ {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		//introducimos otro número nos da un error.

		System.out.println("Programa que muestra en pantalla el día de la semana correspondiente del 1 al 7.");
		System.out.println();
		
		int dia;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame el número del día de la semana: ");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Hoy es Lunes");
			break;
		case 2:
			System.out.println("Hoy es Martes");
			break;
		case 3:
			System.out.println("Hoy es Miércoles");
			break;
		case 4:
			System.out.println("Hoy es Jueves");
			break;
		case 5:
			System.out.println("Hoy es Viernes");
			break;
		case 6:
			System.out.println("Hoy es Sábado");
			break;
		case 7:
			System.out.println("Hoy es Domingo");
			break;
		default:
				System.out.println("ERROR");
		}

	}

}
