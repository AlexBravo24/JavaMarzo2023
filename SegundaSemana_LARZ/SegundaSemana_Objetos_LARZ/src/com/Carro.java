package com;

public class Carro {

	private String marca;
	private int a�o;
	private double kilometraje;
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
	public double getKilometrake() {
		return kilometraje;
	}
	public void setKilometrake(double kilometrake) {
		this.kilometraje = kilometrake;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Carro [Marca: " + marca + ", A�o: " + a�o + ", Kilometraje: " + kilometraje + ", Color: " + color + "]";
	}
	
	
	
	
}
