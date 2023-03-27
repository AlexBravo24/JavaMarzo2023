package com;

import java.util.Scanner;

public class Ciclo10_EVVC {

	public static void main(String[] args) {
		/*0. Programa que lea 20 números e indique si son positivos o negativos y pares o 
		 * impares y además muestre la sumatoria de los positivos y sumatoria de los impares.
		 */

		int[] numeros= new int [20];
		int num;
		int suma=0;
		int residuo;
		int suma2=0;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce los numeros");
		
		for (int i=0; i<20 ; i++ ) { //para poner los datos en un arreglo
			num=entrada.nextInt();
			numeros[i]=num;
			
		}
		for (int j=0; j<20; j++) { //Para ver si los números son pos/neg y par/imp y sumatorias
			num=numeros[j];
			int abs =Math.abs(num);
			residuo= num%2;
			if (abs>num && residuo==0) {
				System.out.println("El número "+ num +" es negativo y par");
			} else if (abs>num && residuo !=0 ) {
				System.out.println("El número "+ num +" es negativo e impar.");
				suma2=num+suma2;
			}else if (abs==num && residuo==0) {
				System.out.println("El número "+ num +" es posotivo y par.");
				suma=num+suma;
			} else if (abs==num && residuo!=0) {
				System.out.println("El número "+ num +" es posotivo e impar.");
				suma=num+suma;
				suma2=num+suma2;
			
			}
		}
		
		System.out.println("La suma de los positivos es: "+suma);
		
		System.out.println("La suma de los impares es: " + suma2);	
		
	}

}
