package com;

import java.util.Scanner;

public class Ejercicio9_LARZ {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
		//introducimos otro n�mero nos da un error.

		System.out.println("Programa que muestra en pantalla el d�a de la semana correspondiente del 1 al 7.");
		System.out.println();
		
		int dia;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Dame el n�mero del d�a de la semana: ");
		dia = entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("Hoy es Lunes");
			break;
		case 2:
			System.out.println("Hoy es Martes");
			break;
		case 3:
			System.out.println("Hoy es Mi�rcoles");
			break;
		case 4:
			System.out.println("Hoy es Jueves");
			break;
		case 5:
			System.out.println("Hoy es Viernes");
			break;
		case 6:
			System.out.println("Hoy es S�bado");
			break;
		case 7:
			System.out.println("Hoy es Domingo");
			break;
		default:
				System.out.println("ERROR");
		}

	}

}
