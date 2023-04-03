package com;

public class ComidaGato {

	private String marca;                // ATRIBUTOS
	private int precio;
	private double contenido;
	
	public ComidaGato() {}

	public ComidaGato(String marca, int precio, double contenido) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.contenido = contenido;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public double getContenido() {
		return contenido;
	}

	public void setContenido(double contenido) {
		this.contenido = contenido;
	}

	@Override
	public String toString() {
		return "ComidaGato [marca=" + marca + ", precio=" + precio + ", contenido=" + contenido + "]";
	}
	
	
	
	
	
}
