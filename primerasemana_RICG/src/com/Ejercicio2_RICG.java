package com;

import java.util.Scanner;

public class Ejercicio2_RICG {

	public static void main(String[] args) {
		int numeuno;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un valor");
		numeuno = entrada.nextInt();
		System.out.println("");
		
		if(numeuno %2 ==0) {
			System.out.println("El numero es par");
		}else {
			System.out.println("El numero es impar");
		}
		
	}

}
