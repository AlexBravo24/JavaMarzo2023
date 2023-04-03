package com;

public class Cámara {

	private int Lentes;
	private String Flash;
	private int Megapixeles;
	
	public Cámara () {}

	public Cámara(int lentes, String flash, int megapixeles) {
		Lentes = lentes;
		Flash = flash;
		Megapixeles = megapixeles;
	}

	public int getLentes() {
		return Lentes;
	}

	public void setLentes(int lentes) {
		Lentes = lentes;
	}

	public String getFlash() {
		return Flash;
	}

	public void setFlash(String flash) {
		Flash = flash;
	}

	public int getMegapixeles() {
		return Megapixeles;
	}

	public void setMegapixeles(int megapixeles) {
		Megapixeles = megapixeles;
	}

	@Override
	public String toString() {
		return "Cámara [Lentes=" + Lentes + ", Flash=" + Flash + ", Megapixeles=" + Megapixeles + "]";
	}
	
	
}
