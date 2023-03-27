package com;

public class Ciclos1_MVB {

	public static void main(String[] args) {
		// EjerCicio 1:Programa un algoritmo que realice la tabla de multiplicar del 12
		
	    int numero = 12;
		for (int i=1; i<=10; i++) {
     	String resultado = String.format("%d x %d = %d",numero,i,numero*i);
			System.out.println(resultado);
		}

	}

}
