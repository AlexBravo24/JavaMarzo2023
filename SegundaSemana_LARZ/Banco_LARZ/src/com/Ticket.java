package com;

import java.util.Date;

public class Ticket { //Objeto que me brinda un status o resouesta
	//de las operaciones que se realizan o no
	
	//Atributos del ticket
	
	private int folio;
	private Date fechaHora;
	private double saldo;
	private String nombrecliente;
	private String sucursal;
	private int idcajero;
	
	//Constructor vacio
	private Ticket () {}

	//Todos sus parametros
	public Ticket(int folio, Date fechaHora, double saldo, String nombrecliente, String sucursal, int idcajero) {
		
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.saldo = saldo;
		this.nombrecliente = nombrecliente;
		this.sucursal = sucursal;
		this.idcajero = idcajero;
	}

	//Getters and Setters
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

	//toString
	@Override
	public String toString() {
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", saldo=" + saldo + ", nombrecliente="
				+ nombrecliente + ", sucursal=" + sucursal + ", idcajero=" + idcajero + "]";
	}
	
	

}
