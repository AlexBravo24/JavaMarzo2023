package com;
import java.util.Scanner;

public class Ciclos2_AKVB {

	public static void main(String[] args) {
		int tabla=0, iteracion = 0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que imprime una tabla de multiplicar hasta"
				+ "la iteraci�n que el usuario indique.");
		System.out.println("\nIngrese el n�mero a multiplicar...");
		tabla = entrada.nextInt();
		System.out.println("�Hasta qu� n�mero se va a multiplicar?");
		iteracion = entrada.nextInt();
		System.out.println("Iprimiendo tabla del " + tabla + "hasta el "
				+ "n�mero " + iteracion + ".");
		for(int i = 1; i <= iteracion; i++) {
			System.out.println(tabla + " x " + i + " = " + tabla*i);
		}
		System.out.println("\nMe despido, saludos cordiales.");
		entrada.close();
	}
}
