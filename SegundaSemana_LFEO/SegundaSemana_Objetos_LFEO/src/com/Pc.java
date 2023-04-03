package com;

public class Pc {
	
	private String marca;
	private String procesador;
	private String SistemaO;
	
	public Pc() {} //Constructor vacio

	public Pc(String marca, String procesador, String sistemaO) { //constructor con parametros
		super();
		this.marca = marca;
		this.procesador = procesador;
		SistemaO = sistemaO;
	}
	
	

	public String getMarca() { //Getters y Setters
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}

	public String getSistemaO() {
		return SistemaO;
	}

	public void setSistemaO(String sistemaO) {
		SistemaO = sistemaO;
	}
	
	

	@Override
	public String toString() { //Metodo toString
		return "Pc [marca=" + marca + ", procesador=" + procesador + ", SistemaO=" + SistemaO + "]";
	}
	
	
	
	
	
	

}
