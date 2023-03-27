package com;

import java.util.Scanner;

public class Ciclos4_MVB {

	public static void main(String[] args) {
//Ejercicio 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
	//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
	//“Carácter no encontrado”. 

		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa una frase:");
		String frase = entrada.nextLine().toLowerCase();
		System.out.println("Ingresa una letra: ");
		String letra = entrada.nextLine().toLowerCase();
		
		int contar = 0;
		for (int i = 0; i < frase.length(); i++) {
			if (frase.charAt(i) == letra.charAt(0)) {
				contar++;
			}
		}
		
		if(contar == 0) {
			System.out.println("Letra no encontrada");
		}else {
			System.out.println("La letra '"+ letra + "'se repite " + contar + "'veces en la frase.");
		}
		
		
		
		
		
		
		
		
	}//cierre del main

}//cierre de la clase
