package com;
import java.util.Scanner;
public class Ciclos10_MVB {

	public static void main(String[] args) {
//Ejercicio 10  Programa que lea 20 n�meros e indique si son 
		//positivos o negativos y pares o
//impares y adem�s muestre la sumatoria de los positivos y
		//sumatoria de los impares. 

		 Scanner input = new Scanner(System.in);
	        int positivos = 0;
	        int impares = 0;

	        for (int i = 0; i < 20; i++) {
	            System.out.print("Introduce un n�mero: ");
	            int numero = input.nextInt();

	            if (numero > 0) {
	                System.out.println(numero + " es positivo.");
	                positivos += numero;
	            } else {
	                System.out.println(numero + " es negativo.");
	            }
	            if (numero % 2 == 0) {
	                System.out.println(numero + " es par.");
	            } else {
	                System.out.println(numero + " es impar.");
	                impares += numero;
	            }
	        }
	        System.out.println("La sumatoria de los n�meros positivos es: " + positivos);
	        System.out.println("La sumatoria de los n�meros impares es: " + impares);

		
		
		
	}

}
