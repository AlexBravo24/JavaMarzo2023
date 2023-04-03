package com;

public class Cient�fica extends Calculadora implements ITermometro {
	
	private String tipoCalculadora;
	
	public Cient�fica () {}
	
	

	public Cient�fica(String marca, String modelo, String precio, String energ�a, String tipoCalculadora) {
		super(marca, modelo, precio, energ�a);
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
		return "Cient�fica [tipoCalculadora=" + tipoCalculadora + ", toString()=" + super.toString() + "]";
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


	//La multiherencia se puede simular mediante el uso o implementaci�n de interfaces. Permitiendo
	// implementae m�todos en otra clase o enriquecerla con los mismos

	@Override
	public void tomarTemperatura() {
		System.out.println("Tomando tempreratura..... Normal: 35.6�C");
		
	}
	
	/*�C�mo obtienen comportamiento las clases o de d�nde obtienen comportamiento las clases?
	 * 1� De los m�todos propios
	 * 2� Clases abstractas - heredados
	 * 3� Desde las interfaces
	 */

	
	
	
	

	
}
