package com;

import java.util.Scanner;
import java.util.Scanner;
public class Ciclos8_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		9. Programa Java que lea dos n�meros y muestre los n�meros pares entre ellos
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduca el primer n�mero");
		int num1 = my_scanner.nextInt();
		System.out.println("Introduca el segundo n�mero");
		int num2 = my_scanner.nextInt();
		
		if (num1%2 == 0 && num2%2 != 0) {
			System.out.println("Solamente " + num1 + " es par");
		} else if (num2%2 == 0 && num1%2 != 0) {
			System.out.println("Solamente " + num2 + " es par");
		} else if ((num1%2 == 0 && num2%2 == 0)) {
			System.out.println(num1 + " y " + num2 + " son pares ambos");
		} else {
			System.out.println("Ninguno es par");
		}
	}

}
