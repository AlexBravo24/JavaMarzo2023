package com;

import java.util.Scanner;

public class Ejercicio1_EVVC {

	public static void main(String[] args) {
		/*1.- Realiza un programa que reciba dos n�meros por teclado e indique
		 * cual es mayor o si son iguales.
		 */

		int numeone;
		int numetwo;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un primer valor:");
		numeone = entrada.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce un segundo valor:");
		numetwo = entrada2.nextInt();
		
		if (numeone>numetwo) {
			System.out.println( "El n�mero " + numeone +" es mayor que el numero "+ numetwo);
		}else if (numeone<numetwo) {
			System.out.println("El n�mero " + numetwo + " es mayor que "+ numeone);
		}else {
			System.out.println("Los n�meros son iguales");
		}
	}

}
