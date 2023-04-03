package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando a una nueva persona
		
		//Al intentar instanciar a la clase persona
		//una vez que la volvimos abstracta, nos marca error
		//porque las clases abstractas nopueden ser instanciadas
		
//		Persona persona1 = new Persona ("Monse","Femenino",28);
//		System.out.println(persona1);
//		persona1.respirar();
//		persona1.comer("pizza");
		
		//Instanciar a un empleado
		Empleado empleado1 = new Empleado("Pedro","Masculino",27,29000,
				"Desarrollador Java",12345,"SACP950331VCA");
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer();
		empleado1.trabajar();

		//Instanciar un vendedor
		
		Vendedor vPiso = new Vendedor ();
		vPiso.setNombre("Juan");
		vPiso.setPuesto("Vendedor Cajero");
		vPiso.setComisi�n(.05);
		
		System.out.println(vPiso);
		vPiso.vender();
		
		//ejemplo - Crear una clase animal y heredar a otra clase hija
		//como por ejemplo un perro, un gato, etc.

		//Crear otro proyecto, al cual van a llamar Calculadora_PRSC
		//Crear clase principal con su m�todo main
		//Crear clase llamada calculadora
		//A�adir par de atributos
		//Declarar 4 m�todos abstractos (suma, resta, multiplicaci�, divisi�n)
		//Crear otra clase llamada Cient�fica y est� ser� la encargada de implementar los m�todos
		//Una vez hecho esto, instancian un objeto de cient�fica en la clase
		//principal y llaman al m�todo que gusten(suma, resta, multiplicaci�n, divisi�n)
		
	}

}
