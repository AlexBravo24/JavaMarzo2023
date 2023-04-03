package com;

public class Lapicero {
	
	private String Marca;
	private String Color;
	private String Forma;
	private String Punta;
	
	public Lapicero() {}

	public Lapicero(String marca, String color, String forma, String punta) {
		Marca = marca;
		Color = color;
		Forma = forma;
		Punta = punta;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getForma() {
		return Forma;
	}

	public void setForma(String forma) {
		Forma = forma;
	}

	public String getPunta() {
		return Punta;
	}

	public void setPunta(String punta) {
		Punta = punta;
	}

	@Override
	public String toString() {
		return "Lapicero [Marca=" + Marca + ", Color=" + Color + ", Forma=" + Forma + ", Punta=" + Punta + "]";
	}
	
	
	
	

}
