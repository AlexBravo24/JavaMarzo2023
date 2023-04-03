package com;

public class Principal {

	public static void main(String[] args) {
		
		//Antes de instanciar el objeto más grande
		//Primero deben tener los valores los otros objetos
			
		RAM ram = new RAM("Kingston",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento("Samsung",960,"SSD",2.5);
		Procesador cpu = new Procesador("AMD","Ryzen 5",6,12,4.8);
		
		//Una vez que tenemos los valores de los otros
		//Pasamos el valor del objeto al otro que vamos a crear
		Laptop HP = new Laptop("HP", "Windows 11","Plata","Latam",ram,disco,cpu);
		Laptop.getPrecio();
		
		//Verificamos que todo esté bien dandole salida de datos en consola
		System.out.println(HP);

		//Actividad
		//Realizar la composición de otros dos objetos
		//Ejemplo - Celular - Batería, Pantalla, Procesador
		//Automóvil - Estereo - Llantas - Asientos
		
		
	}

}
