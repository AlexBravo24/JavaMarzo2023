package com;

public class Ropa {
	
	private String color;
	private int talla;
	private  String marca;
	
	public Ropa() {
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Ropa [color=" + color + ", talla=" + talla + ", marca=" + marca + "]";
	}
	
	

}
