package com;

import java.util.Date;

public class Ticket { //Es un objeto que me va a brindar un status o respuestas
	//de las operaciones, si se realizan o no. 
	
	//Atributos que tiene un ticket.

	private int folio;
	private Date fechahora;
	private String nombreCliente;
	private double saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket () {}

	public Ticket(int folio, Date fechahora, String nombreCliente, double saldo, String sucursal, int idCajero) {
		
		this.folio = folio;
		this.fechahora = fechahora;
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

	public Date getFechahora() {
		return fechahora;
	}

	public void setFechahora(Date fechahora) {
		this.fechahora = fechahora;
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
		return "Ticket [folio=" + folio + ", fechahora=" + fechahora + ", nombreCliente=" + nombreCliente + ", saldo="
				+ saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
	
	
	
	
	
}
