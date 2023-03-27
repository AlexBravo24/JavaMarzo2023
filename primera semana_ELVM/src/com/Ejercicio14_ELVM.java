package com;

import java.util.Scanner;

public class Ejercicio14_ELVM {

	public static void main(String[] args) {
		/*
		 * 14. Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera: Si trabaja 40 
			horas o menos se le paga $16 por hora. Si trabaja más de 40 horas se le paga $16 por cada una de las 
			primeras 40 horas y $20 por cada hora extra
		 */
		//int Dia=0;
		int Horas=0;
		int SalarioS=0;
		int Extras=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("proporcione horas trabajadas : ");
		Horas=entrada.nextInt();
		
		
		if(Horas<=40) {
			SalarioS=Horas*16;
			System.out.println("salario: "+SalarioS);
		}else if(Horas>40){
			Extras=Horas-40;
			SalarioS=(40*16)+(Extras*20);
			
			System.out.println("salario: "+SalarioS);
		}
	}

}
