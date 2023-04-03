package com;

public class Torta {
	
	private String nombre;
	private String tipoPan;
	private String IngredienteP;
	
	public Torta () {}

	public Torta(String nombre, String tipoPan, String ingredienteP) {
		super();
		this.nombre = nombre;
		this.tipoPan = tipoPan;
		IngredienteP = ingredienteP;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipoPan() {
		return tipoPan;
	}

	public void setTipoPan(String tipoPan) {
		this.tipoPan = tipoPan;
	}

	public String getIngredienteP() {
		return IngredienteP;
	}

	public void setIngredienteP(String ingredienteP) {
		IngredienteP = ingredienteP;
	}

	@Override
	public String toString() {
		return "Torta [nombre=" + nombre + ", tipoPan=" + tipoPan + ", IngredienteP=" + IngredienteP + "]";
	}

	
}
