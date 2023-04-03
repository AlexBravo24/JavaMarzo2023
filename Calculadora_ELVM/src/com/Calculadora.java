package com;

public abstract class Calculadora {
	private String marca;
	private String modelo;
	private int precio;
	private String color;
	private String paisfabricacion;
	
	public Calculadora () {}

	public Calculadora(String marca, String modelo, int precio, String color, String paisfabricacion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.paisfabricacion = paisfabricacion;
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

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getPaisfabricacion() {
		return paisfabricacion;
	}

	public void setPaisfabricacion(String paisfabricacion) {
		this.paisfabricacion = paisfabricacion;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color
				+ ", paisfabricacion=" + paisfabricacion + "]";
	}
	
	public abstract void suma();
	public abstract void resta() ;
	public abstract void multiplicacion();
	public abstract void divicion();


	
	
	
	

	
	
	
	
	
	
	

}
