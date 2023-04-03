package com;

public class Almacenamiento {
	
	private String marca;
	private double capacidad;
	private String tipo;
	private double tama�ofisico;
	
	public Almacenamiento () {}

	public Almacenamiento(String marca, double capacidad, String tipo, double tama�ofisico) {
		super();
		this.marca = marca;
		this.capacidad = capacidad;
		this.tipo = tipo;
		this.tama�ofisico = tama�ofisico;
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

	public double getTama�ofisico() {
		return tama�ofisico;
	}

	public void setTama�ofisico(double tama�ofisico) {
		this.tama�ofisico = tama�ofisico;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", capacidad=" + capacidad + ", tipo=" + tipo + ", tama�ofisico="
				+ tama�ofisico + "]";
	}
	

}
