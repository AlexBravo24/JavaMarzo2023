package com;

public class RAM {
	
	//Atributos de objeto
	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generacion;
	
	//Metodos constructores (uno vacio)
	public RAM () {}

	//Metodo con todos los parametros
	public RAM(String marca, int capacidad, double frecuencia, String generacion) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generacion = generacion;
	}

	//Getters & Setters
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
	
	//Metodo toString
	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", generacion="
				+ generacion + "]";
	}
	
	

}
