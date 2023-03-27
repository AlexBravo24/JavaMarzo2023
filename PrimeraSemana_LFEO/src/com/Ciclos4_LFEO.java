package com;

import java.util.Scanner;

public class Ciclos4_LFEO {
	/*
	 * 4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
       cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
       “Carácter no encontrado”.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 String frase; // declaramos la variable frse
		 char letra; // declaramos la variable letra
		
		 
		 
		 
		 
		 System.out.println("INGRESE UNA FRASE :");
		 frase = entrada.nextLine(); //pedimos la frase y se guarda en su respectiva variable
		 
		 System.out.println("INGRESE LA LETRA A BUSCAR DENTRO DE LA FRASE :");
		 letra = entrada.next().charAt(0); //pedimos la letra y se guarda en su variable
		 
		 int contador = 0; //declaramos e iniciamos el contador en 0
		 for(int i=0; i<frase.length(); i++) { // iniciamos el ciclo for y pedimos que recorra toda la longitud de la frase
			 
			 if(frase.charAt(i) == letra) {	 // realizamos comparacion que si al recorrer el iterador dentro de la frase encuentra
			 contador++;                     //una letra igual el contador incrementa
			 
			 
			 }else {
				 System.out.println("ERROR CARACTER NO ENCONTRADO"); //ak tengo un eror que como esto esta dentro del bucle
				                                                     //se repite tantas veces como el  tama;o de la frase
			 }
			 
			 
		 }
		 System.out.println("LA LETRA "+letra+ " SE REPITE " +contador+ " VECES "); //imprimimos el resutado
		 
		 
		 
		 
 
		

	}

}
