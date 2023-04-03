package com;

public class Principal {

	public static void main(String[] args) {
		
	Cientifica calculadora1 = new Cientifica("Casio","negro","Científica",
			"FX380",8,"Trigonométricas");
	System.out.println(calculadora1);

	calculadora1.restar();   
	calculadora1.tomarTemperatura();
	}

}
