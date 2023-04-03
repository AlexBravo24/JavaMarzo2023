package com;

public class Computadora {
	
	public String marca;
	public String color;
	public double ram;
	
	public Computadora() {
		
	}

	public Computadora(String marca, String color, double ram) {
		super();
		this.marca = marca;
		this.color = color;
		this.ram = ram;
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

	public double getRam() {
		return ram;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	@Override
	public String toString() {
		return "Computadora [marca=" + marca + ", color=" + color + ", ram=" + ram + "]";
	}
	

}
