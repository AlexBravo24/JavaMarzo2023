package com;

import java.util.Date;

public class Ticket { //Es un objeto que
	//me va abrindar un status o una respuesta 
	//de las operaciones, si se realizan o no.
	
	//Atributos
	
	private int folio;
	private Date fechaHora;
	private String nombreCliente;
	private double saldo;
	private String sucursal;
	private int idCajero;

	public Ticket () {}

	public Ticket(int folio, Date fechaHora, String nombreCliente, double saldo, String sucursal, int idCajero) {
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombreCliente = nombreCliente;
		this.saldo = saldo;
		this.sucursal = sucursal;
		this.idCajero = idCajero;
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

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdCajero() {
		return idCajero;
	}

	public void setIdCajero(int idCajero) {
		this.idCajero = idCajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nombreCliente=" + nombreCliente + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
}
