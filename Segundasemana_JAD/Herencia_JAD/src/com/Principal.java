package com;

public class Principal {

	public static void main(String[] args) {
		
		// instanciando a una nueva persona
		// al intentar instanciar a la clase persona
		//una ves que la volvimos abstracta, nos mnda error
		//por que las clases abstractas no pueden ser instanciadas
		
//		Persona Persona1 = new Persona ("monse","femenino",28);
//		
//		System.out.println(Persona1);
//		Persona1.respirar();
//		Persona1.comer("torta");
		
		// instancia a un empleado
		Empleado empleado1=new Empleado("pedro","masculino",30,
				29000,"desarrollador java",12345,"FDR5454R");
		
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer();
		empleado1.trabajar();
		
		Vendedor vpiso = new Vendedor();
		vpiso.setComision(0.03);
		

	}

}
