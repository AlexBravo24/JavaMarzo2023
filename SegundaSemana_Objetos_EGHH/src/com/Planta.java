package com;

public class Planta {
	
	public String nombre;
	public String ambiente;
	public double tama�o;
	
	public Planta() {
		
	}

	public Planta(String nombre, String ambiente, double tama�o) {
		super();
		this.nombre = nombre;
		this.ambiente = ambiente;
		this.tama�o = tama�o;
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

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Planta [nombre=" + nombre + ", ambiente=" + ambiente + ", tama�o=" + tama�o + "]";
	}
	
	

}
