package com;

public class Pantalla {
	
	private String tipo;
	private double tamaño;
	private double hz;
	
	public Pantalla () {}

	public Pantalla(String tipo, double tamaño, double hz) {
		super();
		this.tipo = tipo;
		this.tamaño = tamaño;
		this.hz = hz;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTamaño() {
		return tamaño;
	}

	public void setTamaño(double tamaño) {
		this.tamaño = tamaño;
	}

	public double getHz() {
		return hz;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	@Override
	public String toString() {
		return "Pantalla [tipo=" + tipo + ", tamaño=" + tamaño + ", frecuencia=" + hz + "]";
	}

	
	

}
