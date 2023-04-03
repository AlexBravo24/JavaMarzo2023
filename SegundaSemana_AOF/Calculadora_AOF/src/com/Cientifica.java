package com;

import java.util.Scanner;

public class Cientifica extends Calculadora {

	
	//Elijo los de la super clase solo el que tiene todos los parametros
	
	


	public Cientifica() {
		//super();
		// TODO Auto-generated constructor stub
	}

	public Cientifica(String modelo, String color) {
		super(modelo, color);
		// TODO Auto-generated constructor stub
	}

	
	
	@Override
	public void suma() {
		// TODO Auto-generated method stub
		int num1, num2;
	
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa primer numero");
		num1=entrada.nextInt();
		
		System.out.println("Ingresa segundo numero");
		num2=entrada.nextInt();
		entrada.close();
		System.out.println("la suma es igual a  "+(num1+num2));
	
		
	} 
	
	
	
	@Override
	public void resta() {
		
		int num1,num2;
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa primer numero");
		num1=entrada.nextInt();
		
		System.out.println("Ingresa segundo numero");
		num2=entrada.nextInt();
		entrada.close();
		System.out.println("la resta es igual a  "+(num1-num2));
		
	}

	@Override
	public void multiplicacion() {
		// TODO Auto-generated method stub
		
		
		int num1,num2;

		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingresa primer numero");
		num1=entrada.nextInt();
		
		System.out.println("Ingresa segundo numero");
		num2=entrada.nextInt();
		entrada.close();
		System.out.println("la multiplicación es igual a  "+(num1*num2));
	}

	@Override
	public void dividir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "Cientifica [toString()=" + super.toString() + "]";
	}

	
	
	
	
}
