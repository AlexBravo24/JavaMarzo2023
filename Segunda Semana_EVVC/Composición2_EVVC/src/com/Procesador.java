package com;

public class Procesador {
	
	private int núcleos;
	private int hilos;
	private double frecuencia;
	
	public Procesador() {}

	public Procesador(int núcleos, int hilos, double frecuencia) {
		super();
		this.núcleos = núcleos;
		this.hilos = hilos;
		this.frecuencia = frecuencia;
	}

	public int getNúcleos() {
		return núcleos;
	}

	public void setNúcleos(int núcleos) {
		this.núcleos = núcleos;
	}

	public int getHilos() {
		return hilos;
	}

	public void setHilos(int hilos) {
		this.hilos = hilos;
	}

	public double getFrecuencia() {
		return frecuencia;
	}

	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}

	@Override
	public String toString() {
		return "Procesador [núcleos=" + núcleos + ", hilos=" + hilos + ", frecuencia=" + frecuencia + "]";
	}
	
	
	
	
	
	
	

}
