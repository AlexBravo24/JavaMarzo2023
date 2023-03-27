package com;

public class Ciclos7_MVB {

	public static void main(String[] args) {
		// Ejercicio 7: 7- Una persona desea invertir $700.00 en un banco, el cual le otorga un 2% de interés
	//mensual. ¿En cuántos meses tendrá más de $1500, si reinvierte cada mes todo su
	//dinero?
		
		double capital =700.00;
		double interes=0.02;
		double total =0.0;
		int mes = 0;
		
		while(total<1500.00) { // también se puede utilizar for 
			total=total+(capital*interes);
			mes++;
		}
		System.out.println("El capital final es de: "+ total);
		System.out.println("Los meses que se invirtieron son "+mes);

		
		
	}//cierre del main

}
