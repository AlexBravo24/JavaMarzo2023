package com;

public class Principal {

	public static void main(String[] args) {
		
		C�mara camara = new C�mara (3,"S�",108);
		Hardware espec = new Hardware (6,"Snapdragon 732G",220);
		Caracter�sticas carac = new Caracter�sticas ("Android 11","Beige","Bluetooth");
		
		Tel�fono MotoG60 = new Tel�fono ("Motorola",6.8,"Telcel",6000,camara,espec,carac);
		
		System.out.println(MotoG60);

		
	}

}
