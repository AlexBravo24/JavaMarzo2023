package com;

public class Cientifica extends Calculadora {
	
	

	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String color) {
		super(marca, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void suma(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LA SUMA ES:" + (a+b));
		
	}

	@Override
	public void resta(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LA RESTA ES:" + (a-b));
	}

	@Override
	public void multiplicacion(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LA MULTIPLICACION ES: "+ (a*b));
		
	}

	@Override
	public void division(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("LA DIVISION ES: "+(a/b));
	}

	@Override
	public String toString() {
		return "Cientifica [toString()=" + super.toString() + "]";
	}
	
    //COMO OBTIENEN COMPORTAMIENTOS LAS CLASES?
	//DE DONDE OBTIENEN COMPORTAMIENTO LAS CLASES?
	
	/*1. METODOS PROPIOS
	 *2. CLASES ABSTRACTAS
	 *3. INTERFACES
	 * */
	
	

	

}
