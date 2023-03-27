package com;

import java.util.Scanner;

public class Ciclos4_EVVC {

	public static void main(String[] args) {
		/*Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		 * cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		 * “Carácter no encontrado”. 
		 */

		String frase;
		char letra;
		char ca;
		int con=0;
		int con2=0;
		boolean es;
		
		Scanner entrada =new Scanner (System.in);
		System.out.println("Ingrese una frase");
		frase = entrada.nextLine().toLowerCase();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Ingrese la letra para comprobar cuántas veces existe dentro de la frase" );
		letra=entrada2.next().charAt(0);
		
		char letram=Character.toLowerCase(letra);
		
		
		for (int i=0 ; i<(frase.length()) ; i++) {
			con=con2;
			ca=frase.charAt(i);
			//System.out.print(ca);
			
			
			if (letram==ca) {
				con2=con+1;
				
			}
			}
			
		if (con2==0) {
			System.out.println("Carácter no encontrado");
		} else {
			System.out.println("\n La frase contiene "+ con2 + " veces la letra "+letra);
		}
		
		
		
		
	}

}