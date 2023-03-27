package com;

import java.util.Scanner;

public class Ejercicio14_LFEO {
	
	/*
	 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
     horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
     primeras 40 horas y $20 por cada hora extra
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double horastrabajadas, salariosemanal, salarioEx, salariototal, pagoxh, pagoxhEx, horasEx; //declaro variables a utilizar
		
		System.out.println("INGRESE CUANTAS HORAS TRABAJO A LA SEMANA :");
		horastrabajadas = entrada.nextDouble(); //pido y guardo las horas trabajadas
		
		if(horastrabajadas<=40) { //se las horas trabajadas son menor o igual a 40
			pagoxh = 16; //equivalencia al pago por hora
			salariosemanal = horastrabajadas * pagoxh; //se calcula el salario semanal
			
			System.out.println("EL TRABAJADOR TRABAJO "+horastrabajadas+ " HORAS  A LA SEMANA"); //se imprime cada una de la informacion calculada
			System.out.println("SU PAGO POR HORA ES DE "+pagoxh);
			System.out.println("SU SALARIO SEMANAL ES DE "+salariosemanal);
		}else { // si las horas trabajadas son mayor a 40
			pagoxh = 16; // pago por hora normal
			salariosemanal = 40 *pagoxh; //se calcula salario semanal
			horasEx = horastrabajadas - 40; //se calcula las horas extras trabajadas
			pagoxhEx =20; //se determina el pago por cada hora extra
			salarioEx = horasEx * pagoxhEx; //se determina el salario extra ganado por cada hora trabajada con su respectivo precio de hora extra
			salariototal = salariosemanal + salarioEx; //se calcula el salario total del trabajador sumando sus horas extras a su salario semanal
			
			System.out.println("EL TRABAJADOR TRABAJO "+horastrabajadas+ " HORAS A LA SEMANA"); //se imprime la informacion
		    System.out.println("TIENE "+horasEx+ " HORAS EXTRAS");
		    System.out.println("SU SALARIO SEMANAL NORMAL ES DE "+salariosemanal);
		    System.out.println("SU SALARIO DE LAS HORAS EXTRAS TRABAJADAS ES DE :"+salarioEx);
		    System.out.println("SU SALARIO TOTAL DE LA SEMANA ES DE : " +salariototal);
			
		}

	}

}
