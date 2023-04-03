package com;

public class Motoneta {
	
	private double modelo;
	private String marca;
	private String color;
	private Accesorio acceso;
	private Seguro seguro;
	private Servicio servi;
	
	public Motoneta() {
		
	}

	public Motoneta(double modelo, String marca, String color, Accesorio acceso, Seguro seguro, Servicio servi) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.color = color;
		this.acceso = acceso;
		this.seguro = seguro;
		this.servi = servi;
	}

	public double getModelo() {
		return modelo;
	}

	public void setModelo(double modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Accesorio getAcceso() {
		return acceso;
	}

	public void setAcceso(Accesorio acceso) {
		this.acceso = acceso;
	}

	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public Servicio getServi() {
		return servi;
	}

	public void setServi(Servicio servi) {
		this.servi = servi;
	}

	@Override
	public String toString() {
		return "Motoneta [modelo=" + modelo + ", marca=" + marca + ", color=" + color + ", acceso=" + acceso
				+ ", seguro=" + seguro + ", servi=" + servi + "]";
	}
	
	

}
