package com;

public class Bateria {
	
	private String serie;
	private int capacidad;
	
	public Bateria () {}

	public Bateria(String serie, int capacidad) {
		super();
		this.serie = serie;
		this.capacidad = capacidad;
	}

	public String getSerie() {
		return serie;
	}

	public void setSerie(String serie) {
		this.serie = serie;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Bateria [serie=" + serie + ", capacidad=" + capacidad + "]";
	}
	
	

}
