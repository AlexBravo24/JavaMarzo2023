package com;

public class Television {
	
	public String marca;
	public int pulgadas;
	public double resolución;
	
	public Television() {
		
	}

	public Television(String marca, int pulgadas, double resolución) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
		this.resolución = resolución;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPulgadas() {
		return pulgadas;
	}

	public void setPulgadas(int pulgadas) {
		this.pulgadas = pulgadas;
	}

	public double getResolución() {
		return resolución;
	}

	public void setResolución(double resolución) {
		this.resolución = resolución;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", pulgadas=" + pulgadas + ", resolución=" + resolución + "]";
	}
	
	

}
