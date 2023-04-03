package com;

public class Ciclos7_PRSC {

	public static void main(String[] args) {
		/*
		 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		 * mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		 * dinero?
		 */

		double inv = 700;
		int meses = 0;
		
		while (inv<1500) {
			inv=inv*1.02;
			meses++;
		}
		System.out.println("En: " +meses+ " meses tendrá la cantidad de: " +inv);
	}

}
