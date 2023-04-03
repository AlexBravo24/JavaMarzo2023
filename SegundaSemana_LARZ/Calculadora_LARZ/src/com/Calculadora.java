package com;

public abstract class Calculadora {
	
	//Atributos
	private String color;
	private String marca;
	private int año;
	
	public Calculadora () {}

	public Calculadora(String color, String marca, int año) {
		
		this.color = color;
		this.marca = marca;
		this.año = año;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", año=" + año + "]";
	}
	
	public abstract void suma (double a,double b);
	public abstract void resta (double a,double b);
	public abstract void division (double a,double b);
	public abstract void multiplicacion (double a,double b);

}
