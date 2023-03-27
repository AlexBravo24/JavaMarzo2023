package com;

import java.util.Scanner;

public class Ejercicio4_RICG {

	public static void main(String[] args) {
		
	String cadena;
	

	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
	    char cadena1 = entrada.nextLine().charAt(0);
		
		if(Character.isUpperCase(cadena1)) {
			System.out.println("Las letras son mayusculas");
		}else  {
			System.out.println("Las letras son minusculas");
		}
			
	}

}
