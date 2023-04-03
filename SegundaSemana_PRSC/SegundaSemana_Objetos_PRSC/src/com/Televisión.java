package com;

public class Televisi�n {
	
	private String Marca;
	private double Tama�o;
	private String Imagen;
	private String Transmisi�n;
	
	public Televisi�n () {}

	public Televisi�n(String marca, double tama�o, String imagen, String transmisi�n) {
		Marca = marca;
		Tama�o = tama�o;
		Imagen = imagen;
		Transmisi�n = transmisi�n;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getTama�o() {
		return Tama�o;
	}

	public void setTama�o(double tama�o) {
		Tama�o = tama�o;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getTransmisi�n() {
		return Transmisi�n;
	}

	public void setTransmisi�n(String transmisi�n) {
		Transmisi�n = transmisi�n;
	}

	@Override
	public String toString() {
		return "Televisi�n [Marca=" + Marca + ", Tama�o=" + Tama�o + ", Imagen=" + Imagen + ", Transmisi�n="
				+ Transmisi�n + "]";
	}
	
	
	

}
