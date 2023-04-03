package com;

public class Almacenamiento {

	private String marca;
	private double capacidad;
	private String tipo;
	private double tamaņoFisico;
	
	public Almacenamiento() {}

	public Almacenamiento(String marca, double capacidad, String tipo, double tamaņoFisico) {
		this.marca = marca;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.tamaņoFisico = tamaņoFisico;
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

	public double getTamaņoFisico() {
		return tamaņoFisico;
	}

	public void setTamaņoFisico(double tamaņoFisico) {
		this.tamaņoFisico = tamaņoFisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca = " + marca + ", capacidad = " 
				+ capacidad + "GB, tipo = " + tipo + ", tamaņoFisico = "
				+ tamaņoFisico + "in]";
	}
	
	
	
}
