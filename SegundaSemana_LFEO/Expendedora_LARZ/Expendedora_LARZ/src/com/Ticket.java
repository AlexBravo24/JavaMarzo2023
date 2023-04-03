package com;

import java.util.Date;

public class Ticket {
	
	private int folio;
	private Date fechaHora;
	private String nombreProducto;
	private String IdProducto;
	private int Cambio;
	
	public Ticket () {}

	public Ticket(int folio, Date fechaHora, String nombreProducto, String idProducto, int cambio) {
		
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombreProducto = nombreProducto;
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

	public String getNombreProducto() {
		return nombreProducto;
	}

	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
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
		return "Ticket [Folio:" + folio + ", Fecha:" + fechaHora + ", Producto:" + nombreProducto
				+ ", Id:" + IdProducto + ", Cambio:" + Cambio + "]";
	}
	
	

	

}
