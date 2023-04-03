package com;

public class Principal {

	public static void main(String[] args) {

		//Instanciando a una nueva persona.
		
		/*
		 * Al intentar instanciar a la clase persona, una vez que la volvimos
		 * abstracta, marca error, ya que las clases abstractas no pueden ser 
		 * instanciadas.
		 */
		
//		Persona persona1 = new Persona("Pedro Javier de Garza Lima", "Masculino", 28);
//		System.out.println(persona1);
//		persona1.respirar();
//		persona1.comer("Pizza");
//		persona1.comer();
		
		//Instanciar a un empleado.
		
		Empleado empleado1 = new Empleado("Jose Antonio López Piña", "Masculino", 30, 29000, "Desarrollador Java", 12345, "LOPJ931227Z03");
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer("Alitas de pollo");
		
		Vendedor vPiso = new Vendedor();
		vPiso.setNombre("Juan");
		vPiso.setPuesto("Vendedor Cajero");
		vPiso.setComision(0.05);
		
		System.out.println(vPiso);
		vPiso.finalizarVentas();
		
		/*
		 * ACTIVIDAD.
		 * 
		 * Crear una clase ej. animal y heredar a otra clase hija
		 * ej. perro, gato, etc.
		 * 
		 * ACTIVIDAD.
		 * Crear otro proyecto llamado Calculadora_AKVB
		 * Crear una clase principal con el método main()
		 * Clase abstracta llamada calculadora.
		 * Añadir atributos (modelo, etc)
		 * Declarar cuatro métodos abstractos (Suma, resta, multiplicación, división)
		 * Crear otra clase llamada científica que será la encargada de implementar
		 * los métodos.
		 * Una vez hecho esto, instanciar a un objeto de científica en la clase 
		 * principal, y llaman al método que gusten
		 */
		
	}

}
