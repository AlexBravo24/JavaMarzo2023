package com;

public class Calzado {
	
	private String color;
	private float numero;
	private float precio;
	
	

	
	

	public Calzado(String color, float numero, float precio) {
		super();
		this.color = color;
		this.numero = numero;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public float getNumero() {
		return numero;
	}

	public void setNumero(float numero) {
		this.numero = numero;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Calzado [color=" + color + ", numero=" + numero + ", precio=" + precio + "]";
	}
	
	


}
