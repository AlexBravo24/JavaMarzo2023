package com;

import java.util.Scanner;

public class Ejercicio4_MVB {

	public static void main(String[] args) {
	
//	EJERCICIO 4.. Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce una letra");
		String letra = entrada.next();
		if (letra.length() == 1 && letra.charAt(0) >= 'A' && letra.charAt(0) <='Z') {
			System.out.println("La letra introducida es may�scula");
		}else if(letra.length() == 1 && letra.charAt(0) >= 'a' && letra.charAt(0) <='z')
			System.out.println("La letra introducida no es may�scula");{
		}
		

	}//Cierre del main

}//cierre de la clase 
