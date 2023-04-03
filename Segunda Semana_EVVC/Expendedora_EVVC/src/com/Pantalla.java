package com;

public class Pantalla {
	
	private String nombreProducto;
	private double precio;
	private double dinero=0;
	private double cambio=0;
	
	public Pantalla () {}

	

	public Pantalla(String nombreProducto, double precio, double dinero, double cambio) {
		this.nombreProducto = nombreProducto;
		this.precio = precio;
		this.dinero = dinero;
		this.cambio = cambio;
	}



	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getDinero() {
		return dinero;
	}

	public void setDinero(double dinero) {
		this.dinero = dinero;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "Pantalla \nProducto: " + nombreProducto + "\nPrecio: " + precio + "\nIngreso: " + dinero + " pesos\n" + "Su cambio: "
				+ cambio + " pesos";
	}
	
	

}
