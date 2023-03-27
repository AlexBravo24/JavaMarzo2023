package com;

import java.util.Scanner;

public class Ciclos12_LARZ {

	public static void main(String[] args) {
		// 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara 
		//cuando el promedio de las edades sea superior a 25.
		System.out.println("Programa donde ingresan un conjunto de n edades de personas por teclado "+
		"\ny finalizara cuando el promedio de las edades sea superior a 25");
		System.out.println();
		
		int Edad, Suma = 0,Contador = 0,Promedio=0;
		  Scanner entrada=new Scanner(System.in);
		  do {
			  System.out.println("Ingrese la edad de la persona: ");
			  Edad=entrada.nextInt();
			  Suma=Suma+Edad;
			  Contador=Contador+1;
			  Promedio=Suma/Contador;
			  System.out.println("La suma de las edades es:" + Suma);
			  System.out.println("El promedio por ahora es: " +Promedio);
		  if (Promedio>25) {
		  break;
		  				   } 
		  	  } while (Edad>0);
		  
		   System.out.println("El programa ha finalizado");

	}

}
