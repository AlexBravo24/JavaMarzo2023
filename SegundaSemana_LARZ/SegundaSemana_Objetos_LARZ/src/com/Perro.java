package com;

public class Perro {
	
	// una clase funciona como una plantilla para modelar un objeto
	
	//Caemos en el primer pilar de la POO, que es la abstraccion
	//Traer la idea del objeto en la vida real, de acuerdo a lo
	//que necesitamos en Java. Es decir, vamos a definir
	//del objeto, sus atributos y algunos comportamientos
	//expresados a traves de metodos
	
	//Primero definimos los atributos del objeto
	
	//El encapsulamiento es otro pilar de la POO que lo que hace es 
	//proteger el acceso a nuestra informacion
	//Esto se lleva a cabo mediante los modificadores de acceso
	//Privete, Default, Protected, Public
	
	
	private String nombre;
	private int edad;
	private double peso;
	private String color; 
	
	//Metodos constructores
	//Nos ayudan a crear o construir al objeto como tal
	//con sus respectivos atributos
	
	// Regularmente o convencionalmente
	// Van a encontrar dos metodos constructores
	
	//El primero es el constructor Vacio
	//El cual nos sirve como un "comodin", para instanciar
	//a un objeto sin iniciarlo, sin asignarle valores aun
	
	public Perro () {} //Ejemplo de constructor vacio
	
	// Metodo constructor con todos los parametros
		// Este metodo nos ayuda a instanciar a nuestro objeto
		// pero aqui si vamos a requerir declarar todos sus atributos
		

	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}

	//Podemos generar los constructores que sean necesarios. Y no hay limite
	
	// Metodos Getters & Setters
	
	// Getter - Devolvernos el valor asignado de un atributo
	//Setter - Nos permite establecer o asignar un valor a un atributo
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	//Metodo toString 
		//Nos permite mostrar los atributos del objeto en una salida
		//de datos en consola, actuando como una "radiografia" de nuestro objeto
		

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}

	

	
	
	
	
	

}
