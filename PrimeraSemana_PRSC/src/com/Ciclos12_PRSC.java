package com;

import java.util.Scanner;

public class Ciclos12_PRSC {

	public static void main(String[] args) {
		/*
		 * 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		 * cuando el promedio de las edades sea superior a 25.
		 */
		
		double edad;
		double suma=0;
		double total=0;
		double promedio=0;
		
		
		Scanner entrada = new Scanner(System.in);
		
		
		do {
			System.out.println("Ingrese su edad: ");
			edad = entrada.nextInt();
			suma=suma+edad;
			total=total+1;
			promedio=suma/total;
			
			System.out.println("El promedio es de: " + promedio);
			if (promedio>25) {
				break;
				
			}
		} while (edad>0);
		
	}

}
