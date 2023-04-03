package com;

public class Empleado {
	
	private String nombre;
	private String númeroEmpleado;
	private String puesto;
	
	public Empleado () {}

	public Empleado(String nombre, String númeroEmpleado, String puesto) {
		super();
		this.nombre = nombre;
		this.númeroEmpleado = númeroEmpleado;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNúmeroEmpleado() {
		return númeroEmpleado;
	}

	public void setNúmeroEmpleado(String númeroEmpleado) {
		this.númeroEmpleado = númeroEmpleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [El nombre del empleado es: " + nombre + ", Su número de empleado es: " + númeroEmpleado + ", Su puesto es: " + puesto + "]";
	}
	
	

}
