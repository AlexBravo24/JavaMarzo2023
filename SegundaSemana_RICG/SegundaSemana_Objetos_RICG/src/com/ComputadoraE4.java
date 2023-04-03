package com;

public class ComputadoraE4 {
	private String marca;
	private String color;
	private double memoria;
	private double RAM;
	private double procesador;
	
	public ComputadoraE4() {
		
	}

	public ComputadoraE4(String marca, String color, double memoria, double rAM, double procesador) {
		super();
		this.marca = marca;
		this.color = color;
		this.memoria = memoria;
		RAM = rAM;
		this.procesador = procesador;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getMemoria() {
		return memoria;
	}

	public void setMemoria(double memoria) {
		this.memoria = memoria;
	}

	public double getRAM() {
		return RAM;
	}

	public void setRAM(double rAM) {
		RAM = rAM;
	}

	public double getProcesador() {
		return procesador;
	}

	public void setProcesador(double procesador) {
		this.procesador = procesador;
	}

	@Override
	public String toString() {
		return "ComputadoraE4 [marca=" + marca + ", color=" + color + ", memoria=" + memoria + ", RAM=" + RAM
				+ ", procesador=" + procesador + "]";
	}
	
	
	
	

}
