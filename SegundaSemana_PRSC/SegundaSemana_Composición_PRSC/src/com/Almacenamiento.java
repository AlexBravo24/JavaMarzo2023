package com;

public class Almacenamiento {

	private String marca;
	private double capacidad;
	private String tipo;
	private double tama�o;
	
	public Almacenamiento () {}

	public Almacenamiento(String marca, double capacidad, String tipo, double tama�o) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.tama�o = tama�o;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(double capacidad) {
		this.capacidad = capacidad;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", capacidad=" + capacidad + ", tipo=" + tipo + ", tama�o=" + tama�o
				+ "]";
	}
	
	

}
