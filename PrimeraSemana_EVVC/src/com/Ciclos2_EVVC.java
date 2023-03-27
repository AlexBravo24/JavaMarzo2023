package com;

import java.util.Scanner;

public class Ciclos2_EVVC {

	public static void main(String[] args) {
		/* Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
		 * desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 
		 * 95. 23 x 95 = ???
		 */
		int n;
		int h;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Este algortimo realiza una tabla de multiplicar de un numero indicado. \nIndica el número:");
		n=entrada.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Indica hasta donde requieres la tabla");
		h=entrada2.nextInt();
		
		for (int i=1; i<(h+1) ; i ++) {
			System.out.println(n+"x"+i+"="+n*i);
			
		}

	}

}
