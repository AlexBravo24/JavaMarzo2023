package com;

public class Principal {

	public static void main(String[] args) {
		
		// antes de instanciar el objeto mas grande
		//primero deben tener valores los otros obejetos
		
		
		RAM ram=new RAM("kingston",8,2166,"DDR4");
		Almacenamiento disco=new Almacenamiento("samsung",960,"SSD",2.5);
        Procesador cpu = new Procesador ("AMD","Ryzen 5",6,12,4.8);
        Laptop DELL =new Laptop("DELL","WINDOWS 11",12500.99,"negra",ram,disco,cpu);
        
        System.out.println(DELL);
	}

}
