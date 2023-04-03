package com;

public class Laptop {
	
	//Atributos
	private String marca;
	private String sistema;
	private static final double precio=30000.99;
	private String color;
	private String teclado;
	
	//Con el modificaodr static podemos crear constantes de clases pero aun son
	//alcanzables a modificar mediante sus getters y setters.
	
	//Con el modificador final creamos constantes con valores 
	
	
	
	
	//Hablando de la capacidad, memoria, procedador. Un disco duro, una 
	//memoria ram y un procesador tambien son objetos
	//En este ejemplo, la composicion se basa en que podemos tener objetos 
	//que formen parte de un objeto más grande 
	
	//Tendriamos a un objeto como atributo de otro objeto
	private RAM ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	public Laptop() {
		
	}

	
	public Laptop(String marca, String sistema, String color, String teclado, RAM ram, Almacenamiento disco,
			Procesador cpu) {
		
		this.marca = marca;
		this.sistema = sistema;
		this.color = color;
		this.teclado = teclado;
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


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public String getTeclado() {
		return teclado;
	}


	public void setTeclado(String teclado) {
		this.teclado = teclado;
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


	public static double getPrecio() {
		return precio;
	}


	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", sistema=" + sistema + ", color=" + color + ", teclado=" + teclado
				+ ", ram=" + ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}


	

	

}
