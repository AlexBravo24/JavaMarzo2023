package com;

public class Almacenamiento {
	
	private String marca;
	private String tipo;
	private int generación;
	private double velocidadTransferencia;
	
	public Almacenamiento () {}

	public Almacenamiento(String marca, String tipo, int generación, double velocidadTransferencia) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.generación = generación;
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

	public int getGeneración() {
		return generación;
	}

	public void setGeneración(int generación) {
		this.generación = generación;
	}

	public double getVelocidadTransferencia() {
		return velocidadTransferencia;
	}

	public void setVelocidadTransferencia(double velocidadTransferencia) {
		this.velocidadTransferencia = velocidadTransferencia;
	}

	@Override
	public String toString() {
		return "Almacenamiento [marca=" + marca + ", tipo=" + tipo + ", generación=" + generación
				+ ", velocidadTransferencia=" + velocidadTransferencia + "]";
	}
	
	
	
	

}
