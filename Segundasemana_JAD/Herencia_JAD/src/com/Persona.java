package com;

public abstract class Persona {
	// atributos
	private String nombre;
	private String genero;
	private int edad;
	
	public Persona () {}

	public Persona(String nombre, String genero, int edad) {
		
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + "]";
	}
	// una clase puede tener métodos propios, los metodos tambien pueden
	//pueden llamar comportamientos
	
	public void respirar() {
		System.out.println("respirando...");
	}
	
	//declarano un metodo propio con argumentos a utilizar
	//por el metodo
	public void comer(String alimento) {
		System.out.println("comiendo "+ alimento);
	}
	//declarando otro metodo con el mismo nombre
	//pero con diferentes argumentos o sin argumentos,para ejemplificar
	//el polimorfismo, va de la mano con la sobrecarga de argumentos y
	//sobreescritura de metodos
	public void comer() {
		System.out.println("comiendo..");
	}
	//un metodo abstracto es en el que definimos que se va a hacer
	//pero no definimos el como se va a hacer
	
	public abstract void trabajar();

}
