package com;

public class Almacenamiento {

	private String marca;
	private double capacidad;
	private String tipo;
	private double tamaño;
	
	public Almacenamiento () {}

	public Almacenamiento(String marca, double capacidad, String tipo, double tamaño) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.tamaño = tamaño;
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

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", capacidad=" + capacidad + ", tipo=" + tipo + ", tamaño=" + tamaño
				+ "]";
	}
	
	

}
