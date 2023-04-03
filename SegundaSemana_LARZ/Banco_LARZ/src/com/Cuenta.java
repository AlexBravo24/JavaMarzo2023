package com;

public class Cuenta { //Crear un objeto cuenta
	
	//Definir atributos de cuenta
	private String nombre;
	private double saldo;
	private double min;
	private double max;
	private String tipoCuenta;
	
	//Constructor vacio
	private Cuenta () {}
	
	//Constructor con todos sus parametros
	public Cuenta(String nombre, double saldo, double min, double max, String tipoCuenta) {
		
		this.nombre = nombre;
		this.saldo = saldo;
		this.min = min;
		this.max = max;
		this.tipoCuenta = tipoCuenta;
	}

	//Getters and Setters
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

	public String getTipoCuenta() {
		return tipoCuenta;
	}

	public void setTipoCuenta(String tipoCuenta) {
		this.tipoCuenta = tipoCuenta;
	}

	//toString
	@Override
	public String toString() {
		return "Cuenta [nombre=" + nombre + ", saldo=" + saldo + ", min=" + min + ", max=" + max + ", tipoCuenta="
				+ tipoCuenta + "]";
	}
	
	
	

}