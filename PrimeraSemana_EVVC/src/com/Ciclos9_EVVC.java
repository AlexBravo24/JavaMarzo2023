package com;

import java.util.Scanner;

public class Ciclos9_EVVC {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números pares entre ellos 
		
		double num1;
		double num2;
		double residuo;
		
		Scanner entrada1 = new Scanner (System.in);
		System.out.println("Ingresa el primer número");
		num1=entrada1.nextDouble();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Ingresa el segundo número");
		num2=entrada2.nextDouble();
		
		double min = Math.min(num1, num2);
		double max = Math.max(num1, num2);
		//System.out.println(min +", "+ max);
		
		System.out.println("Los numeros pares entre el intervalo marcado por "+ min + " y " + max + " son: ");
		
		for(double i = (min+1) ; i<max ; i++ ) {
			residuo=i%2;
			if (residuo==0) {
				System.out.print(" "+i);
			}
			
			
		}
		
		
		
		
		
		
		

	}

}
