package com;

public class Perro {
    // una clase funciona como una plantilla para modelar un objeto
	// caemos en el primer pilar de la POO que es la abstraccion
	//traer la idea del objeto a la vida real de acuerdo a lo que necesitemos
	// en java, es decir , vamos a definir del objeto, sus atributos y algunos
	//comportamientos expresados a raves de metodos
	
	//primero definimos los atributos del objeto
	
	//el encapsulamiento es otro pilar de la POO, que lo que hace es proteger el acceso 
	// a nuestra informacion
	// esto lleva a acabo mediante los modificadores de acceso
	//Private,Default,Protected,Public
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	public Perro() { // metodo de constructor vacio
		
	}
	//metodos constructores, nos ayudan a crear o a construir el objeto como tal
		//con sus respectivos atributos
		//regularmente o convencionalmente van a encontrar 2 metodos constructores
		// el primero es el constructor vacio el cual nos sirve como un "comodin"
		//para instanciar a un objeto sin iniciarlo
		
	
	public Perro(String nombre, int edad, double pedo, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = pedo;
		this.color = color; // metodo constructor con todos los parametros
	}
	// podemos generar constructores que sean necesarios, no hay limite
	
		// metodos getters setters
	// Getter - devolvernos el valor signado a un tributo
	// Setter - nos permite asignarle valor a un atributo


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
	
    // metodo toString nos permite mostrar los atributos del objeto
	//en una salida de datos en consola
	//actuando como una "radiografia" del objeto
	

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	
}
