package com;

public class Principal {

	public static void main(String[] args) {
		
	Cientifica calculadora1 = new Cientifica("Casio","negro","Cient�fica",
			"FX380",8,"Trigonom�tricas");
	System.out.println(calculadora1);

	calculadora1.restar();   
	calculadora1.tomarTemperatura();
	}

}
