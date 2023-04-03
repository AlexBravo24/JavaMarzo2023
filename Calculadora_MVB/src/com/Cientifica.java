package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements Itermometro{
	
	private String modelo;
	private int memoria;
	private String funciones;
	
	public Cientifica() {}
	
	
	public Cientifica(String marca, String color, String tipo, String modelo, int memoria, String funciones) {
		super(marca, color, tipo);
		this.modelo = modelo;
		this.memoria = memoria;
		this.funciones = funciones;
	}

	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getMemoria() {
		return memoria;
	}


	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}


	public String getFunciones() {
		return funciones;
	}


	public void setFunciones(String funciones) {
		this.funciones = funciones;
	}

	

	public Cientifica(String marca, String color, String tipo) {
		super(marca, color, tipo);
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Cientifica [modelo=" + modelo + ", memoria=" + memoria + ", funciones=" + funciones + ", toString()="
				+ super.toString() + "]";
	}


	@Override
	public void sumar(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("La suma es "+(a+b));
	}
	@Override
	public void restar() {
		double a, b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el primer número:");
		a=entrada.nextDouble();
		System.out.println("Introduce el segundo número:");
		b=entrada.nextDouble();
		entrada.close();
		System.out.println("La resta es ="+(a-b));
		
	}
	@Override
	public void multiplicar(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("La multiplicación es "+(a*b));
	}
	@Override
	public void dividir(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("La división es "+(a/b));
	}


	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
	System.out.println("Tomando temperatura.... Normal 36.5°C");
	}

	//Cómo obtienen comportamiento las clases?
    //De dónde obtienen comportamiento las clases?
	
	/* 1.Métodos propios 
	 * 2.Clases abstractas-heredadas 
	 * 3.Interfaces
	 */
	

	
	
}
