package com;

public class ZapatoE1 {
	
	private String marca;
	private String color;
	private double talla;
	private double precio;
	
	public ZapatoE1() {}

	public ZapatoE1(String marca, String color, double talla, double precio) {
		super();
		this.marca = marca;
		this.color = color;
		this.talla = talla;
		this.precio = precio;
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

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "ZapatoE1 [marca=" + marca + ", color=" + color + ", talla=" + talla + ", precio=" + precio + "]";
	}
	
	
	
}
