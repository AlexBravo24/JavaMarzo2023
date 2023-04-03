package com;

public class Procesador {

	private String marca;
	private String modelo;
	private int núcleos; 
	private int hilos;
	private double frecuencia;
	
	public Procesador () {}

	public Procesador(String marca, String modelo, int núcleos, int hilos, double frecuencia) {
		this.marca = marca;
		this.modelo = modelo;
		this.núcleos = núcleos;
		this.hilos = hilos;
		this.frecuencia = frecuencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
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
		return "Procesador [marca=" + marca + ", modelo=" + modelo + ", núcleos=" + núcleos + ", hilos=" + hilos
				+ ", frecuencia=" + frecuencia + "]";
	}
	
	
}
