package com;

public class Mochila {

	private String color;
	private String material;
	private int cierres;
	private String tamano;
	
	public Mochila () {}

	public Mochila(String color, String material, int cierres, String tamano) {
		super();
		this.color = color;
		this.material = material;
		this.cierres = cierres;
		this.tamano = tamano;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCierres() {
		return cierres;
	}

	public void setCierres(int cierres) {
		this.cierres = cierres;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return "Mochila [color=" + color + ", material=" + material + ", cierres=" + cierres + ", tamano=" + tamano
				+ "]";
	}
	
	
	
	
	
}
