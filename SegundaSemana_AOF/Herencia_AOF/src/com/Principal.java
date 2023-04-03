package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Instanciando a una nueva persona
		//al intentar instanciar a la clase persona 
		//una vez que la volvimos abstracta marca error porque las clases abstractas no pueden ser instanciadas
//		Persona persona1 = new Persona("Monse","Femenino",28);
//		System.out.println(persona1);
		
		//se manda  atraer la clase de personacreada
//		persona1.respirar();
//		persona1.comer("Pizza");
//		persona1.comer();
//		
		
		//Instanciar a un empleado
		Empleado empleado1 = new Empleado("Pedro","Masculino",30,29000,"Desarrollador Java",12345,"OOFA950514");
		
		
		System.out.println(empleado1);
		empleado1.respirar();
		empleado1.comer("Tacos");
		empleado1.trabajar();

		Vendedor vPiso = new Vendedor();
		vPiso.setNombre("juan");
		vPiso.setPuesto("Cajero");
		vPiso.setComision(0.05);
		System.out.println(vPiso);
		vPiso.vender();
		
		
	}

}
