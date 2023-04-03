package com;

public class Accesorios {
	
	private String modelo;
	private String color;
	private String funda;
	private String auidofos;
	private double precio;
	
	public Accesorios() {
		
	}

	public Accesorios(String modelo, String color, String funda, String auidofos, double precio) {
		super();
		this.modelo = modelo;
		this.color = color;
		this.funda = funda;
		this.auidofos = auidofos;
		this.precio = precio;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFunda() {
		return funda;
	}

	public void setFunda(String funda) {
		this.funda = funda;
	}

	public String getAuidofos() {
		return auidofos;
	}

	public void setAuidofos(String auidofos) {
		this.auidofos = auidofos;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Accesorios [modelo=" + modelo + ", color=" + color + ", funda=" + funda + ", auidofos=" + auidofos
				+ ", precio=" + precio + "]";
	}
	

}
