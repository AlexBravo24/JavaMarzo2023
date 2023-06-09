package com;

public class CaracterÝsticas {

	private String Sistema;
	private String Color;
	private String Conectividad;
	
	public CaracterÝsticas() {}

	public CaracterÝsticas(String sistema, String color, String conectividad) {
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
		return "CaracterÝsticas [Sistema=" + Sistema + ", Color=" + Color + ", Conectividad=" + Conectividad + "]";
	}
	
	
	
	
}
