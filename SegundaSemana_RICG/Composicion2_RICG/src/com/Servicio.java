package com;

public class Servicio {
	
	private String año;
	private String mes;
	
	public Servicio() {
		
	}

	public Servicio(String año, String mes) {
		
		this.año = año;
		this.mes = mes;
	}

	@Override
	public String toString() {
		return "Servicio [año=" + año + ", mes=" + mes + "]";
	}

	public String getAño() {
		return año;
	}

	public void setAño(String año) {
		this.año = año;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}
	

}
