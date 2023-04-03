package com;

import java.util.Scanner;

public class Ejercicio1_MVB {

	public static void main(String[] args) {
	
//		/* EJERCICIO 1.-Realiza un programa que reciba dos números por teclado
//		 *  e indique cuál es el mayor o si son iguales.
//		 */
//		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce primer valor");
		int numero1 = entrada.nextInt();
		System.out.println("Introduce segundo valor");
		int numero2 = entrada.nextInt();
		
		if (numero1>numero2) {
			System.out.println( numero1 + "Es mayor que" + numero2 );
			}else if (numero2>numero1) {
				System.out.println( numero2 + "Es mayor que" + numero1 );
			}else {
				System.out.println( numero1 + "y" + numero2 + "son iguales" );
			}
		
		
		

	} //Cierre del main 

}//Cierre de clase
