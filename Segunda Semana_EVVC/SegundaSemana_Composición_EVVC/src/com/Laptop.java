package com;

public class Laptop {
	
	//Establecer sus atributos
	
	private String marca;
	private String sistema;
	private static final double precio = 20000.99;
	private String color;
	private String teclado;
	
	//Con static no permite fijar un valor de un objeto pero se puede cambiar en otras clases
	//y static final estableces el valor pero no puede cambiar
	
	/* Con el modificador static podemos crear constantes de clase pero que aún son alcanzables
	 * a modificar mediante sus getters & setters 
	 * Con el modificador final creamos constantes con valores inmutables. Puedo retornar su valor 
	 * pero no cambiarlo.
	 */
	
	
	//Hablando de la capacidad, memoria, procesador, también son objetos
	//En este ejemplo, la composición se basa en que podemos tener objetos que formen parte de un objeto mas
	//grande
	
	//Tendríamos a un objeto como atributo de otro objeto
	private RAM ram;
	private Almacenamiento disco;
	private Procesador cpu;
	
	
	public Laptop () {}


	



	public Laptop(String marca, String sistema, String color, String teclado, RAM ram, Almacenamiento disco,
			Procesador cpu) {
		super();
		this.marca = marca;
		this.sistema = sistema;
		this.color = color;
		this.teclado = teclado;
		this.ram = ram;
		this.disco = disco;
		this.cpu = cpu;
	}




	public String getTeclado() {
		return teclado;
	}


	public void setTeclado(String teclado) {
		this.teclado = teclado;
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
		return "Laptop [marca=" + marca + ", sistema=" + sistema + ", precio=" + precio + ", color=" + color + ", ram="
				+ ram + ", disco=" + disco + ", cpu=" + cpu + "]";
	}
	
	
	
	

}
