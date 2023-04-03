package com;

public class Principal {
	/*
	 * La clase principal debe ser �nica, es decir, 
	 * solo existe una clase con el m�todo main, la cual 
	 * se encargar� de ejecutar el proyecto o aplicaci�n.
	*/
	public static void main(String[] args) { //Abreviatura: main + ctrl + espacio
		// TODO Auto-generated method stub

		/*
		 * Aqu� podemos instanciar a nuestro objeto.
		 * INSTANCIAR = Crear un objeto.
		 * Pregunta entrevista: �Diferencia entre clase y objeto?
		 */
		
		/*
		 * Instanciar o crear un objeto Perro
		 */
		
		Perro doberman = new Perro ();
		Perro dalmata = new Perro("Fido",1,8.500,"Moteado");
		
		
		/*
		 * Con ayuda del constructor vac�o puedo establecer los valores de sus atributos
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
		 * Modelar 5 objetos - m�nimo 3 atributos por objeto m�sximo 5.
		 * Crear m�todos constructores
		 * Getters & Setters
		 * M�todo toString
		 * Lo van a instanciar aqu� en la clase Principal.
		 * Instancian un objeto con todos los parametros.
		 * Instanciar otro de la misma clase, con uno o dos parametros.
		 */
		

		//**ACTIVIDAD**//
		
		Automovil jetta = new Automovil ();
		Automovil virtus = new Automovil ("Azul",2013,"Volkswagen");
		
		jetta.setColor("Negro");
		jetta.setA�o(2014);
		jetta.setMarca("Volkswagen");	
	}

}