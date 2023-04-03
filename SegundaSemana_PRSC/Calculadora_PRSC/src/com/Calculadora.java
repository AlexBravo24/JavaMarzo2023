package com;

public abstract class Calculadora {

	private String Marca;
	private String Modelo;
	private String Color;
	
	public Calculadora () {}

	public Calculadora(String marca, String modelo, String color) {
		Marca = marca;
		Modelo = modelo;
		Color = color;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	@Override
	public String toString() {
		return "Calculadora [Marca=" + Marca + ", Modelo=" + Modelo + ", Color=" + Color + "]";
	}
	
	public abstract void Sumar();
	public abstract void Restar();	
	public abstract void Multiplicar();	
	public abstract void Dividir();
	
	
}
