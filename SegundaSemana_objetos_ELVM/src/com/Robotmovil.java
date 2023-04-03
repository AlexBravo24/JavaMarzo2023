package com;

public class Robotmovil {
	
	private String TarjetaProgramable;
	private String sensor;
	private int Nllantas;
	private String pila;
	private String MaterialChasis;
	private String tipoMotores;
	
	public Robotmovil() {}

	public Robotmovil(String tarjetaProgramable, String sensor, int nllantas, String pila, String materialChasis,
			String tipoMotores) {
		//super();
		
		TarjetaProgramable = tarjetaProgramable;
		this.sensor = sensor;
		Nllantas = nllantas;
		this.pila = pila;
		MaterialChasis = materialChasis;
		this.tipoMotores = tipoMotores;
	}

	public String getTarjetaProgramable() {
		return TarjetaProgramable;
	}

	public void setTarjetaProgramable(String tarjetaProgramable) {
		TarjetaProgramable = tarjetaProgramable;
	}

	public String getSensor() {
		return sensor;
	}

	public void setSensor(String sensor) {
		this.sensor = sensor;
	}

	public int getNllantas() {
		return Nllantas;
	}

	public void setNllantas(int nllantas) {
		Nllantas = nllantas;
	}

	public String getPila() {
		return pila;
	}

	public void setPila(String pila) {
		this.pila = pila;
	}

	public String getMaterialChasis() {
		return MaterialChasis;
	}

	public void setMaterialChasis(String materialChasis) {
		MaterialChasis = materialChasis;
	}

	public String getTipoMotores() {
		return tipoMotores;
	}

	public void setTipoMotores(String tipoMotores) {
		this.tipoMotores = tipoMotores;
	}

	@Override
	public String toString() {
		return "Robotmovil [TarjetaProgramable=" + TarjetaProgramable + ", sensor=" + sensor + ", Nllantas=" + Nllantas
				+ ", pila=" + pila + ", MaterialChasis=" + MaterialChasis + ", tipoMotores=" + tipoMotores + "]";
	};
	
	
	

}
