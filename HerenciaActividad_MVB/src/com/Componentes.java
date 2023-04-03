package com;

public class Componentes extends ComidaGato {

	private String sabor;
	private String etapa; 
	private String envase;
	private double sodio;
	
	public Componentes () {}

	public Componentes(String marca, int precio, double contenido, String sabor, String etapa, String envase,
			double sodio) {
		super(marca, precio, contenido);
		this.sabor = sabor;
		this.etapa = etapa;
		this.envase = envase;
		this.sodio = sodio;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	public String getEnvase() {
		return envase;
	}

	public void setEnvase(String envase) {
		this.envase = envase;
	}

	public double getSodio() {
		return sodio;
	}

	public void setSodio(double sodio) {
		this.sodio = sodio;
	}

	@Override
	public String toString() {
		return "Componentes [sabor=" + sabor + ", etapa=" + etapa + ", envase=" + envase + ", sodio=" + sodio
				+ ", toString()=" + super.toString() + "]";
	}
	 
	
	
	
}
