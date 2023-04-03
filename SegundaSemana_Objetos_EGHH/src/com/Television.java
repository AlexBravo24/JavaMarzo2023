package com;

public class Television {
	
	public String marca;
	public int pulgadas;
	public double resoluci�n;
	
	public Television() {
		
	}

	public Television(String marca, int pulgadas, double resoluci�n) {
		super();
		this.marca = marca;
		this.pulgadas = pulgadas;
		this.resoluci�n = resoluci�n;
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

	public double getResoluci�n() {
		return resoluci�n;
	}

	public void setResoluci�n(double resoluci�n) {
		this.resoluci�n = resoluci�n;
	}

	@Override
	public String toString() {
		return "Television [marca=" + marca + ", pulgadas=" + pulgadas + ", resoluci�n=" + resoluci�n + "]";
	}
	
	

}
