package com;

public class Pulpo extends Animales {
	

	private String nombreComún;
	private int númeroTentáculos;
	private int númeroAnillos;
	private double pesoPromedio;
	private double tamañoPromedio;
	
	public Pulpo () {}
	
	public Pulpo(String phylum, String clase, String orden, String familia, String género, String especie,
			String nombreComún, int númeroTentáculos, int númeroAnillos, double pesoPromedio, double tamañoPromedio) {
		super(phylum, clase, orden, familia, género, especie);
		this.nombreComún = nombreComún;
		this.númeroTentáculos = númeroTentáculos;
		this.númeroAnillos = númeroAnillos;
		this.pesoPromedio = pesoPromedio;
		this.tamañoPromedio = tamañoPromedio;
	}
	

	public String getNombreComún() {
		return nombreComún;
	}

	public void setNombreComún(String nombreComún) {
		this.nombreComún = nombreComún;
	}

	public int getNúmeroTentáculos() {
		return númeroTentáculos;
	}

	public void setNúmeroTentáculos(int númeroTentáculos) {
		this.númeroTentáculos = númeroTentáculos;
	}

	public int getNúmeroAnillos() {
		return númeroAnillos;
	}

	public void setNúmeroAnillos(int númeroAnillos) {
		this.númeroAnillos = númeroAnillos;
	}

	public double getPesoPromedio() {
		return pesoPromedio;
	}

	public void setPesoPromedio(double pesoPromedio) {
		this.pesoPromedio = pesoPromedio;
	}

	public double getTamañoPromedio() {
		return tamañoPromedio;
	}

	public void setTamañoPromedio(double tamañoPromedio) {
		this.tamañoPromedio = tamañoPromedio;
	}

	@Override
	public String toString() {
		return "Pulpo [nombreComún=" + nombreComún + ", númeroTentáculos=" + númeroTentáculos + ", númeroAnillos="
				+ númeroAnillos + ", pesoPromedio=" + pesoPromedio + ", tamañoPromedio=" + tamañoPromedio
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
