package com;

public class CelularE5 {

	private String modelo;
	private String marca;
	private double memoria;
	private double precio;
	private String camarapixel;
	
	public CelularE5() {
		
	}

	public CelularE5(String modelo, String marca, double memoria, double precio, String camarapixel) {
		super();
		this.modelo = modelo;
		this.marca = marca;
		this.memoria = memoria;
		this.precio = precio;
		this.camarapixel = camarapixel;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getCamarapixel() {
		return camarapixel;
	}

	public void setCamarapixel(String camarapixel) {
		this.camarapixel = camarapixel;
	}

	@Override
	public String toString() {
		return "CelularE5 [modelo=" + modelo + ", marca=" + marca + ", memoria=" + memoria + ", precio=" + precio
				+ ", camarapixel=" + camarapixel + "]";
	}
	
	
	
}
	
	