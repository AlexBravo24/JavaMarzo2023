package com;

public class Perro extends Gato{
	
	
	private int edad;
	private String color;
	
	public Perro() {}

	public Perro(String nombre, int numeropatas, double peso, int edad, String color) {
		super(nombre, numeropatas, peso);
		this.edad = edad;
		this.color = color;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Perro [edad=" + edad + ", color=" + color + ", getNombre()=" + getNombre() + ", getNumeropatas()="
				+ getNumeropatas() + ", getPeso()=" + getPeso() + "]";
	}

	

}
