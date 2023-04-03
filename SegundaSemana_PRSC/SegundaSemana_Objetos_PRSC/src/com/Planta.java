package com;

public class Planta {

	private String Especie;
	private String Color;
	private String Tamaño;
	
	public Planta () {}

	public Planta(String especie, String color, String tamaño) {
		super();
		Especie = especie;
		Color = color;
		Tamaño = tamaño;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getTamaño() {
		return Tamaño;
	}

	public void setTamaño(String tamaño) {
		Tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Planta [Especie=" + Especie + ", Color=" + Color + ", Tamaño=" + Tamaño + "]";
	}
	
	
	
}
