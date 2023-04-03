package com;

public class Principal_LARZ {

	public static void main(String[] args) {
		
		Estereos este = new Estereos ("Sony",350);
		Llantas lla = new Llantas ("Michelin",1290,4);
		Asientos as = new Asientos ("Desconocida","Negro","Piel");
		
		Carro c = new Carro ("Mazda",2022,50000,"vino",este,lla,as);
		
		System.out.println(c);

	}

}
