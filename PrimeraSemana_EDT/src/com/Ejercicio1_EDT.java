package com;
import java.util.Scanner;
public class Ejercicio1_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		int num1 = my_scanner.nextInt();
		System.out.println("Introduzca el segundo número");
		int num2 = my_scanner.nextInt();
		
		if (num1 > num2) {
			System.out.println("El número mayor es: " + num1);
		} else {
			System.out.println("El número mayor es: " + num2);
		}
			
	}

}
