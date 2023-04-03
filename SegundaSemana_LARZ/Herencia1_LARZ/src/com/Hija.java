package com;

public class Hija extends Padre {
	
	private String tipo;
	private String habitad2;
	private String nombre;
	
	public Hija () {}


	public Hija(String animal, String alimentacion, String habitad, String tipo, String habitad2, String nombre) {
		super(animal, alimentacion, habitad);
		this.tipo = tipo;
		this.habitad2 = habitad2;
		this.nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getHabitad2() {
		return habitad2;
	}


	public void setHabitad2(String habitad2) {
		this.habitad2 = habitad2;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	
	@Override
	public String toString() {
		return super.toString() + " Hija [Animal: " + tipo + ", Habitad: " + habitad2 + ", Raza: " + nombre + "]";
	}

	

}
