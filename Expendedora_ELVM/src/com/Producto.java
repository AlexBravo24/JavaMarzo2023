package com;

public class Producto {
	//declaramos los atributos
	
	private String NombreProducto;
	private String Clave;
	private static int Precio;
	//private int stock;
	//inicialisamos la estructura vacia
	public Producto() {}
	//estructura con sus elementos
	public Producto(String nombreProducto, String clave, int costo) {
		super();
		NombreProducto = nombreProducto;
		Clave = clave;
		Precio = costo;
	}
	public String getNombreProducto() {
		return NombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		NombreProducto = nombreProducto;
	}
	public String getClave() {
		return Clave;
	}
	public void setClave(String clave) {
		Clave = clave;
	}
	public static int getPrecio() {
		return Precio;
	}
	public void setPrecio(int precio) {
		Precio = precio;
	}
	@Override
	public String toString() {
		return "Producto [NombreProducto=" + NombreProducto + ", Clave=" + Clave + ", Precio=" + Precio + "]";
	}

	
	
	

}
