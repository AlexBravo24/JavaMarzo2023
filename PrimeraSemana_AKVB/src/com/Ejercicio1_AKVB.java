package com;

import java.util.Scanner;

public class Ejercicio1_AKVB {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int num1,num2;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que recibe dos n�meros y los compara...");
		System.out.println("Ingrese el primer n�mero...");
		num1 = entrada.nextInt();
		System.out.println("El primer n�mero es: " + num1);
		System.out.println("Ingrese el segundo n�mero...");
		num2 = entrada.nextInt();
		System.out.println("El segundo n�mero es: " + num2);
		System.out.println("COMPARANDO NUMEROS...");
		if(num1<num2)
		{
			System.out.println("El primer numero es menor (" + num1 +" < " + num2+")");
		}
		else if(num1 == num2)
		{
			System.out.println("Los n�meros son iguales: ("+ num1 +" = " + num2 + ")");
		}
		else if(num1>num2)
		{
			System.out.println("El primer numero es mayor (" + num1 +" > " + num2+")");
		}
		
		System.out.println("Me despido. Saludos cordiales.");
//		int beno =1;
//		char a = 'a';
//		float b = 2.5f;
//		double c = 2.5;
//		
//		int numero;
//		
//		String s = "beno es burro";
//		
//		System.out.println("Variable beno: " + beno + " y eso esta muy mal");
//		
//		Scanner entrada = new Scanner(System.in);
//		
//		System.out.println("Ingrese un numero...");
//		numero = entrada.nextInt();
//		
//		System.out.println("numero: " + numero);
		
		entrada.close();
	}//main() ENDS
	
}//Class ENDS
