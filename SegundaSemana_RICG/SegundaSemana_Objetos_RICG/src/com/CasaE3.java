package com;

public class CasaE3 {
	
	private String tama�o;
	private String color;
	private double precio;
	private double numhabitacion;
	private double numniveles;
	
	public CasaE3() {
		
	}

	public CasaE3(String tama�o, String color, double precio, double numhabitacion, double numniveles) {
		super();
		this.tama�o = tama�o;
		this.color = color;
		this.precio = precio;
		this.numhabitacion = numhabitacion;
		this.numniveles = numniveles;
	}

	public String getTama�o() {
		return tama�o;
	}

	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getNumhabitacion() {
		return numhabitacion;
	}

	public void setNumhabitacion(double numhabitacion) {
		this.numhabitacion = numhabitacion;
	}

	public double getNumniveles() {
		return numniveles;
	}

	public void setNumniveles(double numniveles) {
		this.numniveles = numniveles;
	}

	@Override
	public String toString() {
		return "CasaE3 [tama�o=" + tama�o + ", color=" + color + ", precio=" + precio + ", numhabitacion="
				+ numhabitacion + ", numniveles=" + numniveles + "]";
	}
	
	


}
