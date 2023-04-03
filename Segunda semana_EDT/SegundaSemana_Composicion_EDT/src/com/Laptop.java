package com;

public class Laptop {
			
	
	private String color;
	private String marca;
	private int price;
	private Ram ram;
	private Procesador procesador;
	private Almacenamiento almacenamiento;
	
	public Laptop() {
		
	}

	public Laptop(String color, String marca, int price, Ram ram, Procesador procesador,
			Almacenamiento almacenamiento) {
		super();
		this.color = color;
		this.marca = marca;
		this.price = price;
		this.ram = ram;
		this.procesador = procesador;
		this.almacenamiento = almacenamiento;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Ram getRam() {
		return ram;
	}

	public void setRam(Ram ram) {
		this.ram = ram;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public Almacenamiento getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(Almacenamiento almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "Laptop [color=" + color + ", marca=" + marca + ", price=" + price + ", ram=" + ram + ", procesador="
				+ procesador + ", almacenamiento=" + almacenamiento + "]";
	}

	
	
	
}
