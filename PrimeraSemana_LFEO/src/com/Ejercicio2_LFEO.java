package com;

import java.util.Scanner;

public class Ejercicio2_LFEO {
//2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println(" INGRESE UN NUMERO: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println(" EL NUMERO " +numero+ " ES PAR ");
		}else {
			System.out.println(" EL NUMERO " +numero+ " ES IMPAR");
		}
		

	}

}
