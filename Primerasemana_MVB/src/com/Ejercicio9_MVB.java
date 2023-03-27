package com;

import java.util.Scanner;

public class Ejercicio9_MVB {

	public static void main(String[] args) {
		// EJERCICIO 9..Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si
		//introducimos otro número nos da un error
		
		Scanner entrada = new Scanner (System.in);
		int diaSemana;
		System.out.println("Ingrese un número del 1 al 7: ");
		diaSemana = entrada.nextInt();
		
		if(diaSemana == 1) {
			System.out.println("Lunes");
		}else if (diaSemana == 2) {
			System.out.println("Martes");
		}else if (diaSemana == 3) {
			System.out.println("Miércoles");
		}else if (diaSemana == 4) {
			System.out.println("Jueves");
		}else if (diaSemana == 5) {
			System.out.println("Viernes");
		}else if (diaSemana == 6) {
			System.out.println("Sábado");
		}else if (diaSemana == 7) {
			System.out.println("Domingo");
		}else {
			System.out.println("Error el número introducido no es válido");
		}

	}

}
