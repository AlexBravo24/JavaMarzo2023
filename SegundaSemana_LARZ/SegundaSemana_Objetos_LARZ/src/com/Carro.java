package com;

public class Carro {

	private String marca;
	private int año;
	private double kilometraje;
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
		return "Carro [Marca: " + marca + ", Año: " + año + ", Kilometraje: " + kilometraje + ", Color: " + color + "]";
	}
	
	
	
	
}
