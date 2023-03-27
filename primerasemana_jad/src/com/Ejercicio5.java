package com;

import java.util.Scanner;

public class Ejercicio5 {


	public static void main(String[] args) {
		int edad;
		float nota;
		char sexo;
		Scanner entrada =new Scanner(System.in);
		System.out.println("introduzca la nota:");
		nota=entrada.nextFloat();
		System.out.println("introduzca la edad:");
		edad=entrada.nextInt();
		System.out.println("introduzca el sexo:");
		sexo=entrada.next().charAt(0);
		if(nota==5 && edad==18 && sexo=='m') {
			System.out.println("POSIBLE");
		}
		else if(nota==5 && edad ==18 && sexo=='f') {
			System.out.println("ACEPTADA");
		}
		else 
			System.out.println("NO ACEPTADA");

	}

}
