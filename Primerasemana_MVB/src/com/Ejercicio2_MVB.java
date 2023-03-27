package com;

import java.util.Scanner;

public class Ejercicio2_MVB {

	public static void main(String[] args) {
		
		//EJERCICIO 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		//
				Scanner entrada = new Scanner (System.in);
				System.out.println("Introduce un valor: ");
				int numero = entrada.nextInt();
				
				if (numero%2 == 0) {
					System.out.println("El numero " + numero + "es par");
				}else {
					System.out.println("El numero" + numero + "es impar");
				}

	}// cierre del main

}// cierre de la clase 

