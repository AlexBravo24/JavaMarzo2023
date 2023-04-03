package com;

import java.util.Date;

public class Ticket {//es un objeto que me va a abrindar
	//un status o respuesta de las operaciones, si se realizan o no.
	
	// atributos que tiene un ticket
	
	private int folio;
	private Date fechahora;
	private double saldo;
	private String nombrecliente;
	private String sucursal;
	private int idcajero;
	
	public Ticket() {}

	public Ticket(int folio, Date fechahora, double saldo, String nombrecliente, String sucursal, int idcajero) {
		this.folio = folio;
		this.fechahora = fechahora;
		this.saldo = saldo;
		this.nombrecliente = nombrecliente;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombrecliente() {
		return nombrecliente;
	}

	public void setNombrecliente(String nombrecliente) {
		this.nombrecliente = nombrecliente;
	}

	public String getSucursal() {
		return sucursal;
	}

	public void setSucursal(String sucursal) {
		this.sucursal = sucursal;
	}

	public int getIdcajero() {
		return idcajero;
	}

	public void setIdcajero(int idcajero) {
		this.idcajero = idcajero;
	}

	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechahora=" + fechahora + ", saldo=" + saldo + ", nombrecliente="
				+ nombrecliente + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}
	
	
	

}
