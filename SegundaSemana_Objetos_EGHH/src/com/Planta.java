package com;

public class Planta {
	
	public String nombre;
	public String ambiente;
	public double tamaño;
	
	public Planta() {
		
	}

	public Planta(String nombre, String ambiente, double tamaño) {
		super();
		this.nombre = nombre;
		this.ambiente = ambiente;
		this.tamaño = tamaño;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAmbiente() {
		return ambiente;
	}

	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Planta [nombre=" + nombre + ", ambiente=" + ambiente + ", tamaño=" + tamaño + "]";
	}
	
	

}
