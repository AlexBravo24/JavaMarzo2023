package com;

import java.util.Scanner;

public class Arrays1_MVB {

	public static void main(String[] args) {
	// Ejercicio 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
	//Muestra por consola el índice y el valor al que corresponde.
		
		Scanner entrada = new Scanner (System.in);
		int [] numeros = new int[10];

				for (int i = 0; i <numeros.length;i++) {
      			System.out.print("Ingresa el numero para indice"+i+": ");
      			numeros[i] = entrada.nextInt();
				}
				
      			for (int i = 0; i< numeros.length; i++) {
      				System.out.println("Ingresa valor de indice"+i+"es: "+numeros[i]);
      			}
		
		
				
		
		
	}//cierre del main

}//cierre de la clase
