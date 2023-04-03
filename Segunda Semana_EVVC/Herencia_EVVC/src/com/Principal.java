package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando(creaci�n de un nuevo objeto) a una nueva persona
		//Al intentar instancias a la clase persona una vez que la volvimos abstracta marca error
		//porque las clases abstractas no pueden ser instanciadas
		
//		Persona persona1=new Persona ("Eva","Femenino",25);
//		System.out.println(persona1);
//		persona1.respirar();
//		persona1.comer("Albondigas");
//		persona1.comer();
		
		Empleado empleado1 = new Empleado("Eva","Femenino",25,45000,"Desarrollador Java", 56985,
				"VICE980306");
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer("Pizza");
		empleado1.comer();
		empleado1.trabajar();
		
		//Instaciar a un vendedor
		
		Vendedor vPiso=new Vendedor ();
		vPiso.setNombre("Juan");
		vPiso.setPuesto("Cajero");
		vPiso.setComisi�n(0.05);
		
		System.out.println(vPiso);
		vPiso.vender();

		
		/*Actividad, crear una clase padre que le herede a clases hijas.
		 * Ejemplo -Crear una clase animal y heredar a otra clase hija, como por ejemplo un perro,
		 * un gato, etc. Crear un nuevo proyecto para hacerlo
		 */
		
		
		/*Crear un nuevo proyecto que se va a llamar Calculadora_EVVC:
		 * Crear una clase principal con su m�todo main
		 * Crear una clase llamada Calculadora
		 * A�adir un par de atributos
		 * Declarar 4 m�todos abstractos (suma, resta, multiplicaci�n, divisi�n)
		 * Crear otra clase llamada Cient�fica y esta ser� la encargada de implementar los m�todos.
		 * Una vez hecho todo eso, instanciar un objeto de cient�fica en la clase principal y 
		 * llaman a al m�todo que gusten.
		 */
	}
	
	

}
