package com;

public class Ba�o {
	
	private String Tipo;
	private String Accesorio;
	private String Ubicaci�n;
	
	public Ba�o () {}

	public Ba�o(String tipo, String accesorio, String ubicaci�n) {
		Tipo = tipo;
		Accesorio = accesorio;
		Ubicaci�n = ubicaci�n;
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

	public String getUbicaci�n() {
		return Ubicaci�n;
	}

	public void setUbicaci�n(String ubicaci�n) {
		Ubicaci�n = ubicaci�n;
	}

	@Override
	public String toString() {
		return "Ba�o [Tipo=" + Tipo + ", Accesorio=" + Accesorio + ", Ubicaci�n=" + Ubicaci�n + "]";
	}
	
	

}
