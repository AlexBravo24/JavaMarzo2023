package com;

public class Persona {
	
	
	private String nombre;
	private char sexo;
	private int edad;
	
	public Persona() {} //Constructor vacio

	public Persona(String nombre, char sexo, int edad) { //constructor para cada atributo
		super();
		this.nombre = nombre;
		this.sexo = sexo;
		this.edad = edad;
	}

	
	public String getNombre() { //GENERAMOS GETTERS Y SETTERS PARA CADA ATRIBUTO
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {  //GENERAMOS METODO toString para todos los atributos
		return "Persona [nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + "]";
	}
	
	
	
	
	
	
	
	

}
