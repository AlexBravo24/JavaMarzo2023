package com;

public abstract class Persona {
	
	//Atributos
	private String nombre;
	private String sexo;
	private int edad;
	
	//Metodos constructores
	public Persona () {}

	public Persona(String nombre, String sexo, int edad) {
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	//toString
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	// Una clase puede tener metodos propios
	//Los metodos tambien se pueden llamar comportamientos
	
	//Declarando metodos propios
	
	public void respirar () {
		System.out.println("Respirando...");
	}
	
	//Declarando un metodo propio con aurgumentos a utilizar 
	//por el metodo
	public void comer (String alimento) {
		System.out.println("Comiendo "+alimento);
	}
	
	//Declarando otro metodo con el mismo nombre, pero con diferentes
	//argumentos o sin argumentos, para  ejemplificar el polimorfismo
	//El polimorfismo ve de la mano con la sobrecarga de argumentos
	//y la sobreescritura de metodos
	public void comer () {
		System.out.println("Cenando...");
	}

	//un metodo abstracto es en el definimos QUÉ se va hacer pero
	//no define el CÓMO se va a hacer
	public abstract void trabajar ();
		
	
}
