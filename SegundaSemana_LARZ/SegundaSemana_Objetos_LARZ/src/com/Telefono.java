package com;

public class Telefono {

	private String marca;
	private int a�o;
	private String color;
	
	
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Telefono [Marca: " + marca + ", A�o: " + a�o + ", Color: " + color + "]";
	} 
	
	
	
}
