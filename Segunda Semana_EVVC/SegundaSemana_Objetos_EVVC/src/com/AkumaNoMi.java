package com;

public class AkumaNoMi {
	private String nombre;
	private String modelo;
	private String poder;
	private String usuario;
	
	
	public AkumaNoMi () {}


	public AkumaNoMi(String nombre, String modelo, String poder, String usuario) {
		super();
		this.nombre = nombre;
		this.modelo = modelo;
		this.poder = poder;
		this.usuario = usuario;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getPoder() {
		return poder;
	}


	public void setPoder(String poder) {
		this.poder = poder;
	}


	public String getUsuario() {
		return usuario;
	}


	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}


	@Override
	public String toString() {
		return "AkumaNoMi [nombre=" + nombre + ", modelo=" + modelo + ", poder=" + poder + ", usuario=" + usuario + "]";
	}

	


	
	

}
