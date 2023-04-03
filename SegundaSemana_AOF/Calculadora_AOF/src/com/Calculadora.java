package com;

public abstract class Calculadora {

	private String modelo;
	private String color;
	
	public Calculadora() {}

	public Calculadora(String modelo, String color) {
		//super();
		this.modelo = modelo;
		this.color = color;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [modelo=" + modelo + ", color=" + color + "]";
	}
	
	public abstract void suma();
	public abstract void resta();
	public abstract void multiplicacion();
	public abstract void dividir ();

	
}

