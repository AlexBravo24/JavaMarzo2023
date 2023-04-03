package com;

public class Principal {

	public static void main(String[] args) {
		
		//Antes de instancear el objeto mas grande
		//Primero deben tener valores los otros objetos
		
		RAM ram = new RAM("Kingston",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento("Smsung",960,"SSD",2.5);
		Procesador cpu = new Procesador("AMD","Ryzen 5",6,12,4.8);
				
		//Una vez que tenemos los valores de los otros
		//Pasamos el valor del objeto al otro qu evamos a crear
		Laptop hp = new Laptop("HP","Windows 11", 12500.99,"Plata",ram,disco,cpu);
		
		//Verificamos que todo este bien dandole salida de datos en consola
		System.out.println(hp);
		
		//Actividad realizar la composicion de otros dos objetos
		//ejemplo - celular- Bateria, Pantalla, procesador
		//Automovil-Estereo - llantas- asientos
		//Navaja suiza - Destornillador, tijeras...

	}

}
