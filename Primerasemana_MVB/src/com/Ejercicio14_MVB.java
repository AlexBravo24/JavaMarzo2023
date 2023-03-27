package com;

import java.util.Scanner;

public class Ejercicio14_MVB {

	public static void main(String[] args) {
		// EJERCICIO 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40
		//horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las
		//primeras 40 horas y $20 por cada hora extra.

		Scanner entrada = new Scanner (System.in);
		int horasTrabajadas;
		double salario;
		final int horasBase = 40; // horas base de trabajo
		final double pagoBase = 16; // pago por hora base
        final double pagoExtra = 20; // pago por hora extra
        
        System.out.println("Ingrese el numero de horas trabajadas a la semana");
        horasTrabajadas = entrada.nextInt();
        
        if (horasTrabajadas <= horasBase) {
            salario = horasTrabajadas * pagoBase;
        } else {
            salario = horasBase * pagoBase + (horasTrabajadas - horasBase) * pagoExtra;
        }
        
        System.out.println("El salario semanal es: $" + salario);
	}

}
