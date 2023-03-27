package com;

import java.util.Scanner;

public class Ciclos12_LFEO {
	
	/*
	 * 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
      cuando el promedio de las edades sea superior a 25
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int edad, suma=0, contador=0, promedio=0;
		
		do {
			System.out.println("INGRESA LA EDAD DE LA PERSONA: ");
			edad = entrada.nextInt();
			suma = suma + edad;
			contador = contador + 1;
			promedio = suma/contador;
			System.out.println("EL PROMEDIO HASTA AHORITA ES: " +promedio);
			
			if(promedio>25) {
				break;
			}
			
			
		}while(edad>0);
		System.out.println("LA SUMA DE LAS EDADES ES: "+suma);
		System.out.println("LA CANTIDAD DE EDADES INGRESADAS FUERON: "+contador);
		System.out.println("EL PROMEDIO ES: "+promedio);

	}

}
