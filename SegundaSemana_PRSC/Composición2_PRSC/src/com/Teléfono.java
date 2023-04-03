package com;

public class Teléfono {

	private String Marca;
	private double Tamaño;
	private String Operador;
	private double Batería;
	
	private Cámara Cámara;
	private Hardware Hardware;
	private Características Características;
	
	public Teléfono () {}

	public Teléfono(String marca, double tamaño, String operador, double batería, com.Cámara cámara,
			com.Hardware hardware, com.Características características) {
		Marca = marca;
		Tamaño = tamaño;
		Operador = operador;
		Batería = batería;
		Cámara = cámara;
		Hardware = hardware;
		Características = características;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getTamaño() {
		return Tamaño;
	}

	public void setTamaño(double tamaño) {
		Tamaño = tamaño;
	}

	public String getOperador() {
		return Operador;
	}

	public void setOperador(String operador) {
		Operador = operador;
	}

	public double getBatería() {
		return Batería;
	}

	public void setBatería(double batería) {
		Batería = batería;
	}

	public Cámara getCámara() {
		return Cámara;
	}

	public void setCámara(Cámara cámara) {
		Cámara = cámara;
	}

	public Hardware getHardware() {
		return Hardware;
	}

	public void setHardware(Hardware hardware) {
		Hardware = hardware;
	}

	public Características getCaracterísticas() {
		return Características;
	}

	public void setCaracterísticas(Características características) {
		Características = características;
	}

	@Override
	public String toString() {
		return "Teléfono [Marca=" + Marca + ", Tamaño=" + Tamaño + ", Operador=" + Operador + ", Batería=" + Batería
				+ ", Cámara=" + Cámara + ", Hardware=" + Hardware + ", Características=" + Características + "]";
	}
	
	
	
}
