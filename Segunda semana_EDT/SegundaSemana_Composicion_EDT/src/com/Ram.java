package com;

public class Ram {

	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generacion;
	
	public Ram() {	
	
	}
	
	public Ram(String marca, int capacidad, double frecuencia, String generacion) {}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getGeneracion() {
		return generacion;
	}

	public void setGeneracion(String generacion) {
		this.generacion = generacion;
	}
	
	public String toString() {
		return "Ram marca: " + this.marca + ". Capacidad: " + this.capacidad + ". Frecuencia: " + this.frecuencia + ". Generación: " + this.generacion;
	}
	
}
