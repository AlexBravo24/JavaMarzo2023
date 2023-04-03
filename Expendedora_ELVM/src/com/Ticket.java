package com;

import java.util.Date;

public class Ticket {
	
	
	private int folio;
	private Date fechaHora;
	private String nombre;
	private String IdProducto;
	private int Cambio;
	
	public Ticket() {}

	

	public Ticket(int folio, Date fechaHora, String nombre, String idProducto, int cambio) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombre = nombre;
		IdProducto = idProducto;
		Cambio = cambio;
	}



	public int getFolio() {
		return folio;
	}



	public void setFolio(int folio) {
		this.folio = folio;
	}



	public Date getFechaHora() {
		return fechaHora;
	}



	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getIdProducto() {
		return IdProducto;
	}



	public void setIdProducto(String idProducto) {
		IdProducto = idProducto;
	}



	public int getCambio() {
		return Cambio;
	}



	public void setCambio(int cambio) {
		Cambio = cambio;
	}



	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nombre=" + nombre + ", IdProducto="
				+ IdProducto + ", Cambio=" + Cambio + "]";
	}



	
	
	
	

}
