package com;

public class Almacenamiento {
	
	private String marca;
	private double capacidad;
	private String Tipo;
	private double tamañofisico;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, double capacidad, String tipo, double tamañofisico) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		Tipo = tipo;
		this.tamañofisico = tamañofisico;
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
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public double getTamañofisico() {
		return tamañofisico;
	}

	public void setTamañofisico(double tamañofisico) {
		this.tamañofisico = tamañofisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", capacidad=" + capacidad + ", Tipo=" + Tipo + ", tamañofisico="
				+ tamañofisico + "]";
	}
	

}
