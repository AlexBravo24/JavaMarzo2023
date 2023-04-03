package com;

public abstract class Calculadora {
	
	private String color;
	private double costo;
	private String tipo;
	
	
	public Calculadora() {
		
	}


	public Calculadora(String color, double costo, String tipo) {

		this.color = color;
		this.costo = costo;
		this.tipo = tipo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getCosto() {
		return costo;
	}


	public void setCosto(double costo) {
		this.costo = costo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Calculadora [color=" + color + ", costo=" + costo + ", tipo=" + tipo + "]";
	}
	
	
	public abstract void suma(int a, int b);
	public abstract void resta(int a, int b);
	public abstract void multiplicacion(int a, int b);
	public abstract void division(int a, int b);





		
	}
	
	


