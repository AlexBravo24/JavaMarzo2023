package com;

public class Autom�vil {
	
	private String combuestibleUsado;
	private String tracci�n;
	private int n�meroPasajeros;
	private String calidad;
	
	public Autom�vil () {}

	public Autom�vil(String combuestibleUsado, String tracci�n, int n�meroPasajeros, String calidad) {
		super();
		this.combuestibleUsado = combuestibleUsado;
		this.tracci�n = tracci�n;
		this.n�meroPasajeros = n�meroPasajeros;
		this.calidad = calidad;
	}

	public String getCombuestibleUsado() {
		return combuestibleUsado;
	}

	public void setCombuestibleUsado(String combuestibleUsado) {
		this.combuestibleUsado = combuestibleUsado;
	}

	public String getTracci�n() {
		return tracci�n;
	}

	public void setTracci�n(String tracci�n) {
		this.tracci�n = tracci�n;
	}

	public int getN�meroPasajeros() {
		return n�meroPasajeros;
	}

	public void setN�meroPasajeros(int n�meroPasajeros) {
		this.n�meroPasajeros = n�meroPasajeros;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Autom�vil [combuestibleUsado=" + combuestibleUsado + ", tracci�n=" + tracci�n + ", n�meroPasajeros="
				+ n�meroPasajeros + ", calidad=" + calidad + "]";
	}
	
	

}
