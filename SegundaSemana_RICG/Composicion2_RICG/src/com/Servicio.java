package com;

public class Servicio {
	
	private String a�o;
	private String mes;
	
	public Servicio() {
		
	}

	public Servicio(String a�o, String mes) {
		
		this.a�o = a�o;
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Servicio [a�o=" + a�o + ", mes=" + mes + "]";
	}

	public String getA�o() {
		return a�o;
	}

	public void setA�o(String a�o) {
		this.a�o = a�o;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	

}
