package com;

public class Cuenta { //Vamos a crear un objeto cuenta 
	//Definimos los atributos que tiene un objeto cuanta
	
	private String nombre;
	private double saldo;
	private double nim;
	private double max;
	private String tipoCuenta;
	
	public Cuenta() {
		
	}

	public Cuenta(String nombre, double saldo, double nim, double max, String tipoCuenta) {
		this.nombre = nombre;
		this.saldo = saldo;
		this.nim = nim;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
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

	public double getNim() {
		return nim;
	}

	public void setNim(double nim) {
		this.nim = nim;
	}

	public double getMax() {
		return max;
	}

	public void setMax(double max) {
		this.max = max;
	}

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}
	
	

	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", nim=" + nim + ", max=" + max + ", tipoCuenta="
				+ tipoCuenta + "]";
	}
	
	

}
