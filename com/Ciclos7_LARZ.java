package com;

public class Ciclos7_LARZ {

	public static void main(String[] args) {
		// 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de inter�s
		//mensual. �En cu�ntos meses tendr� m�s de $1500, si reinvierte cada mes todo su
		//dinero?
		System.out.println("Programa que te muestra la cantidad de meses necesarios para obtener "
				+ "m�s de $1500 si el inter�s es del 2% mensual y reinvirtiendo las ganancias.");
		System.out.println();
		
		System.out.println("La cantidad de dinero invertido inicial es de $700.00");
		double capital=700.00;
		double interes;
		int meses = 0;
		
		while (capital<=1500.00) {
			
			meses++;
			interes = capital * 0.02;
			capital += interes;
		
		} System.out.println("El n�mero de meses que necesitaras es de: "+ meses);

		
		
		
	}

}
