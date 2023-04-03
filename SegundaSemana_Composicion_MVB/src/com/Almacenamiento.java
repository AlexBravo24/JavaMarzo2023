package com;

public class Almacenamiento {

	private String marca;
	private double capacidad;
	private String tipo;
	private double tama�oFisico;
	
	public Almacenamiento () {}

	public Almacenamiento(String marca, double capacidad, String tipo, double tama�oFisico) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.tama�oFisico = tama�oFisico;
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
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTama�oFisico() {
		return tama�oFisico;
	}

	public void setTama�oFisico(double tama�oFisico) {
		this.tama�oFisico = tama�oFisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", capacidad=" + capacidad + ", tipo=" + tipo + ", tama�oFisico="
				+ tama�oFisico + "]";
	}
	
	
	
	
	
	
}
