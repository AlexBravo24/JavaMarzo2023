package com;

import java.util.Scanner;

public class Ciclos9_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		10. Programa que lea 20 números e indique si son positivos o negativos y pares o 
//		impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
		
		Scanner my_scanner = new Scanner(System.in);
	
		
		int sumPositivos = 0;
		int sumImpares = 0;
		
		for (int i = 1; i <= 20; i ++) {
			System.out.println("Introduca el número " + i);
			int num = my_scanner.nextInt();
			
			if (num >= 0) {
				if (num%2 == 0) {
				System.out.println(num + " es positivo y par");
				} else {System.out.println(num + " es positivo e impar");}
			} else {
				if (num%2 == 0) {
					System.out.println(num + " es negativo y par");
					} else {System.out.println(num + " es negativo e impar");}
			}
			
			
			if (num >= 0) {
				sumPositivos += num;
			}
			if (num %2 != 0) {
				sumImpares += num;
			}
			
		}
		
		System.out.println("Suma de positivos: " + sumPositivos);
		System.out.println("Suma de impares: " + sumImpares);
	}

}
