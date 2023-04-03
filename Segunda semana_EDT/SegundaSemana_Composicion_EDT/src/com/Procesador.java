package com;

public class Procesador {

	private String marca;
	private String modelo;
	private int nuecleos;
	private int hilos;
	private double frecuencia;
	
	public Procesador() {
		
	}
	
	public Procesador(String marca, String modelo, int nuecleos, int hilos, double frecuencia) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nuecleos = nuecleos;
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

	public int getNuecleos() {
		return nuecleos;
	}

	public void setNuecleos(int nuecleos) {
		this.nuecleos = nuecleos;
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
	
	
	
}
