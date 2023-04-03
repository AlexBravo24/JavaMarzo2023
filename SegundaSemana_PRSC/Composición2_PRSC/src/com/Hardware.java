package com;

public class Hardware {

	private int RAM;
	private String Procesador;
	private int Peso;
	
	public Hardware () {}

	public Hardware(int rAM, String procesador, int peso) {
		RAM = rAM;
		Procesador = procesador;
		Peso = peso;
	}

	public int getRAM() {
		return RAM;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public String getProcesador() {
		return Procesador;
	}

	public void setProcesador(String procesador) {
		Procesador = procesador;
	}

	public int getPeso() {
		return Peso;
	}

	public void setPeso(int peso) {
		Peso = peso;
	}

	@Override
	public String toString() {
		return "Hardware [RAM=" + RAM + ", Procesador=" + Procesador + ", Peso=" + Peso + "]";
	}
	
	
	
}
