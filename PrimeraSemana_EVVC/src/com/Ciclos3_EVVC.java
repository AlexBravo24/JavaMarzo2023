package com;

import java.util.Scanner;

public class Ciclos3_EVVC {

	public static void main(String[] args) {
		// . Realiza un programa para determinar si un String es pal�ndromo. 
		
		String palabra;
		String reves="";
		boolean es;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Este programa te dice si una palabra es un pal�ndromo. \n Ingresa la palabra");
		palabra=entrada.next();
		
		 for ( int i=palabra.length()-1 ; i>=0 ;i-- ) {
			reves+=palabra.charAt(i);
			//System.out.print(palabra.charAt(i));
			
		  }
		 
		 //System.out.println("\n"+palabra.equalsIgnoreCase(reves));
		 es=palabra.equalsIgnoreCase(reves);
		 
		 
		 
		 if (es==true) {
				System.out.println("\nLa palabra "+palabra+" es un pal�ndromo");
			}else {
				System.out.println("\nLa palabra "+palabra+" no es un pal�ndromo");
			}

		
		

	}

}
