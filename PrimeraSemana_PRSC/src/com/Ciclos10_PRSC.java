package com;

import java.util.Scanner;

public class Ciclos10_PRSC {

	public static void main(String[] args) {
		/*
		 * 10. Programa que lea 20 n�meros e indique si son positivos o negativos y pares o 
		 * impares y adem�s muestre la sumatoria de los positivos y sumatoria de los impares
		 */
		
		int [] numero = new int [20];
		int num;
		int sumpo=0;
		int sumim=0;
		int parim;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa tu n�mero:");
		
		for (int i=0; i<20; i++) {
			num=entrada.nextInt();
			numero[i]=num;
			parim=num%2;
			if (num<0 && parim==0) {
				System.out.println("El n�mero: " +num+ " es negativo y par.");
			}else if (num<0 && parim !=0) {
				System.out.println("El n�mero: " +num+ " es negativo e impar.");
				sumim=num+sumim;
			} else if (num>=0 && parim==0) {
				System.out.println("El n�mero: " +num+ " es positivo y par.");
				sumpo=num+sumpo;
			} else if (num>=0 && parim !=0) {
				System.out.println("El n�mero: " +num+ " es positivo e impar.");
				sumpo=num+sumpo;
				sumim=num+sumim;
			}
		}
		
		System.out.println("\n La suma de los n�meros positivos es: " +sumpo);
		System.out.println("La suma de los n�meros impares es: " +sumim);
		
		

	}

}
