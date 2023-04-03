package com;

public class Animal {

	private String Especie;
	private String Clase;
	private String Hábitat;
	
	public Animal () {}
	
	public Animal(String especie, String clase, String hábitat) {
		Especie = especie;
		Clase = clase;
		Hábitat = hábitat;
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

	public String getHábitat() {
		return Hábitat;
	}

	public void setHábitat(String hábitat) {
		Hábitat = hábitat;
	}

	@Override
	public String toString() {
		return "Animal [Especie=" + Especie + ", Clase=" + Clase + ", Hábitat=" + Hábitat + "]";
	}
	
	
	
	
	
	
}
