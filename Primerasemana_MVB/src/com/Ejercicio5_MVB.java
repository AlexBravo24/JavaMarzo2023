package com;

import java.util.Scanner;

public class Ejercicio5_MVB {

	public static void main(String[] args) {
		
	//EJERCICIO5 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
		//parámetros: edad, nota y sexo.
		// Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		// Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		// Otros casos -> NO ACEPTADA
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la nota");
		int nota = entrada.nextInt();
		System.out.println("Ingrese la edad");
		int edad = entrada.nextInt();
		System.out.println("Ingrese el sexo (M/F):");
		String sexo = entrada.next();
		
		String aceptacion;
		if (nota >= 5 && edad >= 18) {
            if (sexo.equals("M")) {
                aceptacion = "POSIBLE";
            } else if (sexo.equals("F")) {
                aceptacion = "ACEPTADA";
            } else {
                aceptacion = "NO ACEPTADA";
            }
        } else {
            aceptacion = "NO ACEPTADA";
        }

        System.out.println("La solicitud fue " + aceptacion);

    }//Cierre del main
    }//Cierre de la clase
