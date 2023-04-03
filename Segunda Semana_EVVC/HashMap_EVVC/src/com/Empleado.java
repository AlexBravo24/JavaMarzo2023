package com;

public class Empleado {
	
	private String nombre;
	private String n�meroEmpleado;
	private String puesto;
	
	public Empleado () {}

	public Empleado(String nombre, String n�meroEmpleado, String puesto) {
		super();
		this.nombre = nombre;
		this.n�meroEmpleado = n�meroEmpleado;
		this.puesto = puesto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getN�meroEmpleado() {
		return n�meroEmpleado;
	}

	public void setN�meroEmpleado(String n�meroEmpleado) {
		this.n�meroEmpleado = n�meroEmpleado;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	@Override
	public String toString() {
		return "Empleado [El nombre del empleado es: " + nombre + ", Su n�mero de empleado es: " + n�meroEmpleado + ", Su puesto es: " + puesto + "]";
	}
	
	

}
