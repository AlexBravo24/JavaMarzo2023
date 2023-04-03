package com;

public class Seguro {
	
	private String robo;
	private String choque;
	
	public Seguro() {}
	
	public Seguro(String robo, String choque) {
		
		this.robo = robo;
		this.choque = choque;
	}
	public String getRobo() {
		return robo;
	}
	public void setRobo(String robo) {
		this.robo = robo;
	}
	public String getChoque() {
		return choque;
	}
	public void setChoque(String choque) {
		this.choque = choque;
	}
	@Override
	public String toString() {
		return "Seguro [robo=" + robo + ", choque=" + choque + "]";
	}

	

}
