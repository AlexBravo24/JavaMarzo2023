package com;

public class Animal {

	private String Especie;
	private String Clase;
	private String H�bitat;
	
	public Animal () {}
	
	public Animal(String especie, String clase, String h�bitat) {
		Especie = especie;
		Clase = clase;
		H�bitat = h�bitat;
	}

	public String getEspecie() {
		return Especie;
	}

	public void setEspecie(String especie) {
		Especie = especie;
	}

	public String getClase() {
		return Clase;
	}

	public void setClase(String clase) {
		Clase = clase;
	}

	public String getH�bitat() {
		return H�bitat;
	}

	public void setH�bitat(String h�bitat) {
		H�bitat = h�bitat;
	}

	@Override
	public String toString() {
		return "Animal [Especie=" + Especie + ", Clase=" + Clase + ", H�bitat=" + H�bitat + "]";
	}
	
	
	
	
	
	
}
