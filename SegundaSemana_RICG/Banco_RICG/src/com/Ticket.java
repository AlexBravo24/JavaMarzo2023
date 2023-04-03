package com;

import java.util.Date;

public class Ticket { //Es unn objeto que me va a bridar
	//un status o una respuesta de las operaciones, si se realizan o no.
	
	//Atributos que tiene un ticket
	
	private int folio;
	private Date fechaHora;
	private double saldo;
	private String nombreCliente;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {
		
	}

	public Ticket(int folio, Date fechaHora, double saldo, String nombreCliente, String sucursal, int idCajero) {
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.saldo = saldo;
		this.nombreCliente = nombreCliente;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
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
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", saldo=" + saldo + ", nombreCliente="
				+ nombreCliente + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	

}
