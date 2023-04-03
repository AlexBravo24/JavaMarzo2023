package com;

public class Velocidades {
	
	private String marca;
	private int pi�ones;
	private int platos;
	private String tipo;
	
	public Velocidades () {}

	public Velocidades(String marca, int pi�ones, int platos, String tipo) {
		super();
		this.marca = marca;
		this.pi�ones = pi�ones;
		this.platos = platos;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPi�ones() {
		return pi�ones;
	}

	public void setPi�ones(int pi�ones) {
		this.pi�ones = pi�ones;
	}

	public int getPlatos() {
		return platos;
	}

	public void setPlatos(int platos) {
		this.platos = platos;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Velocidades [marca=" + marca + ", pi�ones=" + pi�ones + ", platos=" + platos + ", tipo=" + tipo + "]";
	}
	
	

}
