package com;

public class Carro {
	
	
	
	private String marca;
	private int año;
	private double kilometraje;
	private String color;
	
	
	private Estereos E;
	private Llantas L;
	private Asientos A;
	
	public Carro () {}

	public Carro(String marca, int año, double kilometraje, String color, Estereos e, Llantas l, Asientos a) {
		
		this.marca = marca;
		this.año = año;
		this.kilometraje = kilometraje;
		this.color = color;
		E = e;
		L = l;
		A = a;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}

	public double getKilometraje() {
		return kilometraje;
	}

	public void setKilometraje(double kilometraje) {
		this.kilometraje = kilometraje;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Estereos getE() {
		return E;
	}

	public void setE(Estereos e) {
		E = e;
	}

	public Llantas getL() {
		return L;
	}

	public void setL(Llantas l) {
		L = l;
	}

	public Asientos getA() {
		return A;
	}

	public void setA(Asientos a) {
		A = a;
	}

	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", año=" + año + ", kilometraje=" + kilometraje + ", color=" + color + ", Estereo="
				+ E + ", Llantas=" + L + ", Asientos=" + A + "]";
	}
	
	
	

}
