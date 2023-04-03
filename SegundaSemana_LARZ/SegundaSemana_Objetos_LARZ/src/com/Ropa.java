package com;

public class Ropa {
	
	private String marca;
	private int NA1;
	private double precio;
	private String prenda;
	
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public String getPrenda() {
		return prenda;
	}
	public void setPrenda(String prenda) {
		this.prenda = prenda;
	}
	
	
	@Override
	public String toString() {
		return "Ropa [Marca: " + marca + ", Precio: " + precio + ", Prenda: " + prenda + "]";
	}
	
	
	
	
	
}
