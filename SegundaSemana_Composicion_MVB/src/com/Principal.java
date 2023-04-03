package com;

public class Principal {

	public static void main(String[] args) {
	
	//Antes de instanciar el objeto más grande 
	//primero deben tener valores los otros objetos
		
		RAM ram = new RAM("Kingston",8,2166,"DDR4");
		Almacenamiento disco = new Almacenamiento ("Samsung",960,"SSD",2.5);
		Procesador cpu = new Procesador ("AMD","Ryzen 5",6,12,4.8);
		
	//una vez que tenemos los valores de los otros
	//pasamos el valor del objeto al otro que vamos a crear
		Laptop hp = new Laptop("HP","Windows 11",12500.99,"Plata","qrw",ram,disco,cpu);
		;
//verificamos que todo este bien dandole salida de datos en consola 		
		System.out.println(hp);
		
//actividad:
//realizar la composición de otros 2 objetos
//Ejemplo - celular - bateria, pantalla, procesador
//       -automóvil-estereo-llanatas-asientos
		
		
		
		
		
	}

}
