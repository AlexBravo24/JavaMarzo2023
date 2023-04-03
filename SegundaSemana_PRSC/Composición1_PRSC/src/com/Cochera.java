package com;

public class Cochera {

	private String Port�n;
	private String Color;
	private double Largo;
	private double Ancho;
	
	public Cochera () {}

	public Cochera(String port�n, String color, double largo, double ancho) {
		Port�n = port�n;
		Color = color;
		Largo = largo;
		Ancho = ancho;
	}

	public String getPort�n() {
		return Port�n;
	}

	public void setPort�n(String port�n) {
		Port�n = port�n;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getLargo() {
		return Largo;
	}

	public void setLargo(double largo) {
		Largo = largo;
	}

	public double getAncho() {
		return Ancho;
	}

	public void setAncho(double ancho) {
		Ancho = ancho;
	}

	@Override
	public String toString() {
		return "Cochera [Port�n=" + Port�n + ", Color=" + Color + ", Largo=" + Largo + ", Ancho=" + Ancho + "]";
	}
	
	
}
