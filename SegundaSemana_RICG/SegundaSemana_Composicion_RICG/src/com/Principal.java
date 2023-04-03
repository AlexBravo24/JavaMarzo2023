package com;

public class Principal {

	public static void main(String[] args) {
	
		//Antes de instanciar el objeto mas grande primero deben tener valores los 
		//otros objetos
		
		RAM ram= new RAM("Kingston",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento ("Samsung",960,"SSD",2.5);
		Procesador cpu= new Procesador("AMD","Ryzem 5",6,12,4.8);
		
		//Una vez que tenemos los valores de los otros pasamos el valor de objeto al otro 
		//que vamos a crear
		Laptop hp= new Laptop("HP","Windows 11","plata","no",ram,disco,cpu);
		Laptop.getPrecio();
		//Verificamos que todo este bien dandole salida de datos en consola
		System.out.println(hp);
		
		//Actividad realizar la composicion de otros dos objetos
		//Ejemplo celular - bateria, pantalla
		//Automovil -Estereo -Llantas, Asientos
		//Nvaja Suiza - Destornillador 
	}

}
