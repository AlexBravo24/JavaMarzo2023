package com;

public class Ciclos6_MVB {

	public static void main(String[] args) {
// Ejercicio 6 Una persona desea invertir $1000.00 en un banco, el cual le da un 2% deinter�s
//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
//todo el dinero lo reinvierte?

		double inversion = 1000;
		for (int i=0; i<12; i++) {
			inversion = inversion + (inversion*0.02);
		}
		System.out.println("La cantidad a ganar en un a�o es:");
		System.out.printf("%.2f",inversion);
		
		
		
		
	}//cierre del main

}//cierre de la clase 

