package com;

import java.util.Scanner;

public class Ciclos2_RICG {

	public static void main(String[] args) {
		
		int tabla=15;
		int nume;
		int t=15;
		int a;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el valor por el que deseas multiplicar");
		nume= entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingresa el numero de iteraciones que deseas realizar");
		a = entrada1.nextInt();
		
		for (t=1; t<=a; t++) {
			System.out.println(+nume+ "*" +t+ "=" + t*nume);
		}
		
		
	}

}
