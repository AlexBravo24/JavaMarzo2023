package com;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Antes de instanciar el objeto mas grande 
		 * primero deben tener valores los otros objetos
		 * 
		 */

		RAM ram = new RAM ("Kingston",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento ("Samsung",960,"SSD",2.5);
		Procesador cpu = new Procesador ("AMD","Ryzen 5",6,12,4.8);
		/*
		 * Una vez tenemos los valores de los otros
		 * pasamps el valor del objeto al otro que vamos a crear
		 */
		Laptop hp = new Laptop ("HP","Windows 11",1250099,"Plata",ram,disco,cpu);
		
		//Verificar que todo este bien dandole salida de datos en consola
		System.out.println(hp);
		
		/*
		 * Actividad 
		 * Realizar la composicion de otros dos objetos
		 * Ejemplo - Celular - Bateria, Pantalla, procesador
		 * Ejemmplo - Auto - Estereo, llantas, Asientos
		 */
		
	}

}
