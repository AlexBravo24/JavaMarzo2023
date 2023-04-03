package com;

public class Principal {

	public static void main(String[] args) {
		// Instanciando a una nueva persona--instancia:es la creacion de un nuevo objeto
		
		//Al intantar instanciar a la clase persona
		//una vez que volvimos abstracta, nos marca error
		//porque las clases abstractas no pueden ser instanciadas
//		Persona persona1=new Persona("monse","femenino",28/*arguumentos*/);
//		System.out.println(persona1);
//		
//		persona1.respirar();
//		persona1.comer("Pizza");
//		
		
		//instanciar a un empelado con herencia
		Empleado empleado1=new Empleado("pedro","masculino",30,29000,"Desarrollador java",12345,"erddsdfd");
		
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer();
		empleado1.trabajador();

		
		
		
		
		/*crear una clase animal y heredar a otra clase hija
		 * ejemplo perro,gato,etc.
		 * crear nuevo proyecto
		 * 
		 * 
		 */
		//encansulamiento como proteger nuestras informacion
		
		Vendedor vPiso=new Vendedor();
		vPiso.setNombre("juan");
		vPiso.setPuesto("vendedor Cajero");
		vPiso.setComision(0.5);
		System.out.println(vPiso);
		vPiso.vender();
		
	}

}
