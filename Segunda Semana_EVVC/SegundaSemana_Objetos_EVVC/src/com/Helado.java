package com;

public class Helado {

	private String sabor;
	private String toping; 
	private String tipoCono;
	private int cantidadBolas;
	
	
	//Constructor vacío
	public Helado () {}


	//Constructor con todos los parámetros
	public Helado(String sabor, String toping, String tipoCono, int cantidadBolas) {
		super();
		this.sabor = sabor;
		this.toping = toping;
		this.tipoCono = tipoCono;
		this.cantidadBolas = cantidadBolas;
	}


	//Getters y Setters
	public String getSabor() {
		return sabor;
	}


	public void setSabor(String sabor) {
		this.sabor = sabor;
	}


	public String getToping() {
		return toping;
	}


	public void setToping(String toping) {
		this.toping = toping;
	}


	public String getTipoCono() {
		return tipoCono;
	}


	public void setTipoCono(String tipoCono) {
		this.tipoCono = tipoCono;
	}


	public int getCantidadBolas() {
		return cantidadBolas;
	}


	public void setCantidadBolas(int cantidadBolas) {
		this.cantidadBolas = cantidadBolas;
	}


	//Método toString
	@Override
	public String toString() {
		return "Helado [sabor=" + sabor + ", toping=" + toping + ", tipoCono=" + tipoCono + ", cantidadBolas="
				+ cantidadBolas + "]";
	}
	
	
	
	
	
}
