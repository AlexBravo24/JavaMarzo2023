package com;

public class Principal {

	public static void main(String[] args) {
		
		Padre pa = new Padre ("Terrestre","Carnivoro","Domestico");
		Hija hi = new Hija ("Terrestre","Carnivoro","Domestico","Perro","Hogares","Chihuahua");
		
		System.out.println(pa);
		System.out.println(hi);

	}

}
