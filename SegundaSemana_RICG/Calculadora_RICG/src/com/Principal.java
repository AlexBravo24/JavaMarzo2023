package com;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		

		Cientifica c1 = new Cientifica("rosa",125.50,"cientifica","Casio");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int a = sc.nextInt();
		
		System.out.println("Ingrese otro numero");
		int b = sc.nextInt();
		
		System.out.println("El resultado de la suma es:" +(a+b));
		System.out.println("El resultado de la resta es:" +(a-b));
		System.out.println("El resultado de la multiplicacion es:" +(a*b));
		System.out.println("El resultado de la division es:" +(a/b));
		
		c1.tomarTemperatura();
		System.out.println("");
		System.out.println(c1);
		
	}

}
