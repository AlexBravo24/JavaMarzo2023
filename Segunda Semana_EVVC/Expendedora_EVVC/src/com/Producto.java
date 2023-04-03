package com;

public class Producto {
	private String nombre;
	private static double precio;
	private int stock;
	
	public Producto () {}

	

	public Producto(String nombre, double precio, int stock) {
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public static double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	

	public int getStock() {
		return stock;
	}



	public void setStock(int stock) {
		this.stock = stock;
	}



	@Override
	public String toString() {
		return "Producto: " + nombre + "\nPrecio: " + precio + " pesos"+"\nStock: " + stock;
	}



	
	

}
