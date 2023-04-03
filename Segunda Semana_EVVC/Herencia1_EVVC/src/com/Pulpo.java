package com;

public class Pulpo extends Animales {
	

	private String nombreCom�n;
	private int n�meroTent�culos;
	private int n�meroAnillos;
	private double pesoPromedio;
	private double tama�oPromedio;
	
	public Pulpo () {}
	
	public Pulpo(String phylum, String clase, String orden, String familia, String g�nero, String especie,
			String nombreCom�n, int n�meroTent�culos, int n�meroAnillos, double pesoPromedio, double tama�oPromedio) {
		super(phylum, clase, orden, familia, g�nero, especie);
		this.nombreCom�n = nombreCom�n;
		this.n�meroTent�culos = n�meroTent�culos;
		this.n�meroAnillos = n�meroAnillos;
		this.pesoPromedio = pesoPromedio;
		this.tama�oPromedio = tama�oPromedio;
	}
	

	public String getNombreCom�n() {
		return nombreCom�n;
	}

	public void setNombreCom�n(String nombreCom�n) {
		this.nombreCom�n = nombreCom�n;
	}

	public int getN�meroTent�culos() {
		return n�meroTent�culos;
	}

	public void setN�meroTent�culos(int n�meroTent�culos) {
		this.n�meroTent�culos = n�meroTent�culos;
	}

	public int getN�meroAnillos() {
		return n�meroAnillos;
	}

	public void setN�meroAnillos(int n�meroAnillos) {
		this.n�meroAnillos = n�meroAnillos;
	}

	public double getPesoPromedio() {
		return pesoPromedio;
	}

	public void setPesoPromedio(double pesoPromedio) {
		this.pesoPromedio = pesoPromedio;
	}

	public double getTama�oPromedio() {
		return tama�oPromedio;
	}

	public void setTama�oPromedio(double tama�oPromedio) {
		this.tama�oPromedio = tama�oPromedio;
	}

	@Override
	public String toString() {
		return "Pulpo [nombreCom�n=" + nombreCom�n + ", n�meroTent�culos=" + n�meroTent�culos + ", n�meroAnillos="
				+ n�meroAnillos + ", pesoPromedio=" + pesoPromedio + ", tama�oPromedio=" + tama�oPromedio
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
