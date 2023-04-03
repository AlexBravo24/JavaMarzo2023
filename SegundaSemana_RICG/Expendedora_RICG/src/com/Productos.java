package com;

public class Productos {
	
	private String Producto;
	private String Clave;
	private int Costo;
	
	public Productos () {}

	public Productos(String producto, String clave, int costo) {
		super();
		Producto = producto;
		Clave = clave;
		Costo = costo;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public String getClave() {
		return Clave;
	}

	public void setClave(String clave) {
		Clave = clave;
	}

	public int getCosto() {
		return Costo;
	}

	public void setCosto(int costo) {
		Costo = costo;
	}

	@Override
	public String toString() {
		return "Productos [Producto:" + Producto + ", Clave:" + Clave + ", Costo:" + Costo + "]";
	}
	
	

}
