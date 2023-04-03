package com;
import java.util.Scanner;

public class Ejercicio4_AKVB {
	
	public static void main(String[] args)
	{
		char a;
		System.out.println("Programa que lea un caracter y determine si es mayúscula");
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese un caracter: ");
		a = entrada.next().charAt(0);
		if(a>=65 && a<=90) {
			System.out.println("El caracter es: " + a + " y es MAYÚSCULA.");
		}else if(a>=97 && a<=122){
			System.out.println("El caracter es: " + a + " y es MINÚSCULA.");
		}else {
			System.out.println("El caracter es: " + a + " y es un CARACTER ESPECIAL.");
		}
		
		System.out.println("Me despido. Saludos cordiales.");
		entrada.close();
		
	}//main() ENDS
}//class ENDS
