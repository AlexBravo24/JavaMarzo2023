package com;

public class Principal {

	public static void main(String[] args) {
		
		Velocidades velocidades = new Velocidades ("Shimano turney", 8, 2 , "Hidra�licos");
		Suspensi�n suspensi�n = new Suspensi�n ();
		Frenos frenos = new Frenos ("Sram guide","V break","Mec�nicos");
		
		Bicicleta ruta = new Bicicleta ("Trek", 29, "Fibra de carbono","Blanca",velocidades,suspensi�n,frenos);
		
		System.out.println(ruta);

	}

}
