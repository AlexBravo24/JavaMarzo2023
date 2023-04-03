package com;

public class Televisión {
	
	private String Marca;
	private double Tamaño;
	private String Imagen;
	private String Transmisión;
	
	public Televisión () {}

	public Televisión(String marca, double tamaño, String imagen, String transmisión) {
		Marca = marca;
		Tamaño = tamaño;
		Imagen = imagen;
		Transmisión = transmisión;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getTamaño() {
		return Tamaño;
	}

	public void setTamaño(double tamaño) {
		Tamaño = tamaño;
	}

	public String getImagen() {
		return Imagen;
	}

	public void setImagen(String imagen) {
		Imagen = imagen;
	}

	public String getTransmisión() {
		return Transmisión;
	}

	public void setTransmisión(String transmisión) {
		Transmisión = transmisión;
	}

	@Override
	public String toString() {
		return "Televisión [Marca=" + Marca + ", Tamaño=" + Tamaño + ", Imagen=" + Imagen + ", Transmisión="
				+ Transmisión + "]";
	}
	
	
	

}
