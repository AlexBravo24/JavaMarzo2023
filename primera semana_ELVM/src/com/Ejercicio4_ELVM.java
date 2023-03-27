package com;

import java.util.Scanner;

public class Ejercicio4_ELVM {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		Scanner scanner = new Scanner (System.in);
	    String cadena;
		System.out.print("Introduce la cadena que desees: ");
	    cadena = scanner.nextLine();
	    
	// Realizamos Cálculos
	    if (cadena.length() ==1){
	      if((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
	    	  System.out.println("La cadena es una letra mayúscula.");
	      }else {
		        System.out.println("La cadena no es una letra mayúscula.");
		    }
	    	  
	    }else {
	        System.out.println("Son mas de una letras");
	    }
	}

}
