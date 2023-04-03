package com;

public abstract class Calculadora {

	private String marca;
	private String modelo;
	private String precio;
	private String energía;
	
	public Calculadora () {}

	public Calculadora(String marca, String modelo, String precio, String energía) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.energía = energía;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getEnergía() {
		return energía;
	}

	public void setEnergía(String energía) {
		this.energía = energía;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", energía=" + energía
				+ "]";
	}
	
	//Métodos abstractos
	
	public abstract void sumar (int i,int j);
	public abstract void restar (int i, int j);
	public abstract void multiplicar (int i, int j);
	public abstract void dividir (int i, int j);
	
}
