package com;
import java.util.Scanner;//importamos libreria Scaner
public class Ejerciciouno {
	//Realiza un programa que reciba dos n�meros por teclado e indique
	//cu�l es mayor o si son iguales
	
	// Inicio del programa y declaraci�n de variables:
	 public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);//nombramos a la variable scanner para pedir datos por consola
	  //creamos las variables
	    int numero1;
	    int numero2;
	// Solicitud de datos al usuario
	    System.out.println("Este programa pide dos n�meros y calcula cual es mayor.");
	    System.out.print("Introduce el primer n�mero: ");
	    numero1 = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
	    System.out.print("Introduce el segundo n�mero: ");
	    numero2 = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
	    
	// Realizamos C�lculos y mostramos en pantalla
	    if (numero1 > numero2){//si numero1 es mayor que numero 2
	        System.out.println("El primer n�mero, " +numero1 + ", es mayor que el n�mero dos," +numero2);
	    }else if (numero1 < numero2){//si no el numero1 es menor que numero 2
	        System.out.println("El segundo n�mero, " +numero2 + ", es mayor que el primer n�mero " +numero1);
	    }else {
	        System.out.println("Ambos n�meros son iguales, " +numero1);
	    }    
	  }
	}	
	
	
	
	
	
	
	
	


