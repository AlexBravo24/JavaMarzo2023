package com;
import java.util.Scanner;//importamos libreria Scaner
public class Ejerciciouno {
	//Realiza un programa que reciba dos números por teclado e indique
	//cuál es mayor o si son iguales
	
	// Inicio del programa y declaración de variables:
	 public static void main(String[] args) {
	    Scanner scanner = new Scanner (System.in);//nombramos a la variable scanner para pedir datos por consola
	  //creamos las variables
	    int numero1;
	    int numero2;
	// Solicitud de datos al usuario
	    System.out.println("Este programa pide dos números y calcula cual es mayor.");
	    System.out.print("Introduce el primer número: ");
	    numero1 = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
	    System.out.print("Introduce el segundo número: ");
	    numero2 = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
	    
	// Realizamos Cálculos y mostramos en pantalla
	    if (numero1 > numero2){//si numero1 es mayor que numero 2
	        System.out.println("El primer número, " +numero1 + ", es mayor que el número dos," +numero2);
	    }else if (numero1 < numero2){//si no el numero1 es menor que numero 2
	        System.out.println("El segundo número, " +numero2 + ", es mayor que el primer número " +numero1);
	    }else {
	        System.out.println("Ambos números son iguales, " +numero1);
	    }    
	  }
	}	
	
	
	
	
	
	
	
	


