package com;

public class Cochera {

	private String Portón;
	private String Color;
	private double Largo;
	private double Ancho;
	
	public Cochera () {}

	public Cochera(String portón, String color, double largo, double ancho) {
		Portón = portón;
		Color = color;
		Largo = largo;
		Ancho = ancho;
	}

	public String getPortón() {
		return Portón;
	}

	public void setPortón(String portón) {
		Portón = portón;
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
		return "Cochera [Portón=" + Portón + ", Color=" + Color + ", Largo=" + Largo + ", Ancho=" + Ancho + "]";
	}
	
	
}
