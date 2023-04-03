package com;

public class RAM {

	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generación;
	
	//Método constructor vacío
	public RAM () {}

	//Método constructor con todos los parámetros
	public RAM(String marca, int capacidad, double frecuencia, String generación) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generación = generación;
	}

	//Getters y Setters
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

	public String getGeneración() {
		return generación;
	}

	public void setGeneración(String generación) {
		this.generación = generación;
	}

	//Método to string
	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", generación="
				+ generación + "]";
	}
	
	
	
}
