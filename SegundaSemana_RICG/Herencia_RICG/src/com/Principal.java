package com;

public class Principal {
	
	public static void main(String[] args) {
		
		//Al intentar instanciar a una persona
		//Al intentar instanciar a la clase Persona una vez que la volvimos abstracta,
		//nos marca error, por que 
		
		
		//Instanciando a una nueva persona
		
		//Persona persona1 = new Persona("Monse","Femenino",28);
		//System.out.println(persona1);
		//persona1.respirar();
		//persona1.comer(" Pizza");	
		//Instanciar a un empleado
		
		Empleado empleado1 = new Empleado("Pedro","Masculino",30,29000,
				"Desarrollador Java",12345,"EEPPRD1254");
		
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer();
		empleado1.trabajar();
		
		//Instanciar a un vendedor 
		
		Vendedor vPiso =new Vendedor();
		vPiso.setNombre("Juan");
		vPiso.setPuesto("Vendedor cajero");
		vPiso.setComision(0.05);
	
		System.out.println(vPiso);
		vPiso.vender();
		
	}

}
