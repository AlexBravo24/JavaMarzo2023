package com;

public class Banco {
	
	private String nombre;
	private double precioVentaDolar;
	private double precioCompraDolar;
	
	public Banco() {} //constructor vacio
	

	public Banco(String nombre, double precioVentaDolar, double precioCompraDolar) {//Constructor con parametros
		super();
		this.nombre = nombre;
		this.precioVentaDolar = precioVentaDolar;
		this.precioCompraDolar = precioCompraDolar;
	}


	
	
	public String getNombre() { //Metodos Getters y Setters
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public double getPrecioVentaDolar() {
		return precioVentaDolar;
	}


	public void setPrecioVentaDolar(double precioVentaDolar) {
		this.precioVentaDolar = precioVentaDolar;
	}


	public double getPrecioCompraDolar() {
		return precioCompraDolar;
	}


	public void setPrecioCompraDolar(double precioCompraDolar) {
		this.precioCompraDolar = precioCompraDolar;
	}


	
	@Override
	public String toString() { //metodo toString
		return "Banco [nombre=" + nombre + ", precioVentaDolar=" + precioVentaDolar + ", precioCompraDolar="
				+ precioCompraDolar + "]";
	}
	
	
	
	
	
	

}
