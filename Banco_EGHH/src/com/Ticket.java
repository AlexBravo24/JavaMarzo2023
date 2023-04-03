package com;

import java.util.Date;

public class Ticket {
	/*Es un objeto que me va a brindar un status o una respuesta
	 *de las operaciones, si se realizan o no.
	 */
	
	//Atributos que tiene un ticket.
	
	private int folio;
	private Date fechaHora;
	private String nombreCliente;
	private double Saldo;
	private String sucursal;
	private int idCajero;
	
	public Ticket () {
		
	}

	public Ticket(int folio, Date fechaHora, String nombreCliente, double saldo, String sucursal, int idCajero) {
		//super();
		this.folio = folio;
		this.fechaHora = fechaHora;
		this.nombreCliente = nombreCliente;
		Saldo = saldo;
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
		return Saldo;
	}

	public void setSaldo(double saldo) {
		Saldo = saldo;
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
		return "Ticket [folio=" + folio + ", fechaHora=" + fechaHora + ", nombreCliente=" + nombreCliente + ", Saldo="
				+ Saldo + ", sucursal=" + sucursal + ", idCajero=" + idCajero + "]";
	}
	
	
}
