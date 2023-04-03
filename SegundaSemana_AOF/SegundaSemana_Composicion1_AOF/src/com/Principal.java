package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Estereo estereo = new Estereo ("kenwood",4000,2,"12volts");
		llantas neumaticos = new llantas ("GRABBER AT","315/50 R15 96V","GENERAL");
		Asientos Asientos=new Asientos ("Negro","Piel");
		Automovil sedan = new Automovil ("MG","2023","AMARILLO",4,estereo,neumaticos,Asientos);
		System.out.println(sedan);
		
	}

}
