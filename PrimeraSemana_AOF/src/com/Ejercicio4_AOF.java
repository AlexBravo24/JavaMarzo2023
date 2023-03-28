package com;

import java.util.Scanner;

public class Ejercicio4_AOF {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Ejercicio 4: Realiza un programa que lea una cadena por teclado y compruebe
//si una letra es mayúscula
		Scanner entrada = new Scanner(System.in);
		
		
		String cadena;
		
		System.out.println("Introduce tu texto");
		cadena = entrada.next(); //devuleve el valos numerico de la cadena de texto
		if (cadena.length() != 1){
		      System.out.println("La cadena no es una letra mayúscula");
		      
		}else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
		       System.out.println("La cadena es una letra mayúscula.");
		    }else {
		        System.out.println("La cadena no es una letra mayúscula.");
		    }
		      
	

	}

}
