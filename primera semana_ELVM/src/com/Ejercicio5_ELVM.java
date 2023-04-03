package com;

import java.util.Scanner;

public class Ejercicio5_ELVM {

	public static void main(String[] args) {
		   // 5. Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes 
		   //parámetros: edad, nota y sexo.
		   //* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE
		   //* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
		  //* Otros casos -> NO ACEPTADA
		int Nota=0;
		String Sexo;
		int Edad=0;
		Scanner entrada =new Scanner(System.in);//un mismo scaner puede hacer la de almacenamiento para las variables y no se necesita mas de ellas
		
		
		//Scanner edad=new Scanner(System.in);
		//Scanner sexo=new Scanner(System.in);
		System.out.println("dame la nota: ");
		Nota=entrada.nextInt();
		System.out.println("dame la edad: ");
		Edad=entrada.nextInt();
		System.out.println("dijita M si eres hombre o F si eres mujer");
		Sexo=entrada.next();
		
		if(Nota==5 && Edad==18 && ( Sexo.equals("M")) || Sexo.equals("m")) {
			System.out.println("Posible");
		}else if(Nota == 5 && Edad ==18 && ( Sexo.equals("F")) || Sexo.equals("f")) {
			System.out.println("Aceptado");
		}else {
			System.out.println("No Aceptado");
		}

	}

}
