package com;

import java.util.Scanner;

public class Ciclos4_RICG {

	public static void main(String[] args) {
	/*Programa que reciba una frase y una letra por teclado. Deber� retornar como resultado 
		cu�ntas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		�Car�cter no encontrado�.
		*/
		
		String frase;
	
		char [] le;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingrese una frase");
		frase = entrada.nextLine();
		
		le =frase.toCharArray();
		
		for(int i=0; i<le.length; i++) {
			
			System.out.println("Letra " + le[i] + " su posicion es " + frase.charAt(0));
		} 
		
		

	}

}
