package com;

import java.util.Scanner; 

public class Ejercicio1_PRSC {

	public static void main(String[] args) {
	
		/*1. .Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales. 
		 */
		
		int numero1;
		int numero2;	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor");
		numero1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo valor");
		numero2 = entrada.nextInt();
		
		int x = numero1;
		int y = numero2;	
		
		if (x>y) {
			System.out.println(numero1 + " es mayor que " + numero2);
		} else if (x<y) {
			System.out.println(numero2 + " es mayor que " + numero1);
		} else if (x==y) {
			System.out.println(numero1 + " y " + numero2 + " son iguales ");
		}
		
	}
}
