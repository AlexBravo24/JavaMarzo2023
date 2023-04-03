package com;

public class Compu1 {//plantilla
	
	private String TarjetaGrafica;
	private int MemoriaRam;
	private String TarjetaMadre;
	private String Procesador;
	
	/*
	 * usare los metodos contructores
	 */

	public Compu1() {}//este constructor vacio base se usa poniendo public y el nombre del programa en el cual estamos en este caso Compu1
	//ahora usare el metodo contructor con todos sus parametros click derecho source despues general constuctor using ...

	public Compu1(String tarjetaGrafica, int memoriaRam, String tarjetaMadre, String procesador) {
		//super();
		TarjetaGrafica = tarjetaGrafica;
		MemoriaRam = memoriaRam;
		TarjetaMadre = tarjetaMadre;
		Procesador = procesador;
	}

	public String getTarjetaGrafica() {
		return TarjetaGrafica;
	}

	public void setTarjetaGrafica(String tarjetaGrafica) {
		TarjetaGrafica = tarjetaGrafica;
	}

	public int getMemoriaRam() {
		return MemoriaRam;
	}

	public void setMemoriaRam(int memoriaRam) {
		MemoriaRam = memoriaRam;
	}

	public String getTarjetaMadre() {
		return TarjetaMadre;
	}

	public void setTarjetaMadre(String tarjetaMadre) {
		TarjetaMadre = tarjetaMadre;
	}

	public String getProcesador() {
		return Procesador;
	}

	public void setProcesador(String procesador) {
		Procesador = procesador;
	}

	/*metodo toString
	 * nos permite mostrar los atributos del objeto
	 * en una salida de datos en consola
	 * actuando como una "radiografia" de nuestro objeto
	 * |
	 * |
	   v
	 */
	
	
	@Override
	public String toString() {
		return "Compu1 [TarjetaGrafica=" + TarjetaGrafica + ", MemoriaRam=" + MemoriaRam + ", TarjetaMadre="
				+ TarjetaMadre + ", Procesador=" + Procesador + "]";
	}

	

	
	
	
	
}
