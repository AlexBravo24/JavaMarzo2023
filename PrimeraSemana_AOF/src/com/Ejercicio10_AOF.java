package com;

import java.util.Scanner;

public class Ejercicio10_AOF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		  int mes;
		//EJERCICIO10: 10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima el n�mero de d�as que tiene el 
		//mes correspondiente.
		
		System.out.println("Ingresa el numero valoralmes correspondiente:");
		System.out.println(" 1.- Enero.");
	    System.out.println(" 2.- Febreo.");
	    System.out.println(" 3.- Marzo.");
	    System.out.println(" 4.- Abril.");
	    System.out.println(" 5.- Mayo.");
	    System.out.println(" 6.- Junio.");
	    System.out.println(" 7.- Julio.");
	    System.out.println(" 8.- Agosto.");
	    System.out.println(" 9.- Septiembre.");
	    System.out.println("10.- Octubre.");
	    System.out.println("11.- Noviembre.");
	    System.out.println("12.- Diciembre.");
	    mes = scanner.nextInt();

	    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
	        System.out.println("El mes seleccionado tiene 31 d�as");
	      } else if (mes ==2){
	        System.out.println("Febrero tiene 28 d�as");
	      } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
	        System.out.println("El mes seleccionado tiene 30 d�as");
	      } else {
	        System.out.println("Error, el mes debe estar entre 1-12.");
	      } 
		
	}//CIERRA

}//CIERRA
