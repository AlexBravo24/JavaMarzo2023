package com;

public class Padre {
	
	private String animal;
	private String alimentacion;
	private String habitad;
	
	public Padre () {}

	public Padre(String animal, String alimentacion, String habitad) {
		
		this.animal = animal;
		this.alimentacion = alimentacion;
		this.habitad = habitad;
	}

	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getAlimentacion() {
		return alimentacion;
	}

	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}

	public String getHabitad() {
		return habitad;
	}

	public void setHabitad(String habitad) {
		this.habitad = habitad;
	}

	@Override
	public String toString() {
		return "Padre [Terrestre, acuático o aéreo: " + animal + ", Alimentacion: " + alimentacion + ", Domésticos o  salvaje: " + habitad + "]";
	}
	
	

}
