package com;

import java.util.Scanner;

public class Ejercicio9_ELVM {

	public static void main(String[] args) {
		/*
		 * 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
			introducimos otro número nos da un error.
		 */
		int dia=0;
		Scanner entrada=new Scanner(System.in);
		System.out.println("dame el día del 1 al 7: ");
		dia=entrada.nextInt();
		
		switch (dia) {
		case 1:
			System.out.println("lunes");
			break;
		case 2:
			System.out.println("martes");
			break;
		case 3:
			System.out.println("miercoles");
			break;
		case 4:
			System.out.println("jueves");
			break;
		case 5:
			System.out.println("viernes");
			break;
		case 6:
			System.out.println("sabado");
			break;
		case 7:
			System.out.println("domingo");
			break;
		default:
			System.out.println("desconocido,ERROR");
		}
	}

}
