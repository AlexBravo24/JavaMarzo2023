package com;

import java.util.Scanner;

public class Ejercicio2_AKVB {

	public static void main(String[] args) {
		int num;
		System.out.println("Programa que indica si un número es par o impar");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese el número a identificar: ");
		num = entrada.nextInt();
		if(num%2 == 1){
			System.out.println("El número es: " + num + " y es IMPAR.");
		}else if(num%2 == 0) {
			System.out.println("El número es: " + num + " y es PAR.");
		}
		
		System.out.println("Me despido. Saludos cordiales.");
		
		entrada.close();
	}

}
