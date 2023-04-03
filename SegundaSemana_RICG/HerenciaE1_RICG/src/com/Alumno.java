package com;

public class Alumno extends Maestro{
	private int idalumno;
	private String beca;
	private String correo;
	
	public Alumno() {
		
	}

	public Alumno(String nombre, String sexo, int matricula, String materia, String grado, int idalumno, String beca,
			String correo) {
		super(nombre, sexo, matricula, materia, grado);
		this.idalumno = idalumno;
		this.beca = beca;
		this.correo = correo;
	}

	public int getIdalumno() {
		return idalumno;
	}

	public void setIdalumno(int idalumno) {
		this.idalumno = idalumno;
	}

	public String getBeca() {
		return beca;
	}

	public void setBeca(String beca) {
		this.beca = beca;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Alumno [idalumno=" + idalumno + ", beca=" + beca + ", correo=" + correo + ", toString()="
				+ super.toString() + "]";
	}
	

}
