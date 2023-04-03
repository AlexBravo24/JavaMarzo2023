package com;

public class Tv {

	private String marca;
	private int año;
	private double pulgadas;
	private String NA;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getAño() {
		return año;
	}
	public void setAño(int año) {
		this.año = año;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	@Override
	public String toString() {
		return "Tv [Marca: " + marca + ", Año: " + año + ", Pulgadas: " + pulgadas + "]";
	}
	
	
	
}
