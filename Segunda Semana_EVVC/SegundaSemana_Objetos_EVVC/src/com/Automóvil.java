package com;

public class Automóvil {
	
	private String combuestibleUsado;
	private String tracción;
	private int númeroPasajeros;
	private String calidad;
	
	public Automóvil () {}

	public Automóvil(String combuestibleUsado, String tracción, int númeroPasajeros, String calidad) {
		super();
		this.combuestibleUsado = combuestibleUsado;
		this.tracción = tracción;
		this.númeroPasajeros = númeroPasajeros;
		this.calidad = calidad;
	}

	public String getCombuestibleUsado() {
		return combuestibleUsado;
	}

	public void setCombuestibleUsado(String combuestibleUsado) {
		this.combuestibleUsado = combuestibleUsado;
	}

	public String getTracción() {
		return tracción;
	}

	public void setTracción(String tracción) {
		this.tracción = tracción;
	}

	public int getNúmeroPasajeros() {
		return númeroPasajeros;
	}

	public void setNúmeroPasajeros(int númeroPasajeros) {
		this.númeroPasajeros = númeroPasajeros;
	}

	public String getCalidad() {
		return calidad;
	}

	public void setCalidad(String calidad) {
		this.calidad = calidad;
	}

	@Override
	public String toString() {
		return "Automóvil [combuestibleUsado=" + combuestibleUsado + ", tracción=" + tracción + ", númeroPasajeros="
				+ númeroPasajeros + ", calidad=" + calidad + "]";
	}
	
	

}
