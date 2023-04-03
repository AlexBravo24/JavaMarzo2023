package com;

public class Tablet {
	private String marca;
	private String modelo;
	private double precio;
	private double color;
	private Accesorios equipo;
	private Conectividad se�al;
	private Elementos funcion;
	
	public Tablet() {
		
	}

	public Tablet(String marca, String modelo, double precio, double color, Accesorios equipo, Conectividad se�al,
			Elementos funcion) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.precio = precio;
		this.color = color;
		this.equipo = equipo;
		this.se�al = se�al;
		this.funcion = funcion;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getColor() {
		return color;
	}

	public void setColor(double color) {
		this.color = color;
	}

	public Accesorios getEquipo() {
		return equipo;
	}

	public void setEquipo(Accesorios equipo) {
		this.equipo = equipo;
	}

	public Conectividad getSe�al() {
		return se�al;
	}

	public void setSe�al(Conectividad se�al) {
		this.se�al = se�al;
	}

	public Elementos getFuncion() {
		return funcion;
	}

	public void setFuncion(Elementos funcion) {
		this.funcion = funcion;
	}

	@Override
	public String toString() {
		return "Tablet [marca=" + marca + ", modelo=" + modelo + ", precio=" + precio + ", color=" + color + ", equipo="
				+ equipo + ", se�al=" + se�al + ", funcion=" + funcion + "]";
	}

	
	

}
