package com;

public class Ciclos6_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de interés 
//		mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá al cabo de un año si 
//		todo el dinero lo reinvierte?
		
		
		
		double inversion=1000;
				for(int i=0; i<12;i++) {
					inversion=inversion+ (inversion*0.02);			
				}
				System.out.println("la cantidad a ganar en un año es");
				System.out.print(inversion);

	}

}
