package com;

public class Automovil {
	
	public String Color;
	public double año;
	public String marca;
	
	public Automovil() {
		
	}

	public Automovil(String color, double año, String marca) {
		super();
		Color = color;
		this.año = año;
		this.marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public double getAño() {
		return año;
	}

	public void setAño(double año) {
		this.año = año;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Automovil [Color=" + Color + ", año=" + año + ", marca=" + marca + "]";
	}
	
	

}
