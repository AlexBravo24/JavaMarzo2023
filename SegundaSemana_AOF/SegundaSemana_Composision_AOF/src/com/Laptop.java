package com;

public class Laptop {
	//Atributos
	
	private String marca;
	private String sistema;
	private static double precio=20000.99; //con el modificador 
	private String color;
	
	//Hablando de la capacidad, memoria, procesador
	//disco duro, una memoria RAM y un procesador
	//tambien son objetos;
	
	//en este ejemplp, la composision se basa en que podemos tener objetos
	//que formanparte de unobjeto mas grande
	
	
	//Tendriamos a un objeto como atributo de otro
	
	private RAM ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	
	//constructor vacio
	public Laptop() {}
	//constructor con todos losparametros


	public Laptop(String marca, String sistema, double precio, String color, RAM ram, Almacenamiento disco,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.sistema = sistema;
		Laptop.precio = precio;
		this.color = color;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
	}

	//getter setter
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


	public static void setPrecio(double precio) {
		Laptop.precio = precio;
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

//toString
	@Override
	public String toString() {
		return "Laptop [marca=" + marca + ", sistema=" + sistema + ", precio=" + precio + ", color=" + color + ", ram="
				+ ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}
	
	

	
	
	

}
