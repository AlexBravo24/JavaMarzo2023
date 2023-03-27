package com;

import java.util.Scanner;

public class Ejercicio1_LARZ {

	public static void main(String[] args) {
		//Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales	
		System.out.println("Programa que compara dos números e indica cuál es mayor o si son iguales");
		System.out.println();
		
		double numero1;		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer número a comparar: ");
		numero1 = entrada.nextDouble();
		
		double numero2;		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el segundo número a comparar: ");
		numero2 = entrada2.nextDouble();
		
		if (numero1>numero2) {
				System.out.println("El número "+ numero1 + " es mayor");		
		}else if (numero2>numero1) {
			System.out.println("El numero "+ numero2 + " es mayor");
		}else if (numero1==numero2) {
			System.out.println("Son iguales");
		}
		
		
	}
}
