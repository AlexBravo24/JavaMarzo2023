package com;

public class Elementos {
	private String camara;
	private String sonido;
	
	public Elementos() {
		
	}

	public Elementos(String camara, String sonido) {
		
		this.camara = camara;
		this.sonido = sonido;
	}

	public String getCamara() {
		return camara;
	}

	public void setCamara(String camara) {
		this.camara = camara;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}

	@Override
	public String toString() {
		return "Elementos [camara=" + camara + ", sonido=" + sonido + "]";
	}
	

}
