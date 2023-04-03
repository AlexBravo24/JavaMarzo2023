package com;

public class Ciclo7_ELVM {

	public static void main(String[] args) {
		/*
		 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
			mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
			dinero?
		 */
		double inversion=700;
		double interes=0.02;
		double multi;
		double total=0;
		int mes=0;
		while(total<1500) {
			mes++;
			multi=inversion*interes;
			total=multi+inversion;
			inversion=total;
		}
		System.out.println("la cantidad de dinero que tendra: "+total+" y meses en que lo obtuvo fue de: "+mes+" meses");
	}

}
