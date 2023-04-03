package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Animal animal1 = new Animal ("Mamifero","Carnivoro","Invertebrados");
		System.out.println(animal1);
		
		Gato gatito = new Gato ("Mamifero", "Carnivoro", "Invertebrado", "Pinto", "3 meses", "Lucas");
		
		System.out.println(gatito);
		
//		Perro perrito = new Perro ("Mamifero", "Carnivoro", "Invertebrado", "Pinto", "3 meses", "Lucas","largo rizado");
//		
//		System.out.println(perrito);
	}

}
