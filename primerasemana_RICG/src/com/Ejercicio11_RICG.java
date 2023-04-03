package com;

import java.util.Scanner;

public class Ejercicio11_RICG {

	public static void main(String[] args) {
		int kg ;
		int an=24 ;
		int ac=20;
		int as=21;
		int e=10;
		int a=18;
		int opcion;
		int r1;
		int r2;
		int r3;
		int r4;
		int r5;
		
		System.out.println(" 1 America del Norte");
		System.out.println(" 2 America del Central");
		System.out.println(" 3 America del Sur");
		System.out.println(" 4 Europa");
		System.out.println(" 5 Asia");
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la opción donde se dirige tu paquete");
		opcion = entrada.nextInt();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingresa el peso de tu paquete");
		kg = entrada1.nextInt();
		
		r1 = kg * an;
		r2 = kg * ac;
		r3 = kg * as;
		r4 = kg * e;
		r5 = kg * a;
		
		
		
		if(opcion == 1) {
			System.out.println("Tu cobro es = " +r1);
		}else if(opcion ==2) {
			System.out.println("Tu cobro es = " +r2);
		}else if(opcion == 3) {
			System.out.println("Tu cobro es = " +r3);
		}else if(opcion == 4) {
			System.out.println("Tu cobro es = " +r4);
		}else if (opcion == 5) {
			System.out.println("Tu cobro es = " +r5);
		}else if(kg >=6) {
			System.out.println("Tu paquete rebasa el peso, por lo tanto, no puede ser enviado ");
		}
	}

}
