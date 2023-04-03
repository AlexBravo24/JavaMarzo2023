package com;

public abstract class Calculadora {
	private String marca;
	private String color;
	
	public Calculadora() {}

	public Calculadora(String marca, String color) {
		this.marca = marca;
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", color=" + color + "]";
	}
	
	
	public abstract void suma(int a, int b);
	
	public abstract void resta(int a, int b);
	
	public abstract void multiplicacion(int a, int b);
	
	public abstract void division(int a, int b);
	
	
	


}
