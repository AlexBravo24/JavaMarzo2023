package com;

import java.util.Scanner;

public class Ciclos3_ELVM {

	public static void main(String[] args) {
		// 3. Realiza un programa para determinar si un String es palíndromo

		String cadena ;
		Boolean decicion;
		Scanner entrada=new Scanner (System.in);
		System.out.println("digame la palabra para saber si es polidromo: ");
		cadena=entrada.nextLine();
		String invertida = "";
		 
		for (int i = cadena.length() - 1; i >= 0; i--) {
			// Y vamos concatenando cada carácter a la nueva cadena
			invertida =invertida+ cadena.charAt(i);
			
		}
		System.out.println("Cadena original: " + cadena);
		System.out.println("Cadena invertida: " + invertida);	
		//System.out.println(cadena.equalsIgnoreCase(invertida));
		
		
		decicion=cadena.equalsIgnoreCase(invertida);
		if(decicion==true) {
			System.out.println("es polindromo");
		}else {
			System.out.println("no es polindromo");
		}
	
	}

}
