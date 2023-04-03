package com;

import java.util.Scanner;

public class Ejercicio3_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Crea un programa que pida al ususario dos numero y muestre el resultado de su division.
		//Si el segundo número es cero debe mostrar error
		
		Scanner entrada = new Scanner(System.in);
		int num1;
		int num2;
		System.out.println("Ingresa primer número");
		num1 = entrada.nextInt();
		System.out.println("Ingresa segundo número");
		num2 = entrada.nextInt();
		
		
		
		if(num2==0){
			System.out.println("Error");
			
		}else {
			int resultado = num1/num2; //indica el valor residual n/2 resultado de la division
			
			System.out.println(resultado);
		}
		
		
		
		
	}//cierra

}//cierra
