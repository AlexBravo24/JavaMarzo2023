package com;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		float don,salud,comedor,bolsa;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca la donación anual:");
		don=entrada.nextFloat();
		if(don>= 10000) {
			salud=don*.30f;
			comedor=don*.50f;
			bolsa=don*.20f;
			System.out.println("se destinara al centro de salud "+salud);
			System.out.println("se destinara al comedor de niños "+comedor);
			System.out.println("se invertira en la bolsa "+bolsa);
		}
		else if(don<10000) {
			salud=don*.25f;
			comedor=don*.60f;
			bolsa=don*.15f;
			System.out.println("se destinara al centro de salud "+salud);
			System.out.println("se destinara al comedor de niños "+comedor);
			System.out.println("se invertira en la bolsa "+bolsa);
		}

	}

}
