package com;

import java.util.Scanner;

public class Ejercicio4_LARZ {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra may�scula.

		System.out.println("Este programa nos pide una cadena y comprueba si es una letra may�scula.");
			    
		String cadena;
		Scanner entrada = new Scanner (System.in);
	    System.out.print("Introduce la cadena que desees: ");
	    cadena = entrada.nextLine();
	    
	    if (cadena.length() != 1){
	      System.out.println("La cadena no es una letra may�scula");
	    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	       System.out.println("La cadena es una letra may�scula.");
	    }else {
	        System.out.println("La cadena no es una letra may�scula.");
	    }
		
	}

}
