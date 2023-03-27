package com;

import java.io.IOException;
import java.util.Scanner;

public class Ciclos4_PRSC {

	public static void main(String[] args) throws IOException {
		/*
		 * .Programa que reciba una frase y una letra por teclado. Deber� retornar como resultado 
		 * cu�ntas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		 * �Car�cter no encontrado�. 
		 */

		String frase;
		char letra;
		int veces = 0;
		
		do {
			Scanner entrada = new Scanner(System.in);
			System.out.println("Inserte su frase: ");
			frase = entrada.next();
			
			
		} while (frase.isEmpty());
		System.out.println("Ingrese una letra:");
		letra = (char) System.in.read();
		veces = contarCaracteres(frase, letra);
		System.out.println("El caracter: " +letra+ " se repite: " +veces+ " veces.");
	}

	private static int contarCaracteres(String frase, char letra) {
		int posici�n, contador = 0;
		
		posici�n = frase.indexOf(letra);
		while (posici�n != -1) {
			contador++;
		posici�n = frase.indexOf(letra, posici�n +1);	
		}
		return contador;
	}

	
	}


