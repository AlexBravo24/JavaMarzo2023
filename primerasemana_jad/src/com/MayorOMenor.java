package com;

import java.util.Scanner;

public class MayorOMenor {

	public static void main(String[] args) {
		int a,b; //declaramos 2 variables enteras para guardar los 2 numeros
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduzca el primer numero");
		a=entrada.nextInt();// se guarda 
		System.out.println("introduzca el segundo numero");
		b=entrada.nextInt();
		if(a<b) {
			System.out.println("el numero mayor es:"+b);
		}
		else if(a>b) {
			System.out.println("el numero mayor es:"+a);
		}else {
			System.out.println("los numeros son iguales");
		}

	}

}
