package com;

import java.util.Scanner;

public class Ejercicio3_RICG {

	public static void main(String[] args) {
		
		int numeuno;
		int numedos;
		int resultado;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		numeuno = entrada.nextInt();
		System.out.println("");
		
		Scanner entradau = new Scanner(System.in);
		System.out.println("Introduce el segundo valor");
		numedos = entrada.nextInt();
		
		resultado = numeuno % numedos;
		
		
		if(numedos == 0) {
			System.out.println("Error al digitar el segundo valor");
		}else{
			System.out.println("EL residuo de la división es " + numeuno + "  " + numedos + " = " + resultado);
			
		}
		

		
	}

}
