package com;
import java.util.Scanner;
public class Ejercicio12_AKVB {
	public static void main(String[] args)
	{
		double peso, altura, IMC;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que calcula IMC");
		System.out.println("IMC = peso/altura*altura");
		System.out.println("Ingrese peso y altura (kg y m)");
		System.out.println("Ingrese peso...");
		peso = entrada.nextDouble();
		while(peso<0) {
			System.out.println("Favor de ingresar un peso válido.");
			peso = entrada.nextDouble();
		}
		System.out.println("Ingrese altura...");
		altura = entrada.nextDouble();
		while(altura<0) {
			System.out.println("Favor de ingresar una altura válida.");
			peso = entrada.nextDouble();
		}
		IMC = peso/(altura*altura);
		System.out.println("El IMC es: " + IMC);
		if(IMC < 16) {
			System.out.println("CRITERIO DE INGRESO EN HOSPITAL.");
		}else if(IMC >= 16 && IMC < 17 ) {
			System.out.println("INFRAPESO.");
		}else if(IMC >= 17 && IMC < 18 ) {
			System.out.println("BAJO PESO");
		}else if(IMC >= 18 && IMC < 25 ) {
			System.out.println("PESO NORMAL");
		}else if(IMC >= 25 && IMC < 30 ) {
			System.out.println("SOBREPESO (OBESIDAD GRADO I)");
		}else if(IMC >= 30 && IMC < 35 ) {
			System.out.println("SOBREPESO CRÓNICO (OBESIDAD GRADO II)");
		}else if(IMC >= 35 && IMC < 40 ) {
			System.out.println("OBESIDAD PREMÓRBIDA (OBESIDAD GRADO III)");
		}else if(IMC > 40) {
			System.out.println("OBESIDAD MÓRBIDA (OBESIDAD GRADO IV)");
		}else {
			System.out.println("ERROR DE CÁLCULO.");
		}
		System.out.println("\nMe despido, saludos cordiales.");
		entrada.close();
	}
}
