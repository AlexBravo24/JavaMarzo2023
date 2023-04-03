package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	    int a;
		Scanner entrada = new Scanner(System.in);
		System.out.println("CALCULADORA");
		Cientifica calculadora1=new Cientifica("CASIO","blanca","FRX-1");
		System.out.println(calculadora1);
		System.out.println("¿Que operacion desea realizar?\n1.-SUMA\n"
				+ "2.-RESTA\n3.-MULTIPLICACIÓN\n4.-DIVICIÓN");
			System.out.println("introduzca el numero");
			a=entrada.nextInt();
		switch (a) {
		case 1:calculadora1.suma();
		break;
		case 2:calculadora1.resta();
		break;
		case 3:calculadora1.multiplicacion();
		break;
		case 4:calculadora1.division();
		break;
		default:
		System.out.println("ERROR, INTENTE OTRA VEZ");
		}
		

	}

}
