package com;

import java.util.Scanner;

public class Letra_Mayuscula {

	public static void main(String[] args) {
		char cadena;
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduzca la cadena:");
		cadena=entrada.next().charAt(0);
		if(Character.isUpperCase(cadena)) {
			System.out.println("la letra es mayusula");
		}
		else {
			System.out.println("no es mayuscula");
		}

	}

}
