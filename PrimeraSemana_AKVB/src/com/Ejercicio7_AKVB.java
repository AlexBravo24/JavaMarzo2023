package com;
import java.util.Scanner;

public class Ejercicio7_AKVB {

	public static void main(String[] args) {
		int alumnos;
		double costo=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("PROGRAMA QUE EMITE EL COSTO DEL VIAJE POR ALUMNO.");
		System.out.println("Ingrese el número de Alumnos...");
		alumnos = entrada.nextInt();
		System.out.println("Alumnos: " + alumnos);
		System.out.println("CALCULANDO COSTO...");
		if(alumnos>=100) {
			costo = 65;
		}else if(alumnos>=50 && alumnos<100){
			costo = 70;
		}else if(alumnos>=30 && alumnos<50) {
			costo = 95;
		}else if (alumnos<30) {
			costo = 4000/alumnos;
		}
		System.out.printf("\nEl costo es: " + "%.2f", costo);
		System.out.printf(" Euros\n");
		
		System.out.println("\nMe despido, saludos cordiales.");
		
		entrada.close();
	}

}
