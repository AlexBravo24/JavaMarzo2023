package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando (creacion de un nuevo objeto) a una nueva persona
		
		//Al instanciar a la clase persona
		//una vez que la volvimos abstracta, nos marca error
		//porque las clases abstractas no pueden ser instanciadas
		
//		Persona persona1 = new Persona ("Monse","Femenino",28);
//		System.out.println(persona1);
//		persona1.respirar();
//		persona1.comer("Pizza");
		
		//Instanciar a un empleado
		
		Empleado empleado1 = new Empleado ("Pedro","Masculino",28,29000,"Desarrollador Java",12345,"PDRE50264");
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer();
		empleado1.trabajar();
		
		//Instanciar a un vendedor
		
		Vendedor vpiso = new Vendedor ();
		vpiso.setNombre("Juan");
		vpiso.setPuesto("Vendedor de cajero");
		vpiso.setComision(0.5);
		System.out.println(vpiso);
		vpiso.vender();

		// Ejemplo - Crear una clase animal y heredar a otra clase hija
		//como por ejemplo un perro, un gato
		
		/*
		 * Crear otro proyecto llamado Calculadora
		 * Crear clase principal con metodo main
		 * crear clase llamada calculadora
		 * añadir atributos
		 * van a declarar 4 metodos abstractos (suma, resta, multiplicacion, division)
		 * crear otra clase llamada cientifica y esta sera la encargada de implementarlos
		 * una vez hecho esto, instanciar un objeto de cientifica en la clase principal
		 * y llaman al metodo que gusten
		 */

	}

}
