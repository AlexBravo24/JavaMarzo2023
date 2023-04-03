package com;

public class Principal {

	public static void main(String[] args) {
		
		Cámara camara = new Cámara (3,"Sí",108);
		Hardware espec = new Hardware (6,"Snapdragon 732G",220);
		Características carac = new Características ("Android 11","Beige","Bluetooth");
		
		Teléfono MotoG60 = new Teléfono ("Motorola",6.8,"Telcel",6000,camara,espec,carac);
		
		System.out.println(MotoG60);

		
	}

}
