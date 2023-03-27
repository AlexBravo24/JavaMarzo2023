package com;

import java.util.Scanner; 

public class Ejercicio3_PRSC {

	public static void main(String[] args) {
	
		/*
		 * 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		 * segundo número es 0, debe mostrar un mensaje de error.
		 */

		double numero1;
		double numero2;	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el primer valor");
		numero1 = entrada.nextInt();
		
		System.out.println("Introduce el segundo valor");
		numero2 = entrada.nextInt();
				
		if (numero2==0) {
			System.out.println("ERROR");
		} else {
			
			double resultado = numero1/numero2;
			System.out.println("La división de " + numero1 + " entre " + numero2 + " es " + resultado);
		} 
		
 		
	}

}
