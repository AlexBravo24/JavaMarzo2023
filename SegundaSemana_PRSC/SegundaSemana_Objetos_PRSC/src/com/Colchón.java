package com;

public class Colch�n {
	
	private String Clase;
	private double Largo;
	private double Ancho;
	private String Tipo;
	
	public Colch�n () {}

	public Colch�n(String clase, double largo, double ancho, String tipo) {
		Clase = clase;
		Largo = largo;
		Ancho = ancho;
		Tipo = tipo;
	}

	public String getClase() {
		return Clase;
	}

	public void setClase(String clase) {
		Clase = clase;
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

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	@Override
	public String toString() {
		return "Colch�n [Clase=" + Clase + ", Largo=" + Largo + ", Ancho=" + Ancho + ", Tipo=" + Tipo + "]";
	}
	
	
	

}
