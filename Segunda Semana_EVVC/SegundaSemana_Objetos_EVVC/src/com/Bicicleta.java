package com;

public class Bicicleta {
	
	private int númeroVelocidades;
	private int rodada;
	private String material;
	private String suspensión;
	private String frenos;
	
	public Bicicleta () {}

	public Bicicleta(int númeroVelocidades, int rodada, String material, String suspensión, String frenos) {
		super();
		this.númeroVelocidades = númeroVelocidades;
		this.rodada = rodada;
		this.material = material;
		this.suspensión = suspensión;
		this.frenos = frenos;
	}

	public int getNúmeroVelocidades() {
		return númeroVelocidades;
	}

	public void setNúmeroVelocidades(int númeroVelocidades) {
		this.númeroVelocidades = númeroVelocidades;
	}

	public int getRodada() {
		return rodada;
	}

	public void setRodada(int rodada) {
		this.rodada = rodada;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public String getSuspensión() {
		return suspensión;
	}

	public void setSuspensión(String suspensión) {
		this.suspensión = suspensión;
	}

	public String getFrenos() {
		return frenos;
	}

	public void setFrenos(String frenos) {
		this.frenos = frenos;
	}

	@Override
	public String toString() {
		return "Bicicleta [númeroVelocidades=" + númeroVelocidades + ", rodada=" + rodada + ", material=" + material
				+ ", suspensión=" + suspensión + ", frenos=" + frenos + "]";
	}

	
	
	
}
