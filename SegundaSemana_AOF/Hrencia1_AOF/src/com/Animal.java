package com;

public class Animal {
private String Grupo;
private String Alimentacion;
private String Anatomia;
	
	public Animal() {}

	public Animal(String grupo, String alimentacion, String anatomia) {
		super();
		Grupo = grupo;
		Alimentacion = alimentacion;
		Anatomia = anatomia;
	}

	public String getGrupo() {
		return Grupo;
	}

	public void setGrupo(String grupo) {
		Grupo = grupo;
	}

	public String getAlimentacion() {
		return Alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		Alimentacion = alimentacion;
	}

	public String getAnatomia() {
		return Anatomia;
	}

	public void setAnatomia(String anatomia) {
		Anatomia = anatomia;
	}

	@Override
	public String toString() {
		return "Animal [Grupo=" + Grupo + ", Alimentacion=" + Alimentacion + ", Anatomia=" + Anatomia + "]";
	}
	
	

}
