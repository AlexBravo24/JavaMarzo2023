package com;

public class Principal_LARZ {
	
	public static void main(String[] args) {
		
		Procesador procesador = new Procesador ("M2",4,1.3);
		Pantalla pantalla = new Pantalla ("AMOLED",5.5,2.3);
		Bateria bateria = new Bateria ("G-05493",4800);
	
		Telefono celular = new Telefono ("Apple",2022,"Negro",procesador,pantalla,bateria);
		
		System.out.println(celular);
}
	
}
