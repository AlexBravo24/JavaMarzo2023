package com;

public class Bicicleta {
	
	private int n�meroVelocidades;
	private int rodada;
	private String material;
	private String suspensi�n;
	private String frenos;
	
	public Bicicleta () {}

	public Bicicleta(int n�meroVelocidades, int rodada, String material, String suspensi�n, String frenos) {
		super();
		this.n�meroVelocidades = n�meroVelocidades;
		this.rodada = rodada;
		this.material = material;
		this.suspensi�n = suspensi�n;
		this.frenos = frenos;
	}

	public int getN�meroVelocidades() {
		return n�meroVelocidades;
	}

	public void setN�meroVelocidades(int n�meroVelocidades) {
		this.n�meroVelocidades = n�meroVelocidades;
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

	public String getSuspensi�n() {
		return suspensi�n;
	}

	public void setSuspensi�n(String suspensi�n) {
		this.suspensi�n = suspensi�n;
	}

	public String getFrenos() {
		return frenos;
	}

	public void setFrenos(String frenos) {
		this.frenos = frenos;
	}

	@Override
	public String toString() {
		return "Bicicleta [n�meroVelocidades=" + n�meroVelocidades + ", rodada=" + rodada + ", material=" + material
				+ ", suspensi�n=" + suspensi�n + ", frenos=" + frenos + "]";
	}

	
	
	
}
