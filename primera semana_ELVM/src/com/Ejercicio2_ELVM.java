package com;

import java.util.Scanner;

public class Ejercicio2_ELVM {

	public static void main(String[] args) {
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar

		int numero1=0;
		int resultado=0;
		
		Scanner entrada =new Scanner(System.in);
		System.out.println("Dame el numero: ");
		numero1=entrada.nextInt();
		
		resultado=numero1%2;
		
		if(resultado==0) {
			System.out.println("el numero: "+numero1 +" es par");
		}else {
			System.out.println("el numero: "+numero1 + " es impar");
		}
		
		
		
		
		
		
		
	}

}
