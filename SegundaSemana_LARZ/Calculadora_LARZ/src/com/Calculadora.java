package com;

public abstract class Calculadora {
	
	//Atributos
	private String color;
	private String marca;
	private int a�o;
	
	public Calculadora () {}

	public Calculadora(String color, String marca, int a�o) {
		
		this.color = color;
		this.marca = marca;
		this.a�o = a�o;
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

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", marca=" + marca + ", a�o=" + a�o + "]";
	}
	
	public abstract void suma (double a,double b);
	public abstract void resta (double a,double b);
	public abstract void division (double a,double b);
	public abstract void multiplicacion (double a,double b);

}
