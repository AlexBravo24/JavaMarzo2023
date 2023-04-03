package com;

public class Maestro {
	
	private String nombre;
	private String sexo;
	private int matricula;
	private String materia;
	private String grado;
	
	
	public Maestro() {
		
	}


	public Maestro(String nombre, String sexo, int matricula, String materia, String grado) {
		
		this.nombre = nombre;
		this.sexo = sexo;
		this.matricula = matricula;
		this.materia = materia;
		this.grado = grado;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getSexo() {
		return sexo;
	}


	public void setSexo(String sexo) {
		this.sexo = sexo;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getMateria() {
		return materia;
	}


	public void setMateria(String materia) {
		this.materia = materia;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	@Override
	public String toString() {
		return "Maestro [nombre=" + nombre + ", sexo=" + sexo + ", matricula=" + matricula + ", materia=" + materia
				+ ", grado=" + grado + "]";
	}
	
}
