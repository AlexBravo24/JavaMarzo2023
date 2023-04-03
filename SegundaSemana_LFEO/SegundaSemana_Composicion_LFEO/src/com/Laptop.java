package com;

public class Laptop {
	
	//Atributos
	
	private String marca;
	private String sistema;
	private double precio;
	private String color;
	
	//Con el modificador static podemos crear constantes de clase
	//pero que aun son alcanzables a modificar mediante sus getters y setters
	
	//con el modificador final creamos constantes con valores inmutables.
	//Puedo retornar su valor, pero no cambiarlo
	
	//Hablando de la capacidad, memoria, procesador
	//Un disco duro, una memoria ram y un procesador
	//tambien son objetos
	//En este ejemplo, la composicion se basa en que podemos tener objetos
	//que formen parte de un objeto mas grande
	
	
	//Tendriamos a un objeto como atributo de otro
	private RAM ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	public Laptop() {}

	public Laptop(String marca, String sistema, double precio, String color, RAM ram, Almacenamiento disco,
			Procesador cpu) {
		this.marca = marca;
		this.sistema = sistema;
		this.precio = precio;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
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
