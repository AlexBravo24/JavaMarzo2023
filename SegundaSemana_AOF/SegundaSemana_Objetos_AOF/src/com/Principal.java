package com;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//La clase principal debe ser unica solo existe una clase con el metodo main
		//la cual se encarga de ejecutar el proyecto o aplicación
		
		
		//aqui podemos instanciar a nuestro objeto 
		//instanciar = cera un objeto
		// pregunta de entrevista
		
		
		//Instanciar aunobjeto perro
		
		Perro doberman = new Perro ();
		//Con ayuda del constructor vacio puedo establecer los valores mediante los 
		// getters y setters
		Perro dalmata = new Perro ("Fido",5,15,"Moteado");
		doberman.setNombre("Firulais");
		
		
		System.out.println(doberman);
		System.out.println(dalmata);
		
		
		
		// Actividad 5 objetos
		
		Torta cubana = new Torta("cubana","bolillo","pierna");
		System.out.println(cubana);
		
	
		
		
		
		
	}//cierra

}//cierra
