package com;

import java.util.Scanner;

public class Ejercicio9_PRSC {

	public static void main(String[] args) {
		/*
		 * 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
		 * introducimos otro número nos da un error.
		 */

		int día;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un número entre 1 y 7");
		día = entrada.nextInt();
		
		switch (día) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miércoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;
		case 5:
			System.out.println("Viernes");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;
		
			default:
				System.out.println("¡¡ERROR!!");		
		}
	}

}
