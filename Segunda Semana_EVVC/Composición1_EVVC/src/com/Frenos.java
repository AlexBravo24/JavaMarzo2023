package com;

public class Frenos {

	private String marca;
	private String tipo;
	private String mecanismo;
	
	public Frenos () {}

	public Frenos(String marca, String tipo, String mecanismo) {
		super();
		this.marca = marca;
		this.tipo = tipo;
		this.mecanismo = mecanismo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMecanismo() {
		return mecanismo;
	}

	public void setMecanismo(String mecanismo) {
		this.mecanismo = mecanismo;
	}

	@Override
	public String toString() {
		return "Frenos [marca=" + marca + ", tipo=" + tipo + ", mecanismo=" + mecanismo + "]";
	}
	
	
}
