package com;

import java.util.Scanner;

public class Ciclos3_LFEO {
	
	/*
	 * 3. Realiza un programa para determinar si un String es palíndromo.
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String palabra, comprobacion = ""; // se declaran dos variables de tipo Sring una para guardar la palabra
		                                   //y otra para comprobar esa misma palabra
		System.out.println("INGRESE UNA PALABRA :");
		palabra = entrada.next();   //se pide dato al usuario y se guarda en la variable palabra
		
		
		for(int i=0; i<palabra.length(); i++) {  //se inicia el ciclo for con laiteracion de i en la posicion 0 hasta que i sea menor 
			                                     //menor a la longitud de la palabra para ello se utiliza el metodo .length()
			comprobacion = palabra.charAt(i)+comprobacion; //utilizamos el metodo charAt para ir recorriendo la posicion de las letras
			                                               //y le sumamos comparacion
		}
		
		if(palabra.equals(comprobacion)) {  //en el if con el metodo .equals comparamos si la palabra es igual a comprobacion
			System.out.println("LA PALABRA "+palabra+ " SI ES UN PALINDROMO!!"); // se imprime que si es un palindromo
		}else { //si no
			System.out.println("LA PALABRA "+palabra+ " NO ES UN PALINDROMO!!"); //se imprime que no lo es
			
			//palabra.replace(" ", " "). "ES PARA QUITAR ESPACIOS EN LAS PALABRAS"
		}
		

	}

}
