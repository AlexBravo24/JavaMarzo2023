package com;

import java.util.Scanner;

public class Científica extends Calculadora {

	
	
	
	public Científica() {
		// TODO Auto-generated constructor stub
	}

	public Científica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sumar() {
		int a,b;
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		b=entrada.nextInt();
		System.out.println("La suma es = " +(a+b));
		
	}

	@Override
	public void Restar() {
		int a,b;
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		b=entrada.nextInt();
		System.out.println("La resta es = " +(a-b));
		
	}

	@Override
	public void Multiplicar() {
		int a, b;
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		b=entrada.nextInt();
		System.out.println("La multiplicación es = " +(a*b));
	}

	@Override
	public void Dividir() {
	int a, b; 
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer número:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo número:");
		b=entrada.nextInt();
		System.out.println("La división es = " +(a/b));
		
	}
	
	public void tomarTemperatura() {
		System.out.println("tomando temperatura...");
	}

	//¿Cómo obtienen comportamiento las clases?
	//¿De dónde obtienen comportamiento las clases?
	/* 1. Métodos propios
	 * 2. Clases abstractas - heredados
	 * 3. Interfaces
	 */
	
	
	
}
