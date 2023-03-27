package com;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		float alumnos,viaje;
		Scanner entrada = new Scanner(System.in);
		System.out.println("total de alumnos:");
		alumnos=entrada.nextFloat();
		if(alumnos>=100) {
			viaje=65*alumnos;
			System.out.println("el costo del viaje sera:"+viaje);
		}
		else if(alumnos>=50 && alumnos<100) {
			viaje=70*alumnos;
			System.out.println("el costo del viaje sera:"+viaje);
		}
		else if(alumnos>=30 && alumnos<50) {
			viaje=95*alumnos;
			System.out.println("el costo del viaje sera:"+viaje);
		}
		else {
			viaje=4000/alumnos;
			System.out.println("el precio por alumno es:"+viaje);
		}

	}

}
