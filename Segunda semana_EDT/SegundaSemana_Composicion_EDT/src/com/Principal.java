package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ram my_ram = new Ram("KingsTone", 8, 2166, "DDR4");
		Almacenamiento my_almacenamiento = new Almacenamiento("Samsung", 960, "SSD", 2.5);
		Procesador my_procesador = new Procesador("AMD", "Ryzen 5", 6, 12, 4.8);
		Laptop my_laptop = new Laptop("Blanca", "Hp", 12000, my_ram, my_procesador, my_almacenamiento);
		
		System.out.println(my_laptop.toString());
	}

}
