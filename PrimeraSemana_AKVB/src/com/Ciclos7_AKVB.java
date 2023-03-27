package com;

public class Ciclos7_AKVB {

	public static void main(String[] args) {
		double dinero_inicio = 700;
		int mes = 0;
		double dinero_fin;
		
		System.out.println("Programa que calcula cuantos meses tarda"
				+ "un interes compuesto en llegar a 1500");
		dinero_fin = dinero_inicio;
		while(dinero_fin<1500) {
			dinero_fin = dinero_fin + (dinero_fin*.02);
			mes++;
//			System.out.println("Mes: " + mes);
			System.out.printf("\nDinero mes " + mes +": $" + "%.2f", dinero_fin);
		}
		System.out.printf("\nDinero fin: $" + "%.2f", dinero_fin);
		System.out.println("\nSe obtuvieron los $1500 al mes " + mes + ".");
	}

}
