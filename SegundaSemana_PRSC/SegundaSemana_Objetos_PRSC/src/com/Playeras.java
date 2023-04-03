package com;

public class Playeras {

	private String Marca;
	private String Tipo;
	private String Color;
	private String Estampado;
	private String Material;
	
	public Playeras () {}

	public Playeras(String marca, String tipo, String color, String estampado, String material) {
		Marca = marca;
		Tipo = tipo;
		Color = color;
		Estampado = estampado;
		Material = material;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getEstampado() {
		return Estampado;
	}

	public void setEstampado(String estampado) {
		Estampado = estampado;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	@Override
	public String toString() {
		return "Playeras [Marca=" + Marca + ", Tipo=" + Tipo + ", Color=" + Color + ", Estampado=" + Estampado
				+ ", Material=" + Material + "]";
	}
	
	
}
