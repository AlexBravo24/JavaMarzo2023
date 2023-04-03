package com;

public class Laptop {
	//atributos
	private String marca;
	private String sistema;
	private static final double precio=3000.99;//private static double precio=9999.99
	private String color;
	//Con el modificador static podemos crear constantes de clase
	//pero que aun son alcanzables a modificar
	//mediante sus getterts y setters
	
	//con el modificador -final- creamos constantes con valores
	//inmutables. puedo retornar su valor, pero no cambiarlo.
	
	
	//hablando de la capacidad,memoria,procesador,un disco duro, una memoria ram y procesador
	//estos tambien son objetos
	/*
	 * en este ejemplo,la composicion se base en que podemos tener objetos que formen
	 * párte de un objeto mas grande
	 * 
	 */
	
	//tenriamos a un objeto de otro 
	private RAM ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	public Laptop() {}



	public Laptop(String marca, String sistema, String color, RAM ram, Almacenamiento disco, Procesador cpu) {
		super();
		this.marca = marca;
		this.sistema = sistema;
		this.color = color;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getSistema() {
		return sistema;
	}

	public void setSistema(String sistema) {
		this.sistema = sistema;
	}

	



	public static double getPrecio() {
		return precio;
	}



	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public RAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}

	public Almacenamiento getDisco() {
		return disco;
	}

	public void setDisco(Almacenamiento disco) {
		this.disco = disco;
	}

	public Procesador getCpu() {
		return cpu;
	}

	public void setCpu(Procesador cpu) {
		this.cpu = cpu;
	}

	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", sistema=" + sistema + ", precio=" + precio + ", color=" + color + ", ram="
				+ ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}
	
	

}
