package com;

public class Cuenta {  //CREAR UN OBJETO CUENTA, DEFINIMOS LOS ATRIBUTOS QUE TIENE UN OBJETO CUENTA O UNA CUENTA DE BANCO
	
	private String nombre;
	private double saldo;
	private double min;
	private double max;
	private String tipocuenta;
	
	public Cuenta() {}

	public Cuenta(String nombre, double saldo, double min, double max, String tipocuenta) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipocuenta = tipocuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getMin() {
		return min;
	}

	public void setMin(double min) {
		this.min = min;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String getTipocuenta() {
		return tipocuenta;
	}

	public void setTipocuenta(String tipocuenta) {
		this.tipocuenta = tipocuenta;
	}

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipocuenta="
				+ tipocuenta + "]";
	}
	
	
	
	
	
	

}
