package com;

public class Principal {

	public static void main(String[] args) {
		// Antes de instanciar el obejor mas grande primero se debe 
		//tener valores enlos osotros objetos
		//
		RAM ram= new RAM ("Kington",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento("Samsung",960,"SSD",2.5);
		Procesador cpu = new Procesador ("AMD","Ryzen 5",6,12,4.8);
		
		
		//Una vez que tenemos los valores de los otros 
		//pasamos el valor del objeto al otro que vamos a crear
		
		
		Laptop hp = new Laptop("HP","WINDOWS11", 12500.99,"Plata",ram,disco,cpu);
		
		//verificamos que todo este bien dandole salida  alos datos en consola
			
		System.out.println(hp);
		
		

	}//cierra

}//cierra
