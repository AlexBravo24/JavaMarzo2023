package com;

import java.util.Scanner;

public class Ejercicio2_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Ejercicio2 Realiza un programa que nos indique si es par o impar 
		
		Scanner entrada = new Scanner(System.in);
		
		int num1;
		int num2;
		System.out.println("Ingresa un número");
		num1 = entrada.nextInt();
if(num1 % 2==0) {
	System.out.println("Es par");

}else {
	System.out.println("Es impar");
}
		
	}//cierra

}//cierra
