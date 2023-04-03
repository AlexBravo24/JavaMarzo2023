package com;

public class Baño {
	
	private String Tipo;
	private String Accesorio;
	private String Ubicación;
	
	public Baño () {}

	public Baño(String tipo, String accesorio, String ubicación) {
		Tipo = tipo;
		Accesorio = accesorio;
		Ubicación = ubicación;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public String getAccesorio() {
		return Accesorio;
	}

	public void setAccesorio(String accesorio) {
		Accesorio = accesorio;
	}

	public String getUbicación() {
		return Ubicación;
	}

	public void setUbicación(String ubicación) {
		Ubicación = ubicación;
	}

	@Override
	public String toString() {
		return "Baño [Tipo=" + Tipo + ", Accesorio=" + Accesorio + ", Ubicación=" + Ubicación + "]";
	}
	
	

}
