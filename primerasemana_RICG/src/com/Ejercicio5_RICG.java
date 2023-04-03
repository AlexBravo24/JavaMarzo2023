package com;

import java.util.Scanner;

public class Ejercicio5_RICG {

	public static void main(String[] args) {
		
		int nota ;
		int edad ;
		String sexo = "f" ;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce tu Nota");
		nota = entrada.nextInt();
		System.out.println("");
		
		Scanner entradau = new Scanner(System.in);
		System.out.println("Introduce Edad");
		edad = entradau.nextInt();
		
		Scanner entradad = new Scanner(System.in);
		System.out.println("Introduce sexo");
		char sex = entradad.nextLine().charAt(0);
		
		if(nota != 5 && edad != 18 && sex == 'M') {
			System.out.println("NO ACEPTADA");
		}else if(nota == 5 && edad == 18 && sex == 'F') {
			System.out.println("ES ACEPTADA");
		}else {
			
			System.out.println("ES POSIBLE");
		}
		

	}

}
