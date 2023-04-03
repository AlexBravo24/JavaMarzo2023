package com;

import java.util.Scanner;

public class Ejercicio10_LFEO {
/*10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
mes correspondiente.

 * */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero;
		
		System.out.println("INGRESA UN NUMERO ENTRE 1 Y 12");
		numero = entrada.nextInt();
		
		switch(numero) {
		case 1:
			System.out.println("EL MES DE ENERO TIENE 31 DIAS");
			break;
		case 2:
			System.out.println("EL MES DE FEBRERO TIENE 28 DIAS");
			break;
		case 3:
			System.out.println("EL MES DE MARZO TIENE 31 DIAS");
			break;
		case 4:
			System.out.println("EL MES DE ABRIL TIENE 30 DIAS");
			break;
		case 5:
			System.out.println("EL MES DE MAYO TIENE 31 DIAS");
			break;
		case 6:
			System.out.println("EL MES DE JUNIO TIENE 30 DIAS");
			break;
		case 7:
			System.out.println("EL MES DE JULIO TIENE 31 DIAS");
			break;
		case 8:
			System.out.println("EL MES DE AGOSTO TIENE 31 DIAS");
			break;
		case 9:
			System.out.println("EL MES DE SEPTIEMBRE TIENE 30 DIAS");
			break;
		case 10:
			System.out.println("EL MES DE OCTUBRE TIENE 31 DIAS");
			break;
		case 11:
			System.out.println("EL MES DE NOVIEMBRE TIENE 30 DIAS");
			break;
		case 12:
			System.out.println("EL MES DE DICIEMBRE TIENE 31 DIAS");
			break;
		default: 
			System.out.println("ERROR!, EL NUMERO QUE INGRESASTE NO PERTENECE A NINGUN MES");
			break;
		}

	}

}
