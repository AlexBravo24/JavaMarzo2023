package com;

public class Funda {

	
	private String color;
	private String resistencia;
	private String cantidad;
	
	public Funda(){}

	public Funda(String color, String resistencia, String cantidad) {
		super();
		this.color = color;
		this.resistencia = resistencia;
		this.cantidad = cantidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getResistencia() {
		return resistencia;
	}

	public void setResistencia(String resistencia) {
		this.resistencia = resistencia;
	}

	public String getCantidad() {
		return cantidad;
	}

	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Funda [color=" + color + ", resistencia=" + resistencia + ", cantidad=" + cantidad + "]";
	}
	
	
	
}
