package com;

import java.util.Scanner;

public class Ejercicio3_LARZ {

	public static void main(String[] args) {
		//Crea un programa que pida al usuario dos n�meros y muestre el resultado de su divisi�n. 
		//Si el segundo n�mero es 0, debe mostrar un mensaje de error. 
		
		System.out.println("Programa que muestra el resultado de una divisi�n");
		System.out.println();
		
		double numero1;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduzca el valor del numerador: ");
		numero1 = entrada.nextDouble(); 
		
		double numero2;
		Scanner entrada2 =  new Scanner(System.in);
		System.out.println("Introduzca el valor del denominador: ");
		numero2 = entrada2.nextDouble();
		
		if (numero2 == 0) {
			System.out.println("Error");
		}else {
			System.out.println("El resultado de la divisi�n es: "+ numero1/numero2);
		}
		
				
	}
}
