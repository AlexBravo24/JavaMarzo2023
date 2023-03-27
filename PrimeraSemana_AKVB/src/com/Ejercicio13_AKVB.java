package com;
import java.util.Scanner;

public class Ejercicio13_AKVB {

	public static void main(String[] args) {
		double monto = 0, centro_salud = 0, comedor = 0, bolsa = 0, total = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("PROGRAMA QUE INDICA A DONDE VAN LAS DONACIONES");
		System.out.println("Ingrese el monto...");
		monto = entrada.nextDouble();
		while(monto < 0) {
			System.out.println("Monto inválido...");
			monto = entrada.nextDouble();
		}
		System.out.println("CALCULANDO DESTINO...");
		if(monto >= 10000) {
			centro_salud = monto*0.3;
			comedor = monto*0.5;
			bolsa = monto - (centro_salud+comedor);
			total = bolsa + comedor + centro_salud;
		}else if (monto < 10000) {
			centro_salud = monto*0.25;
			comedor = monto*0.6;
			bolsa = monto - (centro_salud+comedor);
			total = bolsa + comedor + centro_salud;
		}else {
			System.out.println("ERROR DE CALCULO...");
		}
		entrada.close();
		System.out.printf("El monto de " + "%.2f", monto);
		System.out.printf(" Euros se repartirá de la siguiente forma:\n");
		System.out.printf("%.2f", centro_salud);
		System.out.printf(" Euros al Centro de Salud.\n");
		System.out.printf("%.2f", comedor);
		System.out.printf(" Euros al Comedor de Niños.\n");
		System.out.printf("%.2f", bolsa);
		System.out.printf(" Euros a la Bolsa.\n");
		System.out.printf("Total: "+ "%.2f", total);
		System.out.printf(" Euros.");
		System.out.println("\nMe despido, saludos cordiales.");
	}

}
