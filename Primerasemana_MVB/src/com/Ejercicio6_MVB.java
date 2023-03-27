package com;

import java.util.Scanner;

public class Ejercicio6_MVB {

	public static void main(String[] args) {
	 	//EJERCICIO 6 
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese el precio inicial por kilo de uva");
		double precioInicial = entrada.nextDouble();
		System.out.println("Ingrese el tipo de uva (A o B): ");
		String tipo = entrada.next();
		System.out.println("Ingrese el tamaño de uva (1 o 2): ");
		int tamano = entrada.nextInt();
		
		double precioFinal = 0.0;
		if (tipo.equals("A")) {
			if (tamano == 1) {
				precioFinal = precioInicial+ 0.20;
			}else if (tamano == 2) {
				precioFinal = precioInicial + 0.30;
			}
		}else if (tipo.equals("B")) {
			if (tamano == 1) {
				precioFinal = precioInicial - 0.30;
			}else if (tamano == 2) {
				precioFinal = precioInicial - 0.50;
			}
		}
		System.out.println("El precio final por kilo de uva es: " + precioFinal);

	}

}
