package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Cargador bateria = new Cargador ("12v","Uso rudo","1 Pza");
	Funda accesorio = new Funda ("negor","Uso rudo","2 pzas");
	ManosLibres audio = new ManosLibres("Inalambricos","1 Par","Beats");
		
	
	Celular Xiaomi = new Celular("Redmi note9", "Android 10","Azul",5000.99,accesorio,bateria,audio);
	
	System.out.println(Xiaomi);
	
	}

}
