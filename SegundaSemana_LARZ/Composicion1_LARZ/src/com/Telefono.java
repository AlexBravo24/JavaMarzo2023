package com;

public class Telefono {
	
	private String marca;
	private int a�o;
	private String color;
	
	private Procesador procesador;
	private Pantalla pantalla;
	private Bateria bateria;
	
	public Telefono () {}

	public Telefono(String marca, int a�o, String color, Procesador procesador, Pantalla pantalla, Bateria bateria) {
		super();
		this.marca = marca;
		this.a�o = a�o;
		this.color = color;
		this.procesador = procesador;
		this.pantalla = pantalla;
		this.bateria = bateria;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Pantalla getPantalla() {
		return pantalla;
	}

	public void setPantalla(Pantalla pantalla) {
		this.pantalla = pantalla;
	}

	public Bateria getBateria() {
		return bateria;
	}

	public void setBateria(Bateria bateria) {
		this.bateria = bateria;
	}

	@Override
	public String toString() {
		return "Telefono [marca=" + marca + ", a�o=" + a�o + ", color=" + color + ", procesador=" + procesador
				+ ", pantalla=" + pantalla + ", bateria=" + bateria + "]";
	}
	
	
	
}
