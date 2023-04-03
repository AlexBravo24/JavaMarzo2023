package com;

public class Procesador {
	
	private String modelo;
	private int nucleos;
	private double hz;
	
	public Procesador () {}

	public Procesador(String modelo, int nucleos, double hz) {
		super();
		this.modelo = modelo;
		this.nucleos = nucleos;
		this.hz = hz;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getNucleos() {
		return nucleos;
	}

	public void setNucleos(int nucleos) {
		this.nucleos = nucleos;
	}

	public double getHz() {
		return hz;
	}

	public void setHz(double hz) {
		this.hz = hz;
	}

	@Override
	public String toString() {
		return "Procesador [Modelo=" + modelo + ", # Nucleos=" + nucleos + ", Frecuencia=" + hz + "]";
	}
	
	

}
