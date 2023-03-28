package com;

public class Claseuno {
	
	public static void main(String args[]){
		
		System.out.println("HOLA MUNDO");
//OPERACION SIMPLE//////////////////////////////////////////////////
		
int a=5;

int b;

b=7;

int c=b+a;
//"++" quiere decir incremento en 1, como +6 seria incremento en 6//
c++;
System.out.println(c);

//concatenar valores///////////////////////////////////////////////////////////////////////////////

double pulgadas=2.54;
double cm=6;

double resultado=cm/pulgadas;
System.out.println("En "+cm+"cm hay"+resultado+ "pulgadas");

//Raiz cuadrada con Math///////////////////////////////////////////////////////////////////

double raiz=Math.sqrt(9);
System.out.println(raiz);
//Manipulación de cadenas/////////////////////////////////////////////////////////////////////////
String nombre= "Guillermo";
System.out.println("Mi nombre es "+nombre);
System.out.println("mi nombre tiene "+ nombre.length()+"letras.");
System.out.println("La primera letra de "+nombre+ "es la "+nombre.charAt(0));
int ultima_letra;
ultima_letra=nombre.length();
System.out.println("y la ultima letra es la "+nombre.charAt(ultima_letra-1));










		
		
		
		
	}
			

}
