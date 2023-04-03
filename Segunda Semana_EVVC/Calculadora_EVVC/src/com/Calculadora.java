package com;

public abstract class Calculadora {

	private String marca;
	private String modelo;
	private String precio;
	private String energ�a;
	
	public Calculadora () {}

	public Calculadora(String marca, String modelo, String precio, String energ�a) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.energ�a = energ�a;
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

	public String getEnerg�a() {
		return energ�a;
	}

	public void setEnerg�a(String energ�a) {
		this.energ�a = energ�a;
	}

	@Override
	public String toString() {
		return "Calculadora [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", energ�a=" + energ�a
				+ "]";
	}
	
	//M�todos abstractos
	
	public abstract void sumar (int i,int j);
	public abstract void restar (int i, int j);
	public abstract void multiplicar (int i, int j);
	public abstract void dividir (int i, int j);
	
}
