package com;

public class Perro {
	//Una clase funciona como un aplantilla para modelar un objeto
	
	//Cemos en el primer pilar de la POo, que es la abstraccion
	//Traer la idea del objeto en la vida real, de aucerdo a lo que necesitemos en java. Es deci, vamos a definir 
	//del objeto sus atributos y algunos comportamientos expresados a traves de metodos.
	
	//Primero definimos los atributos del objeto
	
	//El encapsulamiento es otro pilar de la programacion POO, que lo que hace es
	//proteger el acceso a nuestra informacion
	//esto se lleva a cabo mediante los modificadores de acceos
	//Private, Default, Protected, Public
	
	private String nombre;
	private int edad;
	private double peso;
	private String color;
	
	//Metodos constructores
	//"Nos ayudan a crear o construir al objeto como tal, con sus respectivos atributos"
	
	//Regularmente o convencionalmente van a encontrar dos metodos constructores
	//El primero es el contructor vacio el cual nos sirve como un comodin, para instanciar
	//a un objeto sin iniciarlo, sin asignarle valores aun
	
	public Perro() { }  //Ejemplo de constructor vacio
	//Metodo constructor con todos los parametros
			//Este metodo nos ayudara a instanciar a nuestro objeto
			//pero aqui si vamos a requerir  declarar todos sus atributos

	public Perro(String nombre, int edad, double peso, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}

	
	//Podemos generar los constructores que sean necesarios y no hay limites
     //Metodos Getters & Setters
	
	//Getter - Devuelve el valor asignado de un atributo
	//Setter - Nos permite establecer o asignarle  valor a un atributo
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
	//Nos permite mostrar los atributos del objeto en una salida de datos en consola
	//Actuando como una "radiografia" de nuestro objeto
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	
	
	
	
	
	
		
		
		

		
		
		
	

	
	

}
