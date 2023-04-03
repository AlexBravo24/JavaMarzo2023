package com;

public class Principal {

	public static void main(String[] args) {
		// Primero asignamos valores a los objetos que forman parte de otro objeto
		
		RAM ram = new RAM("Kingston",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento ("Samsung",960,"SSD",2.5);
		Procesador cpu = new Procesador ("AMD","Ryzen 5",6,12,4.8);
		
		//Una vez que tenemos los valores de los otros objetos pasamos el valor del objeto al otro que 
		//vamos a crear
		Laptop hp = new Laptop("HP","Windows 11","Plata","Latam",ram,disco,cpu);
		//Laptop.setPrecio(25000.99); //Con static se puede modicicar el precio 
		Laptop.getPrecio();
		
		//Verificamos que todo este bien dandole salida en consola
		System.out.println(hp);
		
		/*Actividad:
		 * Realizar la composición de otros dos objetos de composición
		 */
		

		
	}

}
