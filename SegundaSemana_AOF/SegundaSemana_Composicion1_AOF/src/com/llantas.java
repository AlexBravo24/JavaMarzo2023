package com;

public class llantas {

	
	
	
	private String marca;
	private String medida;
	private String fabricante;
	
	public llantas() {}
	
	public llantas(String marca, String medida, String fabricante) {
		super();
		this.marca = marca;
		this.medida = medida;
		this.fabricante = fabricante;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMedida() {
		return medida;
	}

	public void setMedida(String medida) {
		this.medida = medida;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "llantas [marca=" + marca + ", medida=" + medida + ", fabricante=" + fabricante + "]";
	}
	
	
	
	
}
