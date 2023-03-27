package com;

import java.util.Scanner;

public class Ciclos2_ELVM {

	public static void main(String[] args) {
		/*
		 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido
			desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95.
			23 x 95 = ???
		 */
		int tabla=0;
		int iteracion=0;
		int multiplicacion=0;
		
		Scanner entrada=new Scanner(System.in);
		System.out.println("digite que tabla de multiplicar quiere aprender");
		tabla=entrada.nextInt();
		System.out.println("hasta que iteracion desea aprender");
		iteracion=entrada.nextInt();
		for(int i=0; i <= iteracion;i++ ) {
			multiplicacion=tabla*i;
			System.out.println(tabla+"x"+i+" = "+multiplicacion);
		}
	}

}
