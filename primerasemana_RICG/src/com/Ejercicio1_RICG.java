package com;

import java.util.Scanner;

public class Ejercicio1_RICG {

	public static void main(String[] args) {
		
		int numeuno;
		int numedos;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el primer valor");
		numeuno = entrada.nextInt();
		System.out.println("");
		
		Scanner entradau = new Scanner(System.in);
		System.out.println("Introduce el segundo valor");
		numedos = entrada.nextInt();
		
		
		if(numeuno == numedos){
			
		 System.out.println("Los valores introducidos son iguales");
		
		}else if(numeuno > numedos) {
			System.out.println("El primer valor es mayor");
		}else  if(numeuno < numedos){
			System.out.println("El segundo valor es mayor");
		
		}

	}

}
