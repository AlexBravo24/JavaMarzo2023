package com;

public class RAM {
	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generacion;
	
	//Constructor vac�o.
	public RAM() {};
	
	//Constructor con todos los parametros
	public RAM(String marca, int capacidad, double frecuencia, String generacion) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generacion = generacion;
	}

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

	@Override
	public String toString() {
		return "RAM [marca = " + marca + ", capacidad = " 
				+ capacidad + "GB, frecuencia = " + frecuencia 
				+ ", generacion = " + generacion + "]";
	}
	
	
	

}
