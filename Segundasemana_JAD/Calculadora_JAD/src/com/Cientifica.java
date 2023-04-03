package com;

import java.util.Scanner;

public  class Cientifica extends Calculadora {
	
	

	public Cientifica() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String marca, String color, String modelo) {
		super(marca, color, modelo);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public String toString() {
		return "Cientifica [toString()=" + super.toString() + "]";
	}

	@Override
	public void suma() {
		double a,b,suma;
	System.out.println("introduzca el primer número");
	Scanner entrada = new Scanner (System.in);
	a=entrada.nextFloat();
	System.out.println("introduzca el segundo número");
	b=entrada.nextFloat();
	suma=a+b;
	System.out.println("el resultado de la suma es: "+suma);
	}

	@Override
	public void resta() {
		double a,b,resta;
		System.out.println("introduzca el primer número");
		Scanner entrada = new Scanner (System.in);
		a=entrada.nextFloat();
		System.out.println("introduzca el segundo número");
		b=entrada.nextFloat();
		resta=a-b;
		System.out.println("el resultado de la resta es: "+resta);
		
	}

	@Override
	public void multiplicacion() {
		double a,b,mult;
		System.out.println("introduzca el primer número");
		Scanner entrada = new Scanner (System.in);
		a=entrada.nextFloat();
		System.out.println("introduzca el segundo número");
		b=entrada.nextFloat();
		mult=a*b;
		System.out.println("el resultado de la multiplicación es: "+mult);
		
	}

	@Override
	public void division() {
		double a,b,div;
		System.out.println("introduzca el primer número");
		Scanner entrada = new Scanner (System.in);
		a=entrada.nextFloat();
		System.out.println("introduzca el segundo número");
		b=entrada.nextFloat();
		div=a/b;
		System.out.println("el resultado de la división es: "+div);
		
	}
	

	
	

}
