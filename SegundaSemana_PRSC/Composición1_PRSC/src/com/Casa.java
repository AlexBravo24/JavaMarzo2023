package com;

public class Casa {
	
	private String Material;
	private int Pisos;
	private String Techo;
	private int Cuartos;
	
	private Habitación Cuarto;
	private Baño Baño;
	private Cochera Cochera;
	
	public Casa () {}

	public Casa(String material, int pisos, String techo, int cuartos, Habitación cuarto, Baño baño, Cochera cocina) {
		Material = material;
		Pisos = pisos;
		Techo = techo;
		Cuartos = cuartos;
		Cuarto = cuarto;
		this.Baño = baño;
		this.Cochera = cocina;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}

	public int getPisos() {
		return Pisos;
	}

	public void setPisos(int pisos) {
		Pisos = pisos;
	}

	public String getTecho() {
		return Techo;
	}

	public void setTecho(String techo) {
		Techo = techo;
	}

	public int getCuartos() {
		return Cuartos;
	}

	public void setCuartos(int cuartos) {
		Cuartos = cuartos;
	}

	public Habitación getCuarto() {
		return Cuarto;
	}

	public void setCuarto(Habitación cuarto) {
		Cuarto = cuarto;
	}

	public Baño getBaño() {
		return Baño;
	}

	public void setBaño(Baño Baño) {
		this.Baño = Baño;
	}

	public Cochera getCocina() {
		return Cochera;
	}

	public void setCocina(Cochera cocina) {
		this.Cochera = cocina;
	}

	@Override
	public String toString() {
		return "Casa [Material=" + Material + ", Pisos=" + Pisos + ", Techo=" + Techo + ", Cuartos=" + Cuartos
				+ ", Cuarto=" + Cuarto + ", Baño=" + Baño + ", Cochera=" + Cochera + "]";
	}
	
	

}
