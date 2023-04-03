package com;

public class Tel�fono {

	private String Marca;
	private double Tama�o;
	private String Operador;
	private double Bater�a;
	
	private C�mara C�mara;
	private Hardware Hardware;
	private Caracter�sticas Caracter�sticas;
	
	public Tel�fono () {}

	public Tel�fono(String marca, double tama�o, String operador, double bater�a, com.C�mara c�mara,
			com.Hardware hardware, com.Caracter�sticas caracter�sticas) {
		Marca = marca;
		Tama�o = tama�o;
		Operador = operador;
		Bater�a = bater�a;
		C�mara = c�mara;
		Hardware = hardware;
		Caracter�sticas = caracter�sticas;
	}

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public double getTama�o() {
		return Tama�o;
	}

	public void setTama�o(double tama�o) {
		Tama�o = tama�o;
	}

	public String getOperador() {
		return Operador;
	}

	public void setOperador(String operador) {
		Operador = operador;
	}

	public double getBater�a() {
		return Bater�a;
	}

	public void setBater�a(double bater�a) {
		Bater�a = bater�a;
	}

	public C�mara getC�mara() {
		return C�mara;
	}

	public void setC�mara(C�mara c�mara) {
		C�mara = c�mara;
	}

	public Hardware getHardware() {
		return Hardware;
	}

	public void setHardware(Hardware hardware) {
		Hardware = hardware;
	}

	public Caracter�sticas getCaracter�sticas() {
		return Caracter�sticas;
	}

	public void setCaracter�sticas(Caracter�sticas caracter�sticas) {
		Caracter�sticas = caracter�sticas;
	}

	@Override
	public String toString() {
		return "Tel�fono [Marca=" + Marca + ", Tama�o=" + Tama�o + ", Operador=" + Operador + ", Bater�a=" + Bater�a
				+ ", C�mara=" + C�mara + ", Hardware=" + Hardware + ", Caracter�sticas=" + Caracter�sticas + "]";
	}
	
	
	
}
