package com;
import java.util.Scanner;

public class Arrays1_AKVB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = new int [10];
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que recibe 10 numeros");
		for(int i = 0 ; i < numeros.length; i++) {
			System.out.println("Ingrese el valor " + (i+1));
			numeros[i] = entrada.nextInt();
		}
		
		System.out.println("El array que ingres� es: ");
		
		for(int i = 0 ; i < numeros.length; i++) {
			System.out.println("num["+ i +"]: " + numeros[i]);
//			if(i<numeros.length - 1) {
//				System.out.print(", ");
//			}
//			if(i == 4) {
//				System.out.println("");
//			}
		}
		entrada.close();
		System.out.println("\nMe despido, saludos cordiales.");
	}

}
