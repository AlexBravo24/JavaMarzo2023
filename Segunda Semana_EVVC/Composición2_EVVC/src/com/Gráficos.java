package com;

public class Gráficos {
	
	private String marca;
	private double frecuencia;
	private String potencia;
	
	public Gráficos () {}

	public Gráficos(String marca, double frecuencia, String potencia) {
		super();
		this.marca = marca;
		this.frecuencia = frecuencia;
		this.potencia = potencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Gráficos [marca=" + marca + ", frecuencia=" + frecuencia + ", potencia=" + potencia + "]";
	}
	
	

}
