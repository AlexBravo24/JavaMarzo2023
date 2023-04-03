package com;

public class Perro {
	//una clase funciona como una plantilla para modelar un objeto
	//caemos en el primer pilar de la Poo, que es la abstraccion
	//traer la iidea del objeto en la vida real, de acuerdo
	//a lo que necesiamos en java. Es decir , vamos a definir 
	//del objeto, sus atributos y algnos comportamientos
	//expresados a traves de metodos.
	
	//primero definimos los atributoas del perro
	
	//el encapsulamiento es otro pilar de la poo, que lo que hace es
	//el proteger el acceso a nuestra informacion
	//esto se lleva acabo mediante los modificadores de acceso
	//Private,Default, Protected, Public
	
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	//Metodos constructores 
	//nos ayuda acrear o contruir al objeto como tal,
	//es decir, nos va ayudar con sus respectivos atributos.
	
	//Regularmente o convencionalmente
	//van a encontrar dos metodos constuctores
	
	//El primero es el constructor vacio
	//el cual nos sirve como un "comodi", para instanciar
	//a un objeto sin iniciarlo, sin asignarle valores aun
	//los consutrctores vacio se declara de la siguiente manera
	
	public Perro() {}//ejemplo e constuctor vacio
	/*Metodo constuctorcon todos los parametros
	 * este metodo nos ayudara a instanciar a nuestros objetos
	 * pero aqui si vamos a requierir declaras todos sus atributos
	 * 
	 */

	/*el hace mension a la clase osea al programa*/
	//metodos getters y setter
	
	//Getter-lo que hace es devolvernos el valor asginado de un atributo
	//setter-nos permite establecer o asignarle valor a un atributo
	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}

	public String getNombre() {
		return nombre;//obtiene el nombre
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;//estable el nombre
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	/*metodo toString
	 * nos permite mostrar los atributos del objeto
	 * en una salida de datos en consola
	 * actuando como una "radiografia" de nuestro objeto
	 * |
	 * |
	   v
	 */
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	

}
