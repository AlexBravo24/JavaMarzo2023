package com;

import java.util.Scanner;

public class Ciclos2_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		//- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
	//	desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
		//23 x 95 = ???
		int num1;
		int num2;
		int x;
		
		System.out.println("Introduce el número a multiplicar");
		num1 = entrada.nextInt();
		System.out.println("Introduce el número por el cual se va a multiplicar");
		num2 = entrada.nextInt();
		
		

	//int multiplicando = 5 ;
       // int multiplicador = 1;
    do {
    	
    	for (int i=1; i<=1; i++) {
    	int mult=(num1*num2);
         System.out.println (num1 + " * " + i + " = " + mult);
          num2 ++;
    	}	
} while (num2<=num2);     
		
    
		
	}//CIERRA

}//CIERRA
