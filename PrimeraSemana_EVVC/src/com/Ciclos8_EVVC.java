package com;

import java.util.Scanner;

public class Ciclos8_EVVC {

	public static void main(String[] args) {
		// Programa Java que lea dos números y muestre los números desde el menor hasta el mayor 
		
		double num1;
		double num2;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Proporciona el primer numero");
		num1=entrada.nextDouble();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Proporciona el segundo numero");
		num2=entrada2.nextDouble();
		
		if (num2>num1) {
			System.out.println("Los números ordenados de menor a mayor son : " + num1 + ", "+num2);
		}else {
			System.out.println("Los números ordenados de menor a mayor son : " + num2 + ", "+num1);
		}
	
		
		

	}

}
