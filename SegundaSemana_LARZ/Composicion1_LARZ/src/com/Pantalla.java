package com;

public class Pantalla {
	
	private String tipo;
	private double tama�o;
	private double hz;
	
	public Pantalla () {}

	public Pantalla(String tipo, double tama�o, double hz) {
		super();
		this.tipo = tipo;
		this.tama�o = tama�o;
		this.hz = hz;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getTama�o() {
		return tama�o;
	}

	public void setTama�o(double tama�o) {
		this.tama�o = tama�o;
	}

	public double getHz() {
		return hz;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	@Override
	public String toString() {
		return "Pantalla [tipo=" + tipo + ", tama�o=" + tama�o + ", frecuencia=" + hz + "]";
	}

	
	

}
