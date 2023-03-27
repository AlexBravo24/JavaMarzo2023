package com;

public class Ciclos6_EVVC {

	public static void main(String[] args) {
		/*- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
		 * mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
		 * todo el dinero lo reinvierte?
		 */

		double inversión=1000;
		double interes=0.02;
		
		for (int i=1 ; i<=12 ; i++) {
			
			inversión=inversión +(inversión*interes);
			
		}
		System.out.println("La cantidad de dinero ganada es de  ");
		System.out.printf("%.4f", inversión);
	}

}
