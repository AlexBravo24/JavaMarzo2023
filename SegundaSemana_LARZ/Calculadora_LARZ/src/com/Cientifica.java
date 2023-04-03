package com;

import java.util.Scanner;

public class Cientifica extends Calculadora implements ITermometro {
	
	public Cientifica () {}
	
	public Cientifica(String color, String marca, int año) {
		super(color, marca, año);
		
	}
	
	
	@Override
	public void suma(double a, double b) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dame el valor a: ");
		a = sc.nextDouble();
		System.out.println("Dame el valor b: ");
		b = sc.nextDouble();
		sc.close();
		System.out.println("La suma es: "+(a+b));
	}

	@Override
	public void resta(double a, double b) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dame el valor a: ");
		a = sc.nextDouble();
		System.out.println("Dame el valor b: ");
		b = sc.nextDouble();
		sc.close();
		System.out.println("La resta es: "+(a-b));
	}

	@Override
	public void division(double a, double b) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dame el valor a: ");
		a = sc.nextDouble();
		System.out.println("Dame el valor b: ");
		b = sc.nextDouble();
		sc.close();
		System.out.println("La divicion es: "+(a/b));
	}

	@Override
	public void multiplicacion(double a, double b) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Dame el valor a: ");
		a = sc.nextDouble();
		System.out.println("Dame el valor b: ");
		b = sc.nextDouble();
		sc.close();
		System.out.println("La multiplicacion es: "+(a*b));
		
	}

	@Override
	public String toString() {
		return "Cientifica " + super.toString() + "]";
	}

	@Override
	public void tomarTemperatura() {
		// TODO Auto-generated method stub
		System.out.println("Tomando temperatura...");
	}

	/*
	 * ¿Cómo obtienen comportamiento las clases?
	 * ¿De dónde obtienen comportamiento las clases?
	 */

	/*
	 * 1.-De sus propios metodos
	 * 2.-clases abstractas (heredados)
	 * 3.-Interfases
	 */
	
		
}
