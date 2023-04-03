package com;

public class RAM {
	
	//Atributos
	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generaci�n;
	
	//M�todos constructores (Uno vac�o)
	public RAM () {}

	//M�todo constructor con todos los par�metros
	public RAM(String marca, int capacidad, double frecuencia, String generaci�n) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generaci�n = generaci�n;
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

	public String getGeneraci�n() {
		return generaci�n;
	}

	public void setGeneraci�n(String generaci�n) {
		this.generaci�n = generaci�n;
	}
	
	//M�todo toString

	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", generaci�n="
				+ generaci�n + "]";
	}
	
	
	
	

}
