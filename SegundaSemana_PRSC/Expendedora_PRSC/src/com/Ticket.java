package com;

import java.util.Date;

public class Ticket {

	private int folio;
	private int idM�quina;
	private Date fechaHora;
	private String Producto;
	private double Costo;
	private double pago;
	private double cambio;
	
	public Ticket () {}

	public Ticket(int folio, int idM�quina, Date fechaHora, String producto, double costo, double pago, double cambio) {
		this.folio = folio;
		this.idM�quina = idM�quina;
		this.fechaHora = fechaHora;
		Producto = producto;
		Costo = costo;
		this.pago = pago;
		this.cambio = cambio;
	}

	public int getFolio() {
		return folio;
	}

	public void setFolio(int folio) {
		this.folio = folio;
	}

	public int getIdM�quina() {
		return idM�quina;
	}

	public void setIdM�quina(int idM�quina) {
		this.idM�quina = idM�quina;
	}

	public Date getFechaHora() {
		return fechaHora;
	}

	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}

	public String getProducto() {
		return Producto;
	}

	public void setProducto(String producto) {
		Producto = producto;
	}

	public double getCosto() {
		return Costo;
	}

	public void setCosto(int costo) {
		Costo = costo;
	}

	public double getPago() {
		return pago;
	}

	public void setPago(double pago) {
		this.pago = pago;
	}

	public double getCambio() {
		return cambio;
	}

	public void setCambio(double cambio) {
		this.cambio = cambio;
	}

	@Override
	public String toString() {
		return "\n--Ticket-- \nFolio: " + folio + "\nId M�quina: " + idM�quina + "\nFecha y Hora:" + fechaHora + "\nProducto:"
				+ Producto + "\nCosto: $" + Costo + "\nPago: $" + pago + "\nCambio: $" + cambio ;
	}
	
	
	
	
	
}
