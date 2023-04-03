package com;

public class Celular {

	
	
	private String marca;
	private String sistema;
	private String color;
	private double precio;
	
	private Funda accesorio;
	private Cargador bateria;
	private ManosLibres audio;
	
	
	
	
	public Celular() {}




	public Celular(String marca, String sistema, String color, double precio, Funda accesorio, Cargador bateria,
			ManosLibres audio) {
		super();
		this.marca = marca;
		this.sistema = sistema;
		this.color = color;
		this.precio = precio;
		this.accesorio = accesorio;
		this.bateria = bateria;
		this.audio = audio;
	}




	public String getMarca() {
		return marca;
	}




	public void setMarca(String marca) {
		this.marca = marca;
	}




	public String getSistema() {
		return sistema;
	}




	public void setSistema(String sistema) {
		this.sistema = sistema;
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




	public Funda getAccesorio() {
		return accesorio;
	}




	public void setAccesorio(Funda accesorio) {
		this.accesorio = accesorio;
	}




	public Cargador getBateria() {
		return bateria;
	}




	public void setBateria(Cargador bateria) {
		this.bateria = bateria;
	}




	public ManosLibres getAudio() {
		return audio;
	}




	public void setAudio(ManosLibres audio) {
		this.audio = audio;
	}




	@Override
	public String toString() {
		return "Celular [marca=" + marca + ", sistema=" + sistema + ", color=" + color + ", precio=" + precio
				+ ", accesorio=" + accesorio + ", bateria=" + bateria + ", audio=" + audio + "]";
	}
	
	
	
}
