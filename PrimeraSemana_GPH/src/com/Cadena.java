package com;
import java.util.Scanner;//importamos libreria Scaner

// programa que lea una cadena por teclado y compruebe si es una letra may�scula.
//Inicio del programa y declaraci�n de variables:
public class Cadena {
  public static void main(String[] args) {
	  
    Scanner scanner = new Scanner (System.in);//nombramos a la variable scanner para pedir datos por consola
    String cadena;
// Solicitud de datos al usuario
    System.out.println("Este programa nos pide una cadena y comprueba si es una letra may�scula.");
    System.out.print("Introduce la cadena que desees (Solo una letra): ");
    cadena = scanner.nextLine();//llamamos a la variable scanner para pedir datos por consola
    
// Realizamos C�lculos y mostramos en pantalla
    if (cadena.length() != 1){
      System.out.println("La cadena no es una letra may�scula");
   // }else if ((cadena > "A") && (cadena < "Z")) {
    }else if ((cadena.compareTo("A") >= 0) && (cadena.compareTo("Z")<=0)) {
       System.out.println("La cadena es una letra may�scula.");
    }else {
        System.out.println("La cadena no es una letra may�scula.");
    }
    }
  }