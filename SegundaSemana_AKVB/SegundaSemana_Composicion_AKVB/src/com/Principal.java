package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Antes de Instanciar el objeto más grande se deben tener
		 * los valores de los otros objetos.
		 */
		
		RAM ram = new RAM("Kingston", 8, 2166, "DDR4");
		Almacenamiento disco = new Almacenamiento("Samsung", 960, "SSD", 2.5 );
		Procesador cpu = new Procesador("AMD", "Ryzen 5", 6, 12, 4.8);
		
		/*
		 * Una vez que tenemos los valores de los objetos pequeños,
		 * pasamos el valor al objeto más grande que vamos a crear.
		 */
		
		Laptop hp = new Laptop("HP", "Windows 11", 12500.99, "Plata", ram, disco, cpu);
		
		//Verificamos que todo esté bien dándole salida de datos en consola.
		
		System.out.println(hp);
		
		/*
		 * ACTIVIDAD
		 * Realizar la compisión de otros dos objetos
		 * Ejemplo - Celular - Batería, Pantalla, Procesador.
		 * Automóvil - Estéreo, Llantas, Asientos.
		 * Navaja Suiza - Destornillador, Tijeras, Navaja, etc.
		 * 
		 * ¿Librero?
		 */
		
		
	}

}
