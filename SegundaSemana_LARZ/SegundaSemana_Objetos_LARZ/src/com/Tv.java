package com;

public class Tv {

	private String marca;
	private int a�o;
	private double pulgadas;
	private String NA;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getA�o() {
		return a�o;
	}
	public void setA�o(int a�o) {
		this.a�o = a�o;
	}
	public double getPulgadas() {
		return pulgadas;
	}
	public void setPulgadas(double pulgadas) {
		this.pulgadas = pulgadas;
	}
	@Override
	public String toString() {
		return "Tv [Marca: " + marca + ", A�o: " + a�o + ", Pulgadas: " + pulgadas + "]";
	}
	
	
	
}
