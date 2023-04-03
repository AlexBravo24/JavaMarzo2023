package com;

import java.util.Scanner;

public class Ciclos2_MVB {

	public static void main(String[] args) {
// Ejercicio 2. Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
	//23 x 95 = ???
		
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese un número para la tabla de multiplicar: ");
		 int numero = entrada.nextInt();
		 
			for (int i=1; i<=95; i++) {
	     	String resultado = String.format("%d x %d = %d",numero,i,numero*i);
				System.out.println(resultado);
			}

		
		
		

	}

}
