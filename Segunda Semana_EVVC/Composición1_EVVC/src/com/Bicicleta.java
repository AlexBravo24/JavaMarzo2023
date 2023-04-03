package com;

public class Bicicleta {
	
	private String marca;
	private int rodada;
	private String material;
	private String color;

	private Velocidades velocidades;
	private Suspensi�n suspensi�n;
	private Frenos frenos;
	
	public Bicicleta () {}

	public Bicicleta(String marca, int rodada, String material, String color, Velocidades velocidades,
			Suspensi�n suspensi�n, Frenos frenos) {
		super();
		this.marca = marca;
		this.rodada = rodada;
		this.material = material;
		this.color = color;
		this.velocidades = velocidades;
		this.suspensi�n = suspensi�n;
		this.frenos = frenos;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Velocidades getVelocidades() {
		return velocidades;
	}

	public void setVelocidades(Velocidades velocidades) {
		this.velocidades = velocidades;
	}

	public Suspensi�n getSuspensi�n() {
		return suspensi�n;
	}

	public void setSuspensi�n(Suspensi�n suspensi�n) {
		this.suspensi�n = suspensi�n;
	}

	public Frenos getFrenos() {
		return frenos;
	}

	public void setFrenos(Frenos frenos) {
		this.frenos = frenos;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", rodada=" + rodada + ", material=" + material + ", color=" + color
				+ ", velocidades=" + velocidades + ", suspensi�n=" + suspensi�n + ", frenos=" + frenos + "]";
	}
	
}
