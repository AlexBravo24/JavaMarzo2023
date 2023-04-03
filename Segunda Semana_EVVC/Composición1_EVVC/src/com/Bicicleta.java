package com;

public class Bicicleta {
	
	private String marca;
	private int rodada;
	private String material;
	private String color;

	private Velocidades velocidades;
	private Suspensión suspensión;
	private Frenos frenos;
	
	public Bicicleta () {}

	public Bicicleta(String marca, int rodada, String material, String color, Velocidades velocidades,
			Suspensión suspensión, Frenos frenos) {
		super();
		this.marca = marca;
		this.rodada = rodada;
		this.material = material;
		this.color = color;
		this.velocidades = velocidades;
		this.suspensión = suspensión;
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

	public Suspensión getSuspensión() {
		return suspensión;
	}

	public void setSuspensión(Suspensión suspensión) {
		this.suspensión = suspensión;
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
				+ ", velocidades=" + velocidades + ", suspensión=" + suspensión + ", frenos=" + frenos + "]";
	}
	
}
