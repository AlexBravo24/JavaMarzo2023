package com;
import java.util.Scanner;

public class Ciclos2_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		//desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("¿De qué tabla deseas multiplicar?");
		int tabla = my_scanner.nextInt();
		System.out.println("Define el límite");
		int limit = my_scanner.nextInt();
		
		for (int i = 1; i <= limit; i++) {
			System.out.println(i + " x " + tabla + " = " + (i*tabla));
		}
		
	}

}
