package com;

import java.util.Scanner;

public class Ejercicio7_RICG {

	public static void main(String[] args) {
		
		String autobus;
		int euro;
		int alumno;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numero de alumnos");
		alumno = entrada.nextInt();
		System.out.println("");
		
		if(alumno >= 100) {
			System.out.println("El costo de tu pasaje es de 65 euros");
		}else if(alumno >=50 && alumno <=99) {
			System.out.println("El costo de tu pasaje es de 70 euros");
		}else if(alumno >=29 && alumno <=49) {
			System.out.println("El costo de tu pasaje es de 95 euros");
		}else if(alumno >1  && alumno<=30) {
			System.out.println("El costo de tu pasaje es de 134 euros");
			
		}

	}

}
