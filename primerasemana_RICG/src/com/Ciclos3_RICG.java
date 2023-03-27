package com;

import java.util.Scanner;

public class Ciclos3_RICG {

	public static void main(String[] args) {
		//Realiza un programa para determinar si un String es palíndromo
		
		Scanner entrada = new Scanner(System.in);
		
		String cadena;
		String cadena1;
		
		System.out.println("Ingrese una palabra");
		cadena = entrada.nextLine();
		System.out.println("Ingrese otra palabra");
		cadena1 = entrada.nextLine();
		
		if(cadena.equals(cadena1) ) {
			System.out.println("Las palabras son palindromas");
		}else {
			System.out.println("");
			System.out.println("Las palabras no son palindromas");
			
		}
		
		

}

}