package com;

public class Telefono {
	
	private String marca;
	private int año;
	private String color;
	
	private Procesador procesador;
	private Pantalla pantalla;
	private Bateria bateria;
	
	public Telefono () {}

	public Telefono(String marca, int año, String color, Procesador procesador, Pantalla pantalla, Bateria bateria) {
		super();
		this.marca = marca;
		this.año = año;
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

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
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
		return "Telefono [marca=" + marca + ", año=" + año + ", color=" + color + ", procesador=" + procesador
				+ ", pantalla=" + pantalla + ", bateria=" + bateria + "]";
	}
	
	
	
}
