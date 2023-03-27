package com;

import java.util.Scanner;

public class Ejercicio13_RICG {

	public static void main(String[] args) {
		double cantidad;
		double t=30;
		double c=50;
		double v=20;
		double ve=25;
		double s=60;
		double q=15;
		double resultado;
		double resultado1;
		double resultado2;
		double resultado3;
		double resultado4;
		double resultado5;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de la donación");
		cantidad = entrada.nextDouble();
		
		resultado = (cantidad*t)/100;
		resultado1 = (cantidad*c)/100;
		resultado2 = (cantidad*v)/100;
		resultado3 = (cantidad*ve)/100;
		resultado4 = (cantidad*s)/100;
		resultado5 = (cantidad*q)/100;
		
		if(cantidad >=10000) {
			System.out.println("La Donación sera, Centro de Salud del 30% = " + resultado + ", Comedor de niños sera del 50% = " + resultado1 + ", Bolsa = " +resultado2 );
		}if(cantidad <=9999) {
			System.out.println("La Donación sera, Centro de Salud del 25% = " + resultado3 + ", Comedor de niños sera del 60% = " + resultado4 + ", Bolsa = " +resultado5 );
		}
		
		

	}

}
