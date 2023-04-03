package com;

public class Habitación {
	
	private String Color;
	private int Ventanas;
	private int Puertas;
	private String Piso;
	
	public Habitación () {}

	public Habitación(String color, int ventanas, int puertas, String piso) {
		Color = color;
		Ventanas = ventanas;
		Puertas = puertas;
		Piso = piso;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getVentanas() {
		return Ventanas;
	}

	public void setVentanas(int ventanas) {
		Ventanas = ventanas;
	}

	public int getPuertas() {
		return Puertas;
	}

	public void setPuertas(int puertas) {
		Puertas = puertas;
	}

	public String getPiso() {
		return Piso;
	}

	public void setPiso(String piso) {
		Piso = piso;
	}

	@Override
	public String toString() {
		return "Habitación [Color=" + Color + ", Ventanas=" + Ventanas + ", Puertas=" + Puertas + ", Piso=" + Piso
				+ "]";
	}
	
	

}
