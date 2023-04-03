package com;

public class Gato extends Animal {

	private String Nombre;
	private String Color;
	private String Raza;
	private double Peso;
	private String Sexo;
	
	public Gato() {}

	public Gato(String especie, String clase, String hábitat, String nombre, String color, String raza, double peso,
			String sexo) {
		super(especie, clase, hábitat);
		Nombre = nombre;
		Color = color;
		Raza = raza;
		Peso = peso;
		Sexo = sexo;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public String getRaza() {
		return Raza;
	}

	public void setRaza(String raza) {
		Raza = raza;
	}

	public double getPeso() {
		return Peso;
	}

	public void setPeso(double peso) {
		Peso = peso;
	}

	public String getSexo() {
		return Sexo;
	}

	public void setSexo(String sexo) {
		Sexo = sexo;
	}

	@Override
	public String toString() {
		return "" + super.toString() + ", Gato [Nombre=" + Nombre + ", Color=" + Color + 
				", Raza=" + Raza + ", Peso=" + Peso + ", Sexo=" + Sexo + "]";
	}
	
	
	
	
}
