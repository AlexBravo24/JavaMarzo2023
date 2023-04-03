package com;

public class Coche {
	
	private String color;
	private String marca;
	private double precio;
	
	public Coche() {} //Constructor vacio

	public Coche(String color, String marca, double precio) { //constructor de cada atributo
		super();
		this.color = color;
		this.marca = marca;
		this.precio = precio;
	}

	
	public String getColor() { //Getters y Setters
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

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
	

	@Override
	public String toString() { //Metodo toString
		return "Coche [color=" + color + ", marca=" + marca + ", precio=" + precio + "]";
	}
	
	
	
	
	
	
	

}
