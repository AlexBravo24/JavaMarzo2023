package com;

public class AutoE2 {
	
	private String marca;
	private String color;
	private double costo;
	private double km;
	private String tipo;
	
	public AutoE2() {
		
	}

	public AutoE2(String marca, String color, double costo, double km, String tipo) {
		super();
		this.marca = marca;
		this.color = color;
		this.costo = costo;
		this.km = km;
		this.tipo = tipo;
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

	public double getCosto() {
		return costo;
	}

	public void setCosto(double costo) {
		this.costo = costo;
	}

	public double getKm() {
		return km;
	}

	public void setKm(double km) {
		this.km = km;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "AutoE2 [marca=" + marca + ", color=" + color + ", costo=" + costo + ", km=" + km + ", tipo=" + tipo
				+ "]";
	}
	
	
	

}
