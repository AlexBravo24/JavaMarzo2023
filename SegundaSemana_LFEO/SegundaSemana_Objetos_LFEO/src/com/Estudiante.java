package com;

public class Estudiante {
	
	private String turno;
	private String grado;
	private char grupo;
	
	public Estudiante() {} //constructor vacio
	

	public Estudiante(String turno, String grado, char grupo) { //constructor con parametros
		super();
		this.turno = turno;
		this.grado = grado;
		this.grupo = grupo;
	}


	
	public String getTurno() { //Metodos Getters y Setters
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public String getGrado() {
		return grado;
	}


	public void setGrado(String grado) {
		this.grado = grado;
	}


	public char getGrupo() {
		return grupo;
	}


	public void setGrupo(char grupo) {
		this.grupo = grupo;
	}


	@Override
	public String toString() { //Metodo toString
		return "Estudiante [turno=" + turno + ", grado=" + grado + ", grupo=" + grupo + "]";
	}
	
	
	
	
	
	

}
