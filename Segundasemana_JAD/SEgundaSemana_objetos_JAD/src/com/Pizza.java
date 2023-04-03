package com;

public class Pizza {
	
	private String ingredientep;
	private String tamaño;
	private float precio;
	public Pizza(String ingredientep, String tamaño, float precio) {
		super();
		this.ingredientep = ingredientep;
		this.tamaño = tamaño;
		this.precio = precio;
	}
	public String getIngredientep() {
		return ingredientep;
	}
	public void setIngredientep(String ingredientep) {
		this.ingredientep = ingredientep;
	}
	public String getTamaño() {
		return tamaño;
	}
	public void setTamaño(String tamaño) {
		this.tamaño = tamaño;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Pizza [ingredientep=" + ingredientep + ", tamaño=" + tamaño + ", precio=" + precio + "]";
	}
	
	
	

}
