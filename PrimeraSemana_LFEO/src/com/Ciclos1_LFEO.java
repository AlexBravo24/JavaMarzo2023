package com;

public class Ciclos1_LFEO {
	
	/*
	 * 1.- Programa un algoritmo que realice la tabla de multiplicar del 12
	 * */

	public static void main(String[] args) {
		int numero = 12, mult; //se declara la variable numero y se iguala a 12 que es el numero del que se realizara la tabla
                               //se declara la variable mult que es donde se guardara la multiplicacion de cada numero   		
		
		for(int i=0; i<=10; i++) { //se crea el ciclo for y se indica que i se itere hasta que sea menor o igual a 10
			mult = numero * i;  // se realiza la multiplicacion de 12 por el numero en la posicion de i
			System.out.println("LA MULTIPLICACION DE 12 * "+i+ " ES IGUAL A : " +mult); // se imprime el resultado de la multiplicacion 
			//que se iterara dependiendo al valor de la posicion de i
		}

	}

}
