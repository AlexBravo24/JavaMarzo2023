package com;

public class Casa {
	
	private String Material;
	private int Pisos;
	private String Techo;
	private int Cuartos;
	
	private Habitaci�n Cuarto;
	private Ba�o Ba�o;
	private Cochera Cochera;
	
	public Casa () {}

	public Casa(String material, int pisos, String techo, int cuartos, Habitaci�n cuarto, Ba�o ba�o, Cochera cocina) {
		Material = material;
		Pisos = pisos;
		Techo = techo;
		Cuartos = cuartos;
		Cuarto = cuarto;
		this.Ba�o = ba�o;
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

	public Habitaci�n getCuarto() {
		return Cuarto;
	}

	public void setCuarto(Habitaci�n cuarto) {
		Cuarto = cuarto;
	}

	public Ba�o getBa�o() {
		return Ba�o;
	}

	public void setBa�o(Ba�o Ba�o) {
		this.Ba�o = Ba�o;
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
				+ ", Cuarto=" + Cuarto + ", Ba�o=" + Ba�o + ", Cochera=" + Cochera + "]";
	}
	
	

}
