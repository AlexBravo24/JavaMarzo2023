package com;

import java.util.Scanner;

public class Ejercicio9_MVB {

	public static void main(String[] args) {
		// EJERCICIO 9..Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a correspondiente. Si
		//introducimos otro n�mero nos da un error
		
		Scanner entrada = new Scanner (System.in);
		int diaSemana;
		System.out.println("Ingrese un n�mero del 1 al 7: ");
		diaSemana = entrada.nextInt();
		
		if(diaSemana == 1) {
			System.out.println("Lunes");
		}else if (diaSemana == 2) {
			System.out.println("Martes");
		}else if (diaSemana == 3) {
			System.out.println("Mi�rcoles");
		}else if (diaSemana == 4) {
			System.out.println("Jueves");
		}else if (diaSemana == 5) {
			System.out.println("Viernes");
		}else if (diaSemana == 6) {
			System.out.println("S�bado");
		}else if (diaSemana == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Error el n�mero introducido no es v�lido");
		}

	}

}
