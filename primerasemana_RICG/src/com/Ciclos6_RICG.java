package com;

public class Ciclos6_RICG {

	public static void main(String[] args) {
		/*Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s 
mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si 
todo el dinero lo reinvierte?

*/
		
		double inve=1000;
		double interes=0.02;
		
		
		for(int i=0; i<=12; i++) {
			
			inve= inve +(inve * interes);
			
			System.out.println("Su ganacia anual es : " +inve);
			
		}

	}

}
