package com;

public class Principal {

	public static void main(String[] args) {
		
		//Instanciando a una nueva persona
		
		//Al ententar instanciar a la clase persona,
		//una vez que la volvimos abstracta, nos marca error,
		//Porque las clases abstractas no pueden ser instanciadas
		
//		Persona persona1 = new Persona("Monse","Femenino",28);
//		System.out.println(persona1);
//		persona1.respirar();
//		persona1.comer("Pizza");
//		
		
		//Instanciar un empleado
		
		Empleado empleado1 = new Empleado("Pedro","Masculino",30,29000,"Desarrollador Java",14887046,"EOOL951205JU8");
		
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer();
		empleado1.trabajar();
		
		//Instanciar a un vendedor
		
		Vendedor vPiso = new Vendedor();
		vPiso.setNombre("JUAN");
		vPiso.setPuesto("VENDEDOR CAJERO");
		vPiso.setComision(0.05);
		
		System.out.println(vPiso);
		vPiso.vender();
		
		//Crear una clase animal y heredar a otra clase hija, como por ejemplo un perro, un gato, etc
		
		
		//CRERA UN proyecto Calculadora_iniciales
		//CREAR UNA CLASE PRINCIPAL CON SU METODO main
		//Crear una clase llamada calculadora
		//Le añaden un par de atributos
		//Van a declarar  4 metodos abstractos (suma,resta, multiplicacion y division)
		//Crear otra clase llamada cientifica y esta sera la encargada de implementar los metodos
		//una vez hecho esto, instancian un objeto de cientifica en la clase
		//principal y llaman al metodo que gusten (suma, resta, etc.)

	}

}
