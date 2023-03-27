package com;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		int tamaño;
		char tipo;
		float kg,precio_kg,mult,total;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el tipo de uva:");
		tipo=entrada.next().charAt(0);
		System.out.println("introduzca la clase de la uva:");
		tamaño=entrada.nextInt();
		System.out.println("indique el precio inicial de la uva:");
		precio_kg=entrada.nextFloat();
		System.out.println("total de kg de uva:");
		kg=entrada.nextFloat();
		if(tipo=='A' && tamaño==1) {
			mult=.20f*kg;
			total=mult+(kg*precio_kg);
			System.out.println("el monto total por la uva es:"+total);
		}
		else if(tipo=='A'&& tamaño==2) {
			mult=.30f*kg;
			total=mult+(kg*precio_kg);
			System.out.println("el monto total por la uva es:"+total);
		}
		else if(tipo=='B' && tamaño==1) {
			mult=.30f*kg;
			total=(kg*precio_kg)-mult;
			System.out.println("el monto total por la uva es:"+total);
		}
		else if(tipo=='B' && tamaño==2) {
			mult=.50f*kg;
			total=(kg*precio_kg)-mult;
			System.out.println("el monto total por la uva es:"+total);
		}
		

	}

}
