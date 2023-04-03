package com;

public class Estereo {

	
	//Atributos
	private String marca;
	private int precio;
	private int puertos_usb;
	private String voltaje;
	public Estereo() {}
	public Estereo(String marca, int precio, int puertos_usb, String voltaje) {
		super();
		this.marca = marca;
		this.precio = precio;
		this.puertos_usb = puertos_usb;
		this.voltaje = voltaje;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getPuertos_usb() {
		return puertos_usb;
	}
	public void setPuertos_usb(int puertos_usb) {
		this.puertos_usb = puertos_usb;
	}
	public String getVoltaje() {
		return voltaje;
	}
	public void setVoltaje(String voltaje) {
		this.voltaje = voltaje;
	}
	@Override
	public String toString() {
		return "Estereo [marca=" + marca + ", precio=" + precio + ", puertos_usb=" + puertos_usb + ", voltaje="
				+ voltaje + "]";
	}
	
	
	
	
}
