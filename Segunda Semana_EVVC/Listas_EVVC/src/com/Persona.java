package com;

public class Persona {
	
	private String nombre;
	private int edad;
	private String sexo;
	
	public Persona () {}

	public Persona(String nombre, int edad, String sexo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	

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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	@Override
	public String toString() {
		return "Persona [El nombre de la persona es: " + nombre + ", La edad de la persona es:  " 
	+ edad + ", El sexo de la persona es: " + sexo + "]";
	}
	 
	
	

}
