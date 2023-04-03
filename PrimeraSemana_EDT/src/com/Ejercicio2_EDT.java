package com;
import java.util.Scanner;
public class Ejercicio2_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2.Realiza un programa que pida un número por teclado y nos indique si es par o impar.
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca un número");
		int num = my_scanner.nextInt();
		
		if (num%2 == 0) {
			System.out.println("El número es par");
		} else {
			System.out.println("El número no es par");
		}
	}

}
