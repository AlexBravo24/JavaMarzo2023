package com;
import java.util.Scanner;//importamos libreria Scaner
public class Parimpar {
	 public static void main(String[] args) {
		    Scanner Scanner = new Scanner (System.in);//nombramos a la variable scanner para pedir datos por consola
		    int numero;//creamos la variable
		// Solicitud de datos al usuario
		    System.out.println("Este programa calcula si un n�mero es par o impar.");
		    System.out.print("Introduce el n�mero: ");
		    numero = Scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
		    
		// Realizamos C�lculos y mostramos en pantalla
		    if (numero % 2 == 0){//si el numero se puede dividir en 2 dando cero, entonces es par
		        System.out.println("El n�mero, " +numero + " es par.");
		    }else {//si no es impar
		        System.out.println("El n�mero " +numero + " es impar.");
		    }  
		  }

}
