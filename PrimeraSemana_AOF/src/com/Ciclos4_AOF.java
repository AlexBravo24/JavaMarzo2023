package com;

import java.util.Scanner;

public class Ciclos4_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
//		cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
//		“Carácter no encontrado”. 
		
		
		  Scanner entrada = new Scanner(System.in);
		  String frase = "";
	        char caracter = ' ';
	        int contador = 0;
	        System.out.println("Ingrese una frase");
	        frase = entrada.nextLine();
	        System.out.println("Digite un caracter");
	        caracter = entrada.nextLine().charAt(0);
	        for (int i = 0; i < frase.length(); i++) {
	            if(frase.charAt(i) == caracter) contador++;
	        }
	        if(contador == 0) System.out.println("Carácter no encontrado");
	        else if(contador == 1) System.out.println("Solo hexiste un caracter");
	        else System.out.println("El caracter '" + caracter + "' se repite " + contador + " veces");
		  
	}//cierra

}//cierra
