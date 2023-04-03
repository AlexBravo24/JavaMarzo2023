package com;

import java.util.Scanner;

public class Ejercicio1_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		/*EJERCICIO 1:Realiza un programa que reciba dos numeros por teclado e indique cual es mayor y menor
		 * 
		 * 
		 */
		int num1;
		int num2;
		System.out.println("Ingresa primer número");
		num1 = entrada.nextInt();
		
		System.out.println("Ingresa segundo número");
		num2 = entrada.nextInt();
		
		if (num1==num2){
			System.out.println("son iguales");
			
			
		
} else { //llave else inicia
	if (num1>num2) {
		System.out.println("el mayor numero es:" +num1);
	}
	
	else {
		System.out.println("el mayor numero es:"+num2);
		
		if (num1<num2) {
			System.out.println("el menor numero es:" +num1);
		}else {
			System.out.println("el menor numero es:" +num2);
		}
		
	}
		
		
			
		}
		
	}//cierra
	
}//cierra final
