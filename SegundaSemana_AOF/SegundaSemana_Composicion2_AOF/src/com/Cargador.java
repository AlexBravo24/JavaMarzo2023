package com;

public class Cargador {

	
	private String volts;
	private String resistencia;
	private String cantidad;
	public Cargador() {}
	public Cargador(String volts, String resistencia, String cantidad) {
		super();
		this.volts = volts;
		this.resistencia = resistencia;
		this.cantidad = cantidad;
	}
	public String getVolts() {
		return volts;
	}
	public void setVolts(String volts) {
		this.volts = volts;
	}
	public String getResistencia() {
		return resistencia;
	}
	public void setResistencia(String resistencia) {
		this.resistencia = resistencia;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return "Cargador [volts=" + volts + ", resistencia=" + resistencia + ", cantidad=" + cantidad + "]";
	}
	
	
}
