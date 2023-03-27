package com;
import java.util.Scanner;
public class Ejercicio3_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.

		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca el primer número");
		int num1 = my_scanner.nextInt();
		System.out.println("Introduzca el segundo número");
		int num2 = my_scanner.nextInt();
		if (num2 == 0) {
			System.out.println("ERROR: El segundo número no puede ser 0");	
		} else {
			System.out.println("El resultado de la divisón entre " + num1 + " y " + num2 + " es: " + num1/num2);	
		}
		
	}

}
