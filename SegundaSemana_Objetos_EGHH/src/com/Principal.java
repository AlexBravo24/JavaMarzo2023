package com;

public class Principal {
	/*
	 * La clase principal debe ser única, es decir, 
	 * solo existe una clase con el método main, la cual 
	 * se encargará de ejecutar el proyecto o aplicación.
	*/
	public static void main(String[] args) { //Abreviatura: main + ctrl + espacio
		// TODO Auto-generated method stub

		/*
		 * Aquí podemos instanciar a nuestro objeto.
		 * INSTANCIAR = Crear un objeto.
		 * Pregunta entrevista: ¿Diferencia entre clase y objeto?
		 */
		
		/*
		 * Instanciar o crear un objeto Perro
		 */
		
		Perro doberman = new Perro ();
		Perro dalmata = new Perro("Fido",1,8.500,"Moteado");
		
		
		/*
		 * Con ayuda del constructor vacío puedo establecer los valores de sus atributos
		 * mediante los getters & setters.
		 */
		
		doberman.setNombre("Firulais");
		doberman.setEdad(2);
		doberman.setPeso(8.500);
		doberman.setColor("Negro");
		
		System.out.println(doberman);
		System.out.println(dalmata);
		
		/*
		 * Actividad:
		 * 
		 * Modelar 5 objetos - mínimo 3 atributos por objeto másximo 5.
		 * Crear métodos constructores
		 * Getters & Setters
		 * Método toString
		 * Lo van a instanciar aquí en la clase Principal.
		 * Instancian un objeto con todos los parametros.
		 * Instanciar otro de la misma clase, con uno o dos parametros.
		 */
		

		//**ACTIVIDAD**//
		
		Automovil jetta = new Automovil ();
		Automovil virtus = new Automovil ("Azul",2013,"Volkswagen");
		
		jetta.setColor("Negro");
		jetta.setAño(2014);
		jetta.setMarca("Volkswagen");	
	}

}