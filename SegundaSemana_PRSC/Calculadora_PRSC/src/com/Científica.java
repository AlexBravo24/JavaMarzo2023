package com;

import java.util.Scanner;

public class Cient�fica extends Calculadora {

	
	
	
	public Cient�fica() {
		// TODO Auto-generated constructor stub
	}

	public Cient�fica(String marca, String modelo, String color) {
		super(marca, modelo, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Sumar() {
		int a,b;
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		b=entrada.nextInt();
		System.out.println("La suma es = " +(a+b));
		
	}

	@Override
	public void Restar() {
		int a,b;
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		b=entrada.nextInt();
		System.out.println("La resta es = " +(a-b));
		
	}

	@Override
	public void Multiplicar() {
		int a, b;
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		b=entrada.nextInt();
		System.out.println("La multiplicaci�n es = " +(a*b));
	}

	@Override
	public void Dividir() {
	int a, b; 
		// TODO Auto-generated method stub
		Scanner entrada= new Scanner(System.in);
		System.out.println("Introduce el primer n�mero:");
		a=entrada.nextInt();
		System.out.println("Introduce el segundo n�mero:");
		b=entrada.nextInt();
		System.out.println("La divisi�n es = " +(a/b));
		
	}
	
	public void tomarTemperatura() {
		System.out.println("tomando temperatura...");
	}

	//�C�mo obtienen comportamiento las clases?
	//�De d�nde obtienen comportamiento las clases?
	/* 1. M�todos propios
	 * 2. Clases abstractas - heredados
	 * 3. Interfaces
	 */
	
	
	
}
