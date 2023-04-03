package com;

import java.util.Date;

public class Ticket {//es un objeto que 
	//me va abrindar un status o respuesta
	//de las operaciones, si se realizan o no.
	
	//atributos que tiene un ticket
	
	private int folio;
	private Date fechaHora;
	private String nobreCliente;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket() {}

	public Ticket(int folio, Date fechaHora, String nobreCliente, double saldo, String sucursal, int idCajero) {
		//super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nobreCliente = nobreCliente;
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

	public String getNobreCliente() {
		return nobreCliente;
	}

	public void setNobreCliente(String nobreCliente) {
		this.nobreCliente = nobreCliente;
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
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nobreCliente=" + nobreCliente + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	

}
