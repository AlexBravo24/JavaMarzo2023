package com;

public class Perro {
	
	//Una clase funciona como una plantilla para modelar un objeto
	
	//Caemos en el primer pilar de la POO, que es la abstracción
	//Traer la idea del objeto en la vida real, de acuerdo
	//a lo que necesiemos en Java. Es decir, vamos a definir
	//del objeto, sus atributos y algunos comportamientos
	//expresados a través de sus métodos
	
	//Primero definimos los atributos del objeto
	
	//El encapsulamiento es otro pilar de la POO, que lo que hace es
	//proteger el acceso a nuestra información
	//Esto se lleva a cabo mediante los modificadores de acceso
	//Private, Default, Protected. Public
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	//Métodos constructores
	//Nos ayudan a crear o construir el objeto como tal
	//con sus respectivos atributos
	
	//Regularmente o convencionalmente 
	//van a encontrar dos métodos constructores
	
	//El primero es el constructor vacío
	//El cual nos sirve como un "comodín". para instanciar
	//a un objeto sin iniciarlo, sin asignarle valores aún
	
	public Perro() {} //Ejemplo de constructor vacío
	
	//Método constructor con todos los parámetros
		//Este método nos ayudará a instanciar a nuestro objeto
		//pero aquí si vamos a requerir declarar todos sus atributos

	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}

	//Podemos generar los constructores que sean necesarios
		//Y no hay límite
	
	//Métodos Getters & Setters
	
	//Getter - Devolvernos el valor asisnado de un atributo
	//Setter - nos permite establecer o asignarle valor
			// a un atributo
	
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
	
	
	//Método toString
	//Nos permite mostrar los atributos del objeto
	//en una salida de datos en consola
	//Actuando como una "radiografía" de nuestro objeto

	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	

}
