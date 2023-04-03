package com;
import java.util.Scanner;

public class Ciclos4_AKVB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cadena= "";
		int cont = 0;
		char amongus;
		
		System.out.println("Programa que lee una cadena y detecta "
				+ "cuantas veces aparece un caracter.");
		System.out.println("Escriba la cadena: ");
		cadena = entrada.nextLine();
		System.out.println("Cadena: " + cadena);
		System.out.println("Escriba el caracter a buscar: ");
		amongus = entrada.next().charAt(0);
		System.out.println("Caracter: " + amongus);
		System.out.println("Buscando caracter...");
		for(int i = 0;i<cadena.length();i++){
			if(cadena.charAt(i) == amongus) {
				cont++;
//				System.out.println("IGUAL");
			}
		}
		if(cont>0) {
			System.out.println("El caracter se  detectó " + cont + " veces.");
		}else {
			System.out.println("No se encontró el caracter.");
		}
		
		
		
		System.out.println("\nMe despido, saludos cordiales.");
		entrada.close();
	}

}
