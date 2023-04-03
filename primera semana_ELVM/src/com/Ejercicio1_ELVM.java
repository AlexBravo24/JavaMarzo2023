package com;

import java.util.Scanner;

public class Ejercicio1_ELVM {

	public static void main(String[] args) {
		/*
		 * 1.-Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		 * 
		 */
		int numero1=0;
		int numero2=0;
		
		Scanner entrada =new Scanner(System.in);
		System.out.println("Dame el primer numero: ");
		numero1=entrada.nextInt();
		Scanner entrada2 =new Scanner (System.in);
		System.out.println("Dame el segundo numero: ");
		numero2=entrada2.nextInt();
		if(numero1>numero2) {
			System.out.println("el primer numero es mayor que el segundo numero");
		}else if(numero1==numero2) {
			System.out.println("los numeros son iguales");
		}else {
			System.out.println("el segundo numero es mayor que el primer numero");
		}
		
		
	}

}
