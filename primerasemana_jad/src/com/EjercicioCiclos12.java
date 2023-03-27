package com;

import java.util.Scanner;

public class EjercicioCiclos12 {

	public static void main(String[] args) {
		int edad,sumadeedades=0,i=0;
		float promedio;
		Scanner entrada = new Scanner (System.in);
		do {
			System.out.println("introduzca la edad:");
			edad=entrada.nextInt();
			sumadeedades+=edad;
			i++;
			promedio=sumadeedades/i;
		}while(promedio<=25); {
			
		}
		System.out.println("el promedio rebasa la edad de 25");

	}

}
