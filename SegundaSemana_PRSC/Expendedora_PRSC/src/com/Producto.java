package com;

public class Producto {
	
	private String Prod;
	private double Precio;
	private int Inventario;
	
	public Producto () {}

	public Producto(String prod, double precio, int inventario) {
		Prod = prod;
		Precio = precio;
		Inventario = inventario;
	}

	public String getProd() {
		return Prod;
	}

	public void setProd(String prod) {
		Prod = prod;
	}

	public double getPrecio() {
		return Precio;
	}

	public void setPrecio(double precio) {
		Precio = precio;
	}

	public int getInventario() {
		return Inventario;
	}

	public void setInventario(int inventario) {
		Inventario = inventario;
	}

	@Override
	public String toString() {
		return "Producto: " + Prod + "\nPrecio: $" + Precio + "\nInventario: " + Inventario;
	}
	
	
	

}
