package com;

public class Científica extends Calculadora implements ITermometro {
	
	private String tipoCalculadora;
	
	public Científica () {}
	
	

	public Científica(String marca, String modelo, String precio, String energía, String tipoCalculadora) {
		super(marca, modelo, precio, energía);
		this.tipoCalculadora = tipoCalculadora;
		
		
		
	}



	public String getTipoCalculadora() {
		return tipoCalculadora;
	}



	public void setTipoCalculadora(String tipoCalculadora) {
		this.tipoCalculadora = tipoCalculadora;
	}
	
	



	@Override
	public String toString() {
		return "Científica [tipoCalculadora=" + tipoCalculadora + ", toString()=" + super.toString() + "]";
	}



	@Override
	public void sumar(int i, int j) {
		
		
		System.out.println("Sumando: "+i +"+"+ j+"="+ (i+j) );
		
	}

	@Override
	public void restar(int i, int j) {
		System.out.println("Restando:" +i +"-"+ j+"="+ (i-j));
		
	}

	@Override
	public void multiplicar(int i, int j) {
		System.out.println("Multiplicando:" +i +"x"+ j+"="+ (i*j));
		
	}

	@Override
	public void dividir(int i, int j) {
		System.out.println("Dividiendo:" +i +"/"+ j+"="+ (i/j));
		
	}


	//La multiherencia se puede simular mediante el uso o implementación de interfaces. Permitiendo
	// implementae métodos en otra clase o enriquecerla con los mismos

	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando tempreratura..... Normal: 35.6°C");
		
	}
	
	/*¿Cómo obtienen comportamiento las clases o de dónde obtienen comportamiento las clases?
	 * 1° De los métodos propios
	 * 2° Clases abstractas - heredados
	 * 3° Desde las interfaces
	 */

	
	
	
	

	
}
