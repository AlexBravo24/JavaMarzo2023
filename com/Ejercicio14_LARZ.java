package com;

import java.util.Scanner;

public class Ejercicio14_LARZ {

	public static void main(String[] args) {
		// 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: 
		//Si trabaja 40 horas o menos se le paga $16 por hora. 
		//Si trabaja más de 40 horas se le paga $16 por cada una de las primeras 40 horas y $20 por cada hora extra. 
		
		System.out.println("Programa que calcula el salario semanal de un obrero.");
		System.out.println();
		
		double horas;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba las horas laboradas esta semana: ");
		horas = entrada.nextDouble();
		
		if (horas<=40) {
			System.out.println("Su salario semanal es de: $"+ horas*16);
		}else if (horas>40) {
			double x=40*16;
			double horas2 = horas-40;
			double y = horas2*20;
			System.out.println("Su salario semanal es de: $"+ x + " más: $"+ String.format("%.2f", y) 
			+" dando un total de: $"+ String.format("%.2f", (x + y)));
		}

	}

}
