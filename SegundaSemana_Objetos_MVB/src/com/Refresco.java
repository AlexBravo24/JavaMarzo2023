package com;

public class Refresco {

	private String nombre;
	private double precio;
	private String envase;
	private int onzas;
	
	public Refresco() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getEnvase() {
		return envase;
	}

	public void setEnvase(String envase) {
		this.envase = envase;
	}

	public int getOnzas() {
		return onzas;
	}

	public void setOnzas(int onzas) {
		this.onzas = onzas;
	}

	@Override
	public String toString() {
		return "Refresco [nombre=" + nombre + ", precio=" + precio + ", envase=" + envase + ", onzas=" + onzas + "]";
	}

	public Refresco(String nombre, double precio, String envase, int onzas) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.envase = envase;
		this.onzas = onzas;
	}
	
	
	
	
	
	
	
	
	
}
