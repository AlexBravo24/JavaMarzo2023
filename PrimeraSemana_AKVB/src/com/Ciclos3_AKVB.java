package com;
import java.util.Scanner;

public class Ciclos3_AKVB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cadena_normal = "";
		String cadena_tratada = "";
		String cadena_invertida = "";
		
		System.out.println("Programa que detecta un palindromo.");
		System.out.println("Ingrese la cadena.");
		cadena_normal = entrada.nextLine();
		System.out.println("Cadena: " + cadena_normal);
		cadena_tratada = cadena_normal;
		cadena_tratada = cadena_tratada.replaceAll("[^\\w+]", "");
		System.out.println("Cadena tratada: " + cadena_tratada);
		cadena_invertida = InvertirCadena(cadena_tratada);
		System.out.println("Cadena invertida: " + cadena_invertida);
		
		if(cadena_tratada.equalsIgnoreCase(cadena_invertida) == true) {
			System.out.println("ES UN PALINDROMO.");
		}else {
			System.out.println("NO ES UN PALINDROMO");
		}
		
		System.out.println("\nMe despido, saludos cordiales.");
		entrada.close();
	}

	public static String InvertirCadena(String cadena) {
		String temporal = "";
		for(int i = cadena.length()-1; i >= 0; i--) {
			temporal = temporal + cadena.charAt(i);
		}
		return temporal ;
	}
}
