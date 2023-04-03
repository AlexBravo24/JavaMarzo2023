package com;

public class Blusas {
	
	private String escote;
	private String material;
	private int talla;
	
	public Blusas () {}

	public Blusas(String escote, String material, int talla) {
		super();
		this.escote = escote;
		this.material = material;
		this.talla = talla;
	}

	public String getEscote() {
		return escote;
	}

	public void setEscote(String escote) {
		this.escote = escote;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTalla() {
		return talla;
	}

	public void setTalla(int talla) {
		this.talla = talla;
	}

	@Override
	public String toString() {
		return "Blusas [escote=" + escote + ", material=" + material + ", talla=" + talla + "]";
	}


	
	

}
