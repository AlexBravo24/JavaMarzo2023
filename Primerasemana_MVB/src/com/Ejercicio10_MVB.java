package com;

import java.util.Scanner;

public class Ejercicio10_MVB {

	public static void main(String[] args) {
		//EJERCICIO 10. .Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el
		//mes correspondiente.

		Scanner entrada = new Scanner (System.in);
		int diaMes;
		System.out.println("Ingresa un número del 1 al 12: ");
		diaMes = entrada.nextInt();
		if (diaMes == 1) {
			System.out.println("Enero");
		}else if (diaMes == 2) {
			System.out.println("Febrero");
		}else if (diaMes == 3) {
			System.out.println("Marzo");
		}else if (diaMes == 4) {
			System.out.println("Abril");
		}else if (diaMes == 5) {
			System.out.println("Mayo");
		}else if (diaMes == 6) {
			System.out.println("Junio");
		}else if (diaMes == 7) {
			System.out.println("Julio");
		}else if (diaMes == 8) {
			System.out.println("Agosto");
		}else if (diaMes == 9) {
			System.out.println("Septiembre");
		}else if (diaMes == 10) {
			System.out.println("Octubre");
		}else if (diaMes == 11) {
			System.out.println("Noviembre");
		}else if  (diaMes == 12) {
			System.out.println("Diciembre");
		}
	}

}
