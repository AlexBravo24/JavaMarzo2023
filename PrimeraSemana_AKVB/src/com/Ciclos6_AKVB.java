package com;

public class Ciclos6_AKVB {

	public static void main(String[] args) {
		double dinero_inicio  = 1000;
		double dinero_fin = 0;
		System.out.println("Programa que calcula el intés compuesto.");
		dinero_fin = dinero_inicio;
		for(int i = 0; i < 12; i++) {
			dinero_fin = dinero_fin + (dinero_fin*.02);
		}
		System.out.println("El dinero al final del año es: " + dinero_fin);
		System.out.println("\nMe despido, saludos cordiales.");
	}

}
