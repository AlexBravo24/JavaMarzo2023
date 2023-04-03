package com;

public class Procesador {
	
	private int n�cleos;
	private int hilos;
	private double frecuencia;
	
	public Procesador() {}

	public Procesador(int n�cleos, int hilos, double frecuencia) {
		super();
		this.n�cleos = n�cleos;
		this.hilos = hilos;
		this.frecuencia = frecuencia;
	}

	public int getN�cleos() {
		return n�cleos;
	}

	public void setN�cleos(int n�cleos) {
		this.n�cleos = n�cleos;
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
		return "Procesador [n�cleos=" + n�cleos + ", hilos=" + hilos + ", frecuencia=" + frecuencia + "]";
	}
	
	
	
	
	
	
	

}
