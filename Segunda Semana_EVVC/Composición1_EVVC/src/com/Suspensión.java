package com;

public class Suspensión {
	
	private String marca;
	private int recorrido;
	private double tipo;
	private String bloqueo;
	
	public Suspensión () {}

	public Suspensión(String marca, int recorrido, double tipo, String bloqueo) {
		super();
		this.marca = marca;
		this.recorrido = recorrido;
		this.tipo = tipo;
		this.bloqueo = bloqueo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getRecorrido() {
		return recorrido;
	}

	public void setRecorrido(int recorrido) {
		this.recorrido = recorrido;
	}

	public double getTipo() {
		return tipo;
	}

	public void setTipo(double tipo) {
		this.tipo = tipo;
	}

	public String getBloqueo() {
		return bloqueo;
	}

	public void setBloqueo(String bloqueo) {
		this.bloqueo = bloqueo;
	}

	@Override
	public String toString() {
		return "Suspensión [marca=" + marca + ", recorrido=" + recorrido + ", tipo=" + tipo + ", bloqueo=" + bloqueo
				+ "]";
	}
	
	

}
