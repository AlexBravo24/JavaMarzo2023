package com;

import java.util.Scanner;

public class Arrays3_ELVM {

	public static void main(String[] args) {
		/*
		 * 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
			caracteres
		 */
		String frase;
		char[]caracter;
		Scanner entrada=new Scanner(System.in);
		System.out.println("dame la frase ");
		frase=entrada.nextLine();
		caracter=new char [frase.length()];//toCharArray(); caracter=frtase.toCharArray(); Solucion del profesor
		
		for(int i=0;i<=frase.length()-1;i++) {//aqui sino pongo -1 saldria un error y esto es debido a lengh 
			caracter[i]=frase.charAt(i);
			System.out.println(caracter[i]);
		}
		
		
	}

}
