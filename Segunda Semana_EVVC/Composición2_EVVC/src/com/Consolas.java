package com;

public class Consolas {
	
	private String marca;
	private String color;
	private double peso;
	private String medidas;
	
	private Procesador cpu;
	private Gráficos gpu;
	private Almacenamiento almacenamiento; 
	
	public Consolas () {}

	public Consolas(String marca, String color, double peso, String medidas, Procesador cpu, Gráficos gpu,
			Almacenamiento almacenamiento) {
		super();
		this.marca = marca;
		this.color = color;
		this.peso = peso;
		this.medidas = medidas;
		this.cpu = cpu;
		this.gpu = gpu;
		this.almacenamiento = almacenamiento;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getMedidas() {
		return medidas;
	}

	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	public Gráficos getGpu() {
		return gpu;
	}

	public void setGpu(Gráficos gpu) {
		this.gpu = gpu;
	}

	public Almacenamiento getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Almacenamiento almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "Consolas [marca=" + marca + ", color=" + color + ", peso=" + peso + ", medidas=" + medidas + ", cpu="
				+ cpu + ", gpu=" + gpu + ", almacenamiento=" + almacenamiento + "]";
	}
	
	
	
	

	
	

}
