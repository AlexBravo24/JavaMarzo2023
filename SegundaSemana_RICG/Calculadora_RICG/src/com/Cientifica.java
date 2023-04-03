package com;

public  class Cientifica extends Calculadora implements Itermometro{
	
	private String marca;
	
	public Cientifica() {
		
	}

	

	public Cientifica(String color, double costo, String tipo, String marca) {
		super(color, costo, tipo);
		this.marca = marca;
	}



	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Cientifica [marca=" + marca + ", toString()=" + super.toString() + "]";
	}

	@Override
	public void suma(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resta(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void multiplicacion(int a, int b) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("Tomando temperatura.... Normal 36.5°C");
	}


	


	
	}
	

	
	
	
	

