package com;

public class Perro extends Animal {
	private String raza;
	private String edad;
	private String nombre;
	private String pelaje;
	
	public Perro() {}

	public Perro(String grupo, String alimentacion, String anatomia, String raza, String edad, String nombre,
			String pelaje) {
		super(grupo, alimentacion, anatomia);
		this.raza = raza;
		this.edad = edad;
		this.nombre = nombre;
		this.pelaje = pelaje;
	}

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPelaje() {
		return pelaje;
	}

	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}

	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", edad=" + edad + ", nombre=" + nombre + ", pelaje=" + pelaje + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
}
