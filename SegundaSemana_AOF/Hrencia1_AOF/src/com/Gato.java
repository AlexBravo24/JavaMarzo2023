package com;

public class Gato extends Animal{
	
	private String color;
	private String edad;
	private String nombre;
	
	public Gato() {}

	public Gato(String grupo, String alimentacion, String anatomia, String color, String edad, String nombre) {
		super(grupo, alimentacion, anatomia);
		this.color = color;
		this.edad = edad;
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Gato [color=" + color + ", edad=" + edad + ", nombre=" + nombre + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
