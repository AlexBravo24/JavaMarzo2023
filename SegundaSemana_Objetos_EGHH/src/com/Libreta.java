package com;

public class Libreta {
	
	public String tipo;
	public String marca;
	public int tama�o;
	
	public Libreta() {
		
	}

	public Libreta(String tipo, String marca, int tama�o) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.tama�o = tama�o;
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

	public int getTama�o() {
		return tama�o;
	}

	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
	}

	@Override
	public String toString() {
		return "Libreta [tipo=" + tipo + ", marca=" + marca + ", tama�o=" + tama�o + "]";
	}
	
	

}
