package com;

public class RAM {
	
	
	//ATRIBUTOS DEL OBJETO
	private String marca;
	private int capacidad;
	private double frecuencia;
	private String generacion;
	
	public RAM() {}
	
	
    //METODO CONSTRUCTOR CON TODO LOS PARAMETROS
	public RAM(String marca, int capacidad, double frecuencia, String generacion) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.frecuencia = frecuencia;
		this.generacion = generacion;
	}


	
	//GETTERS AND SETTERS
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


	
	//METODO toString
	@Override
	public String toString() {
		return "RAM [marca=" + marca + ", capacidad=" + capacidad + ", frecuencia=" + frecuencia + ", generacion="
				+ generacion + "]";
	}
	
	
	
	
	
	
	
	
	

}
