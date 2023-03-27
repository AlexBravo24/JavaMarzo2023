package com;

public class Ciclos7_EVVC {

	public static void main(String[] args) {
		/*Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
		 * mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su dinero?
		 */

		double inversión=700;
		double interes=0.02;
		int mes=0;
		
		while (inversión<1500) {
			inversión=inversión+(inversión*interes);
			mes++;
		}
		
		System.out.println(mes);
	}

}
