package com;

public class Ciclos7_LFEO {
	
	/*
	 * 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés 
      mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su 
      dinero?
	 * */

	public static void main(String[] args) {
		double dinero = 700; //creamos la variable dinero y le asignamos el valor de 700
		int mes = 1; //creamos el cotador y lo iniciamos en 0
		
		for (;;) { //iniciamos el ciclo for sin ningun parametro
		dinero = dinero * 1.02; //vamos asignarle la ganancia de interes al dinero
		if (dinero >= 1500) break; //le otrogamos el parametreo al for que debe terminar hasta que se complete mas de 1500
		mes++; //el contador del mes aumenta                     //con el break terminamos la iteracion
		}
		
		System.out.println("EN : "+mes+ " MESES TENDRA: "); //se imprimen los resultados del mes y el dinero
		System.out.println(dinero);
		

	}

}
