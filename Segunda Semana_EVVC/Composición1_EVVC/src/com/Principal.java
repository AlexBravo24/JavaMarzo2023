package com;

public class Principal {

	public static void main(String[] args) {
		
		Velocidades velocidades = new Velocidades ("Shimano turney", 8, 2 , "Hidraúlicos");
		Suspensión suspensión = new Suspensión ();
		Frenos frenos = new Frenos ("Sram guide","V break","Mecánicos");
		
		Bicicleta ruta = new Bicicleta ("Trek", 29, "Fibra de carbono","Blanca",velocidades,suspensión,frenos);
		
		System.out.println(ruta);

	}

}
