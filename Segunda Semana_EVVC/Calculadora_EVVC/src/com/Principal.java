package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int i;
		int j;
		int opci�n;
		
		Cient�fica cient�fica1= new Cient�fica("Casio","FX380", "120","Solar","Programable");
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Elige la operaci�n que deseas hacer\n 1.- Suma\n  2.- Resta\n"
				+ "3.- Multiplicaci�n\n 4.- Divisi�n\n");
		opci�n=entrada.nextInt();
		
		System.out.println("Indica el primer n�mero");
		i= entrada.nextInt();
		
		System.out.println("Indica el segundo n�mero");
		j= entrada.nextInt();
		
		System.out.println(cient�fica1);
		cient�fica1.tomarTemperatura();
		
		
		switch (opci�n) {
		
		case 1:
			cient�fica1.sumar(i, j);
			break;
		case 2:
			cient�fica1.restar(i, j);
			break;
		case 3: 
			cient�fica1.multiplicar(i, j);
			break;
		case 4:
			cient�fica1.dividir(i, j);
			break;
		}
		

	}

}
