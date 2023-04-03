package com;

public class Gato {
	
	private String nombre;
	private int numeropatas;
	private double peso;
	
	public Gato() {}

	public Gato(String nombre, int numeropatas, double peso) {
		this.nombre = nombre;
		this.numeropatas = numeropatas;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeropatas() {
		return numeropatas;
	}

	public void setNumeropatas(int numeropatas) {
		this.numeropatas = numeropatas;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Gato [nombre=" + nombre + ", numeropatas=" + numeropatas + ", peso=" + peso + "]";
	}
	
	

}
