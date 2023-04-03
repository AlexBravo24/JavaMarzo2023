package com;

import java.util.Date;

public class Ticket {
	private int folio;
	private Date fechaHora;
	private String nombreProducto;
	private double costo;
	private String Lugars;
	private int idMaquina;
	public Ticket() {}
	public Ticket(int folio, Date fechaHora, String nombreProducto, double costo, String lugars, int idMaquina) {
		super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombreProducto = nombreProducto;
		this.costo = costo;
		Lugars = lugars;
		this.idMaquina = idMaquina;
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
	public double getCosto() {
		return costo;
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	public String getLugars() {
		return Lugars;
	}
	public void setLugars(String lugars) {
		Lugars = lugars;
	}
	public int getIdMaquina() {
		return idMaquina;
	}
	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
	}
	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nombreProducto=" + nombreProducto + ", costo="
				+ costo + ", Lugars=" + Lugars + ", idMaquina=" + idMaquina + "]";
	}
	
	
	

}
