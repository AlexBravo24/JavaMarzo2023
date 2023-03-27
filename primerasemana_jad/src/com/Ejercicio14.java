package com;

import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		int horas,extra,salario,extrahoras;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el número de horas trabajadas");
		horas=entrada.nextInt();
		if(horas>40) {
			salario=40*16;
			extra=(horas-40)*20;
			extrahoras=salario+extra;
			System.out.println("el salario es de: "+extrahoras);
		}
		else if(horas<=40) {
			salario=horas*16;
			System.out.println("el salario es de: "+salario);
		}

	}

}
