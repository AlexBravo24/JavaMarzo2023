package com;

public class Ciclos6_EVVC {

	public static void main(String[] args) {
		/*- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
		 * mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
		 * todo el dinero lo reinvierte?
		 */

		double inversi�n=1000;
		double interes=0.02;
		
		for (int i=1 ; i<=12 ; i++) {
			
			inversi�n=inversi�n +(inversi�n*interes);
			
		}
		System.out.println("La cantidad de dinero ganada es de  ");
		System.out.printf("%.4f", inversi�n);
	}

}
