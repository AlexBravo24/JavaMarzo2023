package com;

public class Libreta {
	
	public String tipo;
	public String marca;
	public int tamaño;
	
	public Libreta() {
		
	}

	public Libreta(String tipo, String marca, int tamaño) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.tamaño = tamaño;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTamaño() {
		return tamaño;
	}

	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	@Override
	public String toString() {
		return "Libreta [tipo=" + tipo + ", marca=" + marca + ", tamaño=" + tamaño + "]";
	}
	
	

}
