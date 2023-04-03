package com;

public class Accesorio {
	
	private String casco;
	private double llantas;
	
	public Accesorio() {
		
	}

	public Accesorio(String casco, double llantas) {
	
		this.casco = casco;
		this.llantas = llantas;
	}

	public String getCasco() {
		return casco;
	}

	public void setCasco(String casco) {
		this.casco = casco;
	}

	public double getLlantas() {
		return llantas;
	}

	public void setLlantas(double llantas) {
		this.llantas = llantas;
	}

	@Override
	public String toString() {
		return "Accesorio [casco=" + casco + ", llantas=" + llantas + "]";
	}
	

}
