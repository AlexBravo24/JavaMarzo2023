package com;

public class Automovil {

	private String marca;
	private String modelo;
	private String color;
	private double puertas;
	
	
	private Estereo sonido ;
	private llantas  neumaticos;
	private  Asientos respaldos;
	
	
	//constructos vacio
	public Automovil () {}


	public Automovil(String marca, String modelo, String color, double puertas, Estereo sonido, llantas neumaticos,
			Asientos respaldos) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.puertas = puertas;
		this.sonido = sonido;
		this.neumaticos = neumaticos;
		this.respaldos = respaldos;
	}


	public String getMarca() {
		return marca;
	}
	//GETTER

	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getPuertas() {
		return puertas;
	}


	public void setPuertas(double puertas) {
		this.puertas = puertas;
	}


	public Estereo getSonido() {
		return sonido;
	}


	public void setSonido(Estereo sonido) {
		this.sonido = sonido;
	}


	public llantas getNeumaticos() {
		return neumaticos;
	}


	public void setNeumaticos(llantas neumaticos) {
		this.neumaticos = neumaticos;
	}


	public Asientos getRespaldos() {
		return respaldos;
	}


	public void setRespaldos(Asientos respaldos) {
		this.respaldos = respaldos;
	}


	@Override
	public String toString() {
		return "Automovil [marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", puertas=" + puertas
				+ ", sonido=" + sonido + ", neumaticos=" + neumaticos + ", respaldos=" + respaldos + "]";
	}


	
	
	
	
	
	
	
	
	
	
}//cierra
