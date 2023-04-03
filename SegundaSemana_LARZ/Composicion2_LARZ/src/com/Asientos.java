package com;

public class Asientos {
	
	private String marca;
	private String color;
	private String material;
	
	public Asientos () {}

	public Asientos(String marca, String color, String material) {
		super();
		this.marca = marca;
		this.color = color;
		this.material = material;
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

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		return "Asientos [marca=" + marca + ", color=" + color + ", material=" + material + "]";
	}
	
	

}
