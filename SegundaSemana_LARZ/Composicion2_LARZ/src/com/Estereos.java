package com;

public class Estereos {
	
	private String marca;
	private double precio;
	
	private Estereos () {}

	public Estereos(String marca, double precio) {
		super();
		this.marca = marca;
		this.precio = precio;
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
	public String toString() {
		return "Estereos [marca=" + marca + ", precio=" + precio + "]";
	}
	
	

}
