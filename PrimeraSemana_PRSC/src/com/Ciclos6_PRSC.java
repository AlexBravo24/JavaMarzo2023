package com;

public class Ciclos6_PRSC {

	public static void main(String[] args) {
		/*
		 * 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		 * mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		 * todo el dinero lo reinvierte?
		 */

		double inv = 1000;
		double inte = .02;
		double total;
		double invn;
		
		for (int i=0; i<=12; i++ ) {
		total = inv*inte;
		invn = inv+total;
		inv = invn;
		
		
		}
		
		System.out.println("La cantidad total de dinero al finalizar el a�o es de: " +inv);
	}

}
