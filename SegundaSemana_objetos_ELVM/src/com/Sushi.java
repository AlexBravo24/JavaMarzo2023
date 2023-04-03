package com;

public class Sushi {
	private String TDpez;
	private String Tqueso;
	private int Nrollos;
	private String Envolvente;
	
	public Sushi() {}

	public Sushi(String tDpez, String tqueso, int nrollos, String envolvente) {
		//super();
		TDpez = tDpez;
		Tqueso = tqueso;
		Nrollos = nrollos;
		Envolvente = envolvente;
	}

	public String getTDpez() {
		return TDpez;
	}

	public void setTDpez(String tDpez) {
		TDpez = tDpez;
	}

	public String getTqueso() {
		return Tqueso;
	}

	public void setTqueso(String tqueso) {
		Tqueso = tqueso;
	}

	public int getNrollos() {
		return Nrollos;
	}

	public void setNrollos(int nrollos) {
		Nrollos = nrollos;
	}

	public String getEnvolvente() {
		return Envolvente;
	}

	public void setEnvolvente(String envolvente) {
		Envolvente = envolvente;
	}

	@Override
	public String toString() {
		return "Sushi [TDpez=" + TDpez + ", Tqueso=" + Tqueso + ", Nrollos=" + Nrollos + ", Envolvente=" + Envolvente
				+ "]";
	}
	

}
