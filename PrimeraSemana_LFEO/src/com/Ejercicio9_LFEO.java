package com;

import java.util.Scanner;

public class Ejercicio9_LFEO {
	/*9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si 
introducimos otro número nos da un error*/

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int dia;
		
		System.out.println("INGRESA EL NUMERO CORRESPONDIENTE AL DIA QUE QUIERES VER :");
		dia = entrada.nextInt(); //guardamos el numero introducido en la variable dia
		
		switch(dia) {
		case 1:
			System.out.println("LUNES");
			break;
		case 2:
			System.out.println("MARTES");
			break;
		case 3:
			System.out.println("MIERCOLES");
			break;
		case 4:
			System.out.println("JUEVES");
			break;
		case 5:
			System.out.println("VIERNES");
			break;
		case 6:
			System.out.println("SABADO");
			break;
		case 7:
			System.out.println("DOMINGO");
			break;
		default:
			System.out.println("ERROR! EL NUMERO NO CORRESPONDE A UN DIA DE LA SEMANA");
			break;
		}
		

	}

}
