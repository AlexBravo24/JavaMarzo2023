package com;

public class Automovil {
	
	public String Color;
	public double a�o;
	public String marca;
	
	public Automovil() {
		
	}

	public Automovil(String color, double a�o, String marca) {
		super();
		Color = color;
		this.a�o = a�o;
		this.marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getA�o() {
		return a�o;
	}

	public void setA�o(double a�o) {
		this.a�o = a�o;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Automovil [Color=" + Color + ", a�o=" + a�o + ", marca=" + marca + "]";
	}
	
	

}
