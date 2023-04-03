package com;

public class Principal {

	public static void main(String[] args) {
		/*Antes de instancias el objeto mas grande 
		 * primero deben tener valores los otros objetos
		 * 
		 * 
		 */
		//esto es un instanci
		RAM ram=new RAM("Kingston",8,2166,"DDR4");
		Almacenamiento disco=new Almacenamiento("Samsunsg",960 ,"SSD",2.5);
		Procesador cpu=new Procesador("AMD","Ryzen 5", 6 ,12 ,4.8 );
		
		//una vez que tengamos los valores de los otros
		//pasamos el valor del objeto al otro que vamos a crear
		Laptop hp=new Laptop("HP","windows 11","plata",ram,disco,cpu);
		Laptop.getPrecio();
		//verificamos que todo este bien dandole salida de datos en consola
		System.out.println(hp);
		
		
		//Actividad
		//realizar la composicion de otros dos objetos
		//ejemplo--celular-bateria,pantalla,procesador
		//automovil-estereo-llantar-asiento
		

	}

}
