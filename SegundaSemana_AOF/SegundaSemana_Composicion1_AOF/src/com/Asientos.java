package com;

public class Asientos {

	private String color;
	private String material;

	public Asientos() {}

	public Asientos(String color, String material) {
		super();
		this.color = color;
		this.material = material;
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
		return "Asientos [color=" + color + ", material=" + material + "]";
	}
	
	
}
