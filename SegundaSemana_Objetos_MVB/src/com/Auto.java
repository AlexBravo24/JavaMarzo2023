package com;

public class Auto {

	private String marca;
	private String color;
	private double precio;
	private int puertas;
	private String transmision;
	
	public Auto () {}

	public Auto(String marca, String color, double precio, int puertas, String transmision) {
		super();
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		this.puertas = puertas;
		this.transmision = transmision;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public String getTransmision() {
		return transmision;
	}

	public void setTransmision(String transmision) {
		this.transmision = transmision;
	} 
	
	
	
	
	
}
