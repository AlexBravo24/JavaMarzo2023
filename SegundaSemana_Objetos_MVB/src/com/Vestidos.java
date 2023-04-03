package com;

public class Vestidos {

	private String color;
	private int codigo;
	private double precio;
	private String material;
	private String talla;
	
	public Vestidos () {}    //Constructor vacío

	                         //Getters & Setters
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getTalla() {
		return talla;
	}

	public void setTalla(String talla) {
		this.talla = talla;
	}

	
	public Vestidos(String color, int codigo, double precio, String material, String talla) {
		super();
		this.color = color;
		this.codigo = codigo;
		this.precio = precio;
		this.material = material;
		this.talla = talla;
	}

	//toString
	
	
	@Override
	public String toString() {
		return "Vestidos [color=" + color + ", codigo=" + codigo + ", precio=" + precio + ", material=" + material
				+ ", talla=" + talla + "]";
	}
	


	
	
	
	
	
}
