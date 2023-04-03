package com;

public class Animales {
	
	private String Phylum;
	private String Clase;
	private String Orden;
	private String Familia;
	private String Género;
	private String Especie;
	
	public Animales () {}

	public Animales(String phylum, String clase, String orden, String familia, String género, String especie) {
		super();
		Phylum = phylum;
		Clase = clase;
		Orden = orden;
		Familia = familia;
		Género = género;
		Especie = especie;
	}

	public String getPhylum() {
		return Phylum;
	}

	public void setPhylum(String phylum) {
		Phylum = phylum;
	}

	public String getClase() {
		return Clase;
	}

	public void setClase(String clase) {
		Clase = clase;
	}

	public String getOrden() {
		return Orden;
	}

	public void setOrden(String orden) {
		Orden = orden;
	}

	public String getFamilia() {
		return Familia;
	}

	public void setFamilia(String familia) {
		Familia = familia;
	}

	public String getGénero() {
		return Género;
	}

	public void setGénero(String género) {
		Género = género;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	@Override
	public String toString() {
		return "Animales [Phylum=" + Phylum + ", Clase=" + Clase + ", Orden=" + Orden + ", Familia=" + Familia
				+ ", Género=" + Género + ", Especie=" + Especie + "]";
	}
	
	

}
