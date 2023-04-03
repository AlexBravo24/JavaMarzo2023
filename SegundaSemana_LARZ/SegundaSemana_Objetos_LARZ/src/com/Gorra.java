package com;

public class Gorra {
	
	private String marca;
	private int NA2;
	private double precio;
	private String color;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	@Override
	public String toString() {
		return "Gorra [Marca: " + marca + ", Precio: " + precio + ", Color: " + color + "]";
	} 

	
	
	
}
