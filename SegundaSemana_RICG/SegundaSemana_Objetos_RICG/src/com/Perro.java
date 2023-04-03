package com;

public class Perro {
	//Una clase funciona como una plantilla para modelar un objeto
	
	//caemos en el primer pilar de la POO, que es la abstraccion, traer la idea de objeto
	//en la vida real, de acuerdo a lo que necesitemos en Java. Es decir, vamos a definir
	//del objeto, sus atributos y algunos comportamientos expresados a trav�s de m�todos

	
	// Primero definimos los atributos del objeto
	
	//El empacupsulamiento es otro pilar de la POO que lo que hace es 
	//proteger el acceso a nuestra informaci�n
	//Esto dse lleva a cabo mediante los modificadores de acceso
	//Private, Default, Protected,Public
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	//Metodos constructores 
	//Nos ayudan a crear o construir al objeto como tal
	//con sus respectivos atributos
	
	//Regularmente o convencionalmente van a encontrar dos metodos constructores
	//El cual nos sirve como un "comodin", para instanciar a un objeto sin iniciarlo, sin asignarle valores a un
	
	public Perro() {	}//Ejemplo de constructor vacio
		
	//Metodo Constructor con todos los parametros
    //Este metodo nos ayudara a instanciar a nuestro objeto pero aqui si vamos a requerir
	//declarar todos los atributos

	public Perro(String nombre, int edad, double peso, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}
	//Podemos generar los constructores que sean necesarios. Y no hay limite
	
	
	   //Metodos Conocidos como  Getters & Setters
	
	//Getter - Devuelve el valor asignado de un atributo
	//Setter permite establecer o asignarle valor a un atributo

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

	
	//Nos permite mostrar los atributos del objeto en una salida de datos en consola
	//Actuando como una  "radiografia" de nuestro objeto
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	
}
