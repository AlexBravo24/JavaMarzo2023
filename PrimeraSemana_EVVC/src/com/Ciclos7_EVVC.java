package com;

public class Ciclos7_EVVC {

	public static void main(String[] args) {
		/*Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s 
		 * mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su dinero?
		 */

		double inversi�n=700;
		double interes=0.02;
		int mes=0;
		
		while (inversi�n<1500) {
			inversi�n=inversi�n+(inversi�n*interes);
			mes++;
		}
		
		System.out.println(mes);
	}

}
