package com;

import java.util.Scanner;

public class Ciclos8 {

	public static void main(String[] args) {
	
//		Programa Java que lea dos números y muestre los números desde el menor hasta el 
//		mayor
		
		
		 Scanner entrada = new Scanner(System.in);
		 int mayor = 0; int menor = 0;
		 int[] numeros = new int[3]; 
		for (int i = 0+1; i < 3; i++) {
		 System.out.print("Ingrese número " + (i) + ": "); numeros[i] = entrada.nextInt(); 
		} 
		for (int i = 1; i < numeros.length; i++) {
		 if (mayor < numeros[i]) { 
		mayor = numeros[i];
		 } } menor = mayor; 
		for (int i = 1; i < numeros.length; i++) {
		if (menor > numeros[i]) {
		 menor = numeros[i]; 
		} 
		}
		 System.out.println(" el numero mayor es " + mayor + " el numero menor es: " + menor); } 
	}


