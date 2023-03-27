package com;

public class Ciclos7_RICG {

	public static void main(String[] args) {
	   /* Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
		dinero?
		*/
		
		double inve=700;
		double inte=0.02;
		int mes = 0;

		while(inve <1500) {
			
			inve=inve+(inve*inte);
			mes++;
		}
		
		System.out.println("Los meses invertidos son: " +mes+ " La inversion propuesta es : " +inve);

	}

}
