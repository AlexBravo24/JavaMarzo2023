package com;

public class Telefono {

	private String marca;
	private int año;
	private String color;
	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Telefono [Marca: " + marca + ", Año: " + año + ", Color: " + color + "]";
	} 
	
	
	
}
