package com;

import java.util.Scanner;

public class Ciclos12_ELVM {

	public static void main(String[] args) {
		/*
		 * 12.Se ingresan un conjunto de n edades de personas por teclado. El programa finalizara
				cuando el promedio de las edades sea superior a 25
		 */
		 int Edad;
		 int Suma = 0;
		 int Contador = 0;
		 int Promedio=0;
		  Scanner entrada=new Scanner(System.in);
		  do {
		   System.out.println("Ingrese la edad de la persona");
		   Edad=entrada.nextInt();
		   Suma=Suma+Edad;
		   Contador=Contador+1;
		   Promedio=Suma/Contador;
		  System.out.println("El promedio por ahora es " +Promedio);
		   if (Promedio>25) {
			   
		   break;
		  
		  }
		   
		  } while (Edad>0);
		  if (Promedio>25) {
		   System.out.println("El promedio es mayor que 25 ");
		  }
		  System.out.println("Cantidad  de edades ingresadas fueron: "+ Contador);
		  System.out.println("El promedio es igual a: "+Promedio);
		  
	}

}
