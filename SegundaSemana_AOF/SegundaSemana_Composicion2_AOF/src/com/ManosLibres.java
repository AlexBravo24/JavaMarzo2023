package com;

public class ManosLibres {

	
	private String tipo;
	private String cantidad;
	private String marca;
	
	
	public ManosLibres() {}


	public ManosLibres(String tipo, String cantidad, String marca) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.marca = marca;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCantidad() {
		return cantidad;
	}


	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	@Override
	public String toString() {
		return "ManosLibres [tipo=" + tipo + ", cantidad=" + cantidad + ", marca=" + marca + "]";
	}
	
	
	
	
}

