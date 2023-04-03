package com;

public class Auto {
	
	private String marca;
	private String color;
	private int kilometraje;
	private int cilindros;
	
	public Auto () {
		
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

	public int getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(int kilometraje) {
		this.kilometraje = kilometraje;
	}

	public int getCilindros() {
		return cilindros;
	}

	public void setCilindros(int cilindros) {
		this.cilindros = cilindros;
	}

	@Override
	public String toString() {
		return "Auto [marca=" + marca + ", color=" + color + ", kilometraje=" + kilometraje + ", cilindros=" + cilindros
				+ "]";
	}
	
	
	

}
