package com;

public class Planta {

	private String Especie;
	private String Color;
	private String Tama�o;
	
	public Planta () {}

	public Planta(String especie, String color, String tama�o) {
		super();
		Especie = especie;
		Color = color;
		Tama�o = tama�o;
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

	public String getTama�o() {
		return Tama�o;
	}

	public void setTama�o(String tama�o) {
		Tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Planta [Especie=" + Especie + ", Color=" + Color + ", Tama�o=" + Tama�o + "]";
	}
	
	
	
}
