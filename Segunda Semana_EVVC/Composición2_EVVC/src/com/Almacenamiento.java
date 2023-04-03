package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private int generaci�n;
	private double velocidadTransferencia;
	
	public Almacenamiento () {}

	public Almacenamiento(String marca, String tipo, int generaci�n, double velocidadTransferencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.generaci�n = generaci�n;
		this.velocidadTransferencia = velocidadTransferencia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getGeneraci�n() {
		return generaci�n;
	}

	public void setGeneraci�n(int generaci�n) {
		this.generaci�n = generaci�n;
	}

	public double getVelocidadTransferencia() {
		return velocidadTransferencia;
	}

	public void setVelocidadTransferencia(double velocidadTransferencia) {
		this.velocidadTransferencia = velocidadTransferencia;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", generaci�n=" + generaci�n
				+ ", velocidadTransferencia=" + velocidadTransferencia + "]";
	}
	
	
	
	

}
