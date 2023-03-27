package com;

import java.util.Scanner;

public class Ciclos4_ELVM {

	public static void main(String[] args) {
		/*
		 * 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado
			cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje
			“Carácter no encontrado”.
		 */
		String frase;
		char letra;
		int contador=0;
		//String cadena ;
		//Boolean decicion;
		Scanner entrada=new Scanner (System.in);
		System.out.println("digame la frase: ");
		frase=entrada.nextLine();
		System.out.println("dame la letra que quieres saber cuantas veces se repite ");
		letra= entrada.next().charAt(0);
		char comparar ;
		 
		for (int i = frase.length() - 1; i >= 0; i--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			comparar =frase.charAt(i);
			//System.out.println(comparar);
			if(comparar==letra) {
				contador++;
				
			}else {
				
			}
			
		}
		System.out.println("cantidad repetida de la letra "+letra+" es de "+contador);

	}

}
