package com;

public class Llantas {
	
	private String marca;
	private double precio;
	private int nllantas;
	
	public Llantas () {}

	public Llantas(String marca, double precio, int nllantas) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.nllantas = nllantas;
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

	public int getNllantas() {
		return nllantas;
	}

	public void setNllantas(int nllantas) {
		this.nllantas = nllantas;
	}

	@Override
	public String toString() {
		return "Llantas [marca=" + marca + ", precio=" + precio + ", Numero de llantas=" + nllantas + "]";
	}
	
	

}
