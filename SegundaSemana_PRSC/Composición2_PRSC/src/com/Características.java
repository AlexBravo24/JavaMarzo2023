package com;

public class Caracter�sticas {

	private String Sistema;
	private String Color;
	private String Conectividad;
	
	public Caracter�sticas() {}

	public Caracter�sticas(String sistema, String color, String conectividad) {
		Sistema = sistema;
		Color = color;
		Conectividad = conectividad;
	}

	public String getSistema() {
		return Sistema;
	}

	public void setSistema(String sistema) {
		Sistema = sistema;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getConectividad() {
		return Conectividad;
	}

	public void setConectividad(String conectividad) {
		Conectividad = conectividad;
	}

	@Override
	public String toString() {
		return "Caracter�sticas [Sistema=" + Sistema + ", Color=" + Color + ", Conectividad=" + Conectividad + "]";
	}
	
	
	
	
}
