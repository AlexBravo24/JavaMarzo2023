package com;

public class Compra {

	private String nombre;
	private double  productoReal;
	private double  productoMin;
	private double productoMax;
	private String Pago;

	 
	public Compra() {}
	//constructores

	

	public String getNombre() {
		return nombre;
	}

	


	
	public Compra(String nombre, double productoReal, double productoMin, double productoMax, String pago) {
		super();
		this.nombre = nombre;
		this.productoReal = productoReal;
		this.productoMin = productoMin;
		this.productoMax = productoMax;
		Pago = pago;
	}



	public double getProductoReal() {
		return productoReal;
	}



	public void setProductoReal(double productoReal) {
		this.productoReal = productoReal;
	}



	public double getProductoMin() {
		return productoMin;
	}



	public void setProductoMin(double productoMin) {
		this.productoMin = productoMin;
	}



	public double getProductoMax() {
		return productoMax;
	}



	public void setProductoMax(double productoMax) {
		this.productoMax = productoMax;
	}



	public String getPago() {
		return Pago;
	}



	public void setPago(String pago) {
		Pago = pago;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	@Override
	public String toString() {
		return "Compra [nombre=" + nombre + ", productoReal=" + productoReal + ", productoMin=" + productoMin
				+ ", productoMax=" + productoMax + ", Pago=" + Pago + "]";
	}



}
