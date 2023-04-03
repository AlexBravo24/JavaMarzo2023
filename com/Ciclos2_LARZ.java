package com;

import java.util.Scanner;

public class Ciclos2_LARZ {

	public static void main(String[] args) {
		// 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
		//desde teclado, hasta la iteración deseada por el usuario
		System.out.println("Programa que te muestra cualquier tabla de multiplicar hasta el número que desees");
		System.out.println();
		
		int base;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Qué tabla de multiplicar deseas obtener: ");
		base = entrada.nextInt();
		
		int lim;
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Hasta que valor deseas obtener: ");
		lim = entrada2.nextInt();
		System.out.println();
		
		for(int i=1; i<=lim; i++) {
			System.out.println(i+ " por "+ base +" es igual a: "+ i*base);
		}

	}

}
