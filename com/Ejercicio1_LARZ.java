package com;

import java.util.Scanner;

public class Ejercicio1_LARZ {

	public static void main(String[] args) {
		//Realiza un programa que reciba dos n�meros por teclado e indique cu�l es mayor o si son iguales	
		System.out.println("Programa que compara dos n�meros e indica cu�l es mayor o si son iguales");
		System.out.println();
		
		double numero1;		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer n�mero a comparar: ");
		numero1 = entrada.nextDouble();
		
		double numero2;		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el segundo n�mero a comparar: ");
		numero2 = entrada2.nextDouble();
		
		if (numero1>numero2) {
				System.out.println("El n�mero "+ numero1 + " es mayor");		
		}else if (numero2>numero1) {
			System.out.println("El numero "+ numero2 + " es mayor");
		}else if (numero1==numero2) {
			System.out.println("Son iguales");
		}
		
		
	}
}
