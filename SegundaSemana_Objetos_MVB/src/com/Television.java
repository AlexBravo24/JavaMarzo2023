package com;

public class Television {

	private int pulgadas;
	private String marca;
	private String pantalla;
	private int velocidad;
	
	public Television () {}

	public Television(int pulgadas, String marca, String pantalla, int velocidad) {
		super();
		this.pulgadas = pulgadas;
		this.marca = marca;
		this.pantalla = pantalla;
		this.velocidad = velocidad;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPantalla() {
		return pantalla;
	}

	public void setPantalla(String pantalla) {
		this.pantalla = pantalla;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", marca=" + marca + ", pantalla=" + pantalla + ", velocidad="
				+ velocidad + "]";
	}
	
	
	
	
	
}
