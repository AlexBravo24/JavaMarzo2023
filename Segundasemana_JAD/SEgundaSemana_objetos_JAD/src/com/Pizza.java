package com;

public class Pizza {
	
	private String ingredientep;
	private String tama�o;
	private float precio;
	public Pizza(String ingredientep, String tama�o, float precio) {
		super();
		this.ingredientep = ingredientep;
		this.tama�o = tama�o;
		this.precio = precio;
	}
	public String getIngredientep() {
		return ingredientep;
	}
	public void setIngredientep(String ingredientep) {
		this.ingredientep = ingredientep;
	}
	public String getTama�o() {
		return tama�o;
	}
	public void setTama�o(String tama�o) {
		this.tama�o = tama�o;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Pizza [ingredientep=" + ingredientep + ", tama�o=" + tama�o + ", precio=" + precio + "]";
	}
	
	
	

}
