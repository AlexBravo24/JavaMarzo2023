package com;

public class Ciclos6_LARZ {

	public static void main(String[] args) {
		// 6.- Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% de inter�s
		//mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr� al cabo de un a�o si
		//todo el dinero lo reinvierte?
		
		System.out.println("Programa que te muestra la cantidad de dinero al finalizar el a�o con un "
				+ "interes del 2% mensual y reinvirtiendo las ganancias.");
		System.out.println();
		
		System.out.println("La cantidad de dinero invertido inicial es de $1000.00");
		double inicio=1000.00;
		
				
		for (int i=1; i<13; i++) {
			inicio = inicio + (inicio * 0.02);
		} System.out.printf("%nEn el mes de Diciembre el interes es de: %.2f", inicio);
	}
}
