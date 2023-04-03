package com;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		int i;
		int j;
		int opción;
		
		Científica científica1= new Científica("Casio","FX380", "120","Solar","Programable");
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Elige la operación que deseas hacer\n 1.- Suma\n  2.- Resta\n"
				+ "3.- Multiplicación\n 4.- División\n");
		opción=entrada.nextInt();
		
		System.out.println("Indica el primer número");
		i= entrada.nextInt();
		
		System.out.println("Indica el segundo número");
		j= entrada.nextInt();
		
		System.out.println(científica1);
		científica1.tomarTemperatura();
		
		
		switch (opción) {
		
		case 1:
			científica1.sumar(i, j);
			break;
		case 2:
			científica1.restar(i, j);
			break;
		case 3: 
			científica1.multiplicar(i, j);
			break;
		case 4:
			científica1.dividir(i, j);
			break;
		}
		

	}

}
