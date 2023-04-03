package com;

public class Perro {
	
	/* Una clase funciona como una plantilla para modelar un objeto 
	 */
//Caemos en el primer pilar de la POO, que es la asbtracción 
//Traemos la idea del objeto en la vida real, de acuerdo a lo que necesitamos
// en Java.Es decir, vamos a definir los atributos y algunos comportamientos del objeto
//expresados a través de métodos. 
	
	//Primero definimos los atributos del objeto
	
	//El encapsulamiento es otro pilar de la POO, que lo que hace
	//es proteger el acceso a nuestra información 
	//Esto se lleva a cabo mediante los modificadores de acceso
	//Private, Default, Protected, Public
	
	
	private String nombre; 
	private int edad;
	private double peso;
	private String color;
	
	//Métodos constructores
	//Nos ayudan a crear o construir al objeto como tal, 
	//con sus respectivos atributos
	
	//Regularmente o convencionalmente van a encontrar 
	//dos métodos constructores
	
	//El primero es el contructor vacío
	//El cual nos sirve como un "comodin" para instanciar a un objetos
	//sin iniciarlo, sin asignarle valores aún
	
	public Perro () {} //ejemplo de constructor vacío
	
	//Método constructor con todos los parámetros 
		//Este método nos ayudará a instanciar a nuestro objeto 
		//pero aquí si vamos a requerir declarar todos sus atributos 
	
	public Perro(String nombre, int edad, double peso, String color) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.color = color;
	}	
	
//Podemos generarlos constructores que sean necesarios. Y no hay 
//limite
	
	//Métodos Getter & Setters
	
//Getter - Devolvernos el valor asignado de un atributo
//Setter - Nos permite establecer o asignarle valor a un atributo
	

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

	//Método to String 
	//Nos permite mostrar los atributos del objeto en una salida 
	//de datos en consola. Actuando como una radiografía de nuestro
	//objeto. 
	
	@Override
	public String toString() {
		return "Perro [nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", color=" + color + "]";
	}
	
	

	
	
	
	
	

	
	
	
}
