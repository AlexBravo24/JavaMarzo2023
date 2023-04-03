package com;

public class Velocidades {
	
	private String marca;
	private int piñones;
	private int platos;
	private String tipo;
	
	public Velocidades () {}

	public Velocidades(String marca, int piñones, int platos, String tipo) {
		super();
		this.marca = marca;
		this.piñones = piñones;
		this.platos = platos;
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPiñones() {
		return piñones;
	}

	public void setPiñones(int piñones) {
		this.piñones = piñones;
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
		return "Velocidades [marca=" + marca + ", piñones=" + piñones + ", platos=" + platos + ", tipo=" + tipo + "]";
	}
	
	

}
