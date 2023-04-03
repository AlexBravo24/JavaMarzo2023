package com;
import java.util.Scanner;

public class Ejercicio3_AKVB {

	public static void main(String[] args) {
		System.out.println("Programa que muestra el resultado de una division");
		int num1,num2;
		double res;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese el primer número...");
		num1 = entrada.nextInt();
		System.out.println("El primer número es: " + num1);
		System.out.println("Ingrese el segundo número...");
		num2 = entrada.nextInt();
		System.out.println("El segundo número es: " + num2);
		if(num2 == 0){
			System.out.println("NO SEA CABEZOTA.");
			System.out.println("Me despido. Saludos cordiales.");
		}else {
			System.out.println("DIVIDIENDO NUMEROS...");
			res = (double)num1/num2;
			System.out.printf("El resultado es: " + "%.4f", res );
			System.out.println("\nMe despido. Saludos cordiales.");
		}
		
		entrada.close();

	}

}
