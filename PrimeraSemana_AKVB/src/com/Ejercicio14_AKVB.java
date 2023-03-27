package com;
import java.util.Scanner;

public class Ejercicio14_AKVB {
	public static void main(String[] args) {
		int horas=0,salario=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula el salario semanal de un Obrero");
		System.out.println("Ingrese el número de horas laboradas.");
		horas = entrada.nextInt();
		while(horas<0) {
			System.out.println("Ingrese un número de horas válido...");
			horas = entrada.nextInt();
		}
		if(horas<40) {
			salario = horas*16;
		}else if(horas>40) {
			salario = 40*16;
			salario = salario + (horas-40)*20;
		}
		
		System.out.println("El salario del obrero por " + horas + " horas es de " + salario + " Euros");
		entrada.close();
		System.out.println("\nMe despido, saludos cordiales.");
	}//main() ENDS
}//class ENDS
