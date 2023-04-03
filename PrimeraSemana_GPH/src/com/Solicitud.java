package com;
/**
08 Ejercicios Estructuras Alternativas en Java
Programa:
Algoritmo que pida dos n�meros �nota� y �edad� y un car�cter �sexo� y muestre el 
mensaje �ACEPTADA� si la nota es mayor o igual a cinco, la edad es mayor o igual a 
dieciocho y el sexo es �F�. En caso de que se cumpla lo mismo, pero el sexo sea �M�, debe 
imprimir �POSIBLE�. Si no se cumplen dichas condiciones se debe mostrar �NO ACEPTADA�.

*/
import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaraci�n de variables:
public class Solicitud {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//nombramos a la variable scanner para pedir datos por consola
  //creamos las variables
    int nota;
    int edad;
    String sexo;
// Solicitud de datos al usuario
    System.out.println("Este programa nos calcula la aceptaci�n de una solicitud"
        + " en base a los siguientes par�metros:");
    System.out.print("Edad: ");
    edad = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Nota: ");
    nota = scanner.nextInt(); scanner.nextLine();//llamamos a la variable scanner para pedir datos por consola
    System.out.print("Sexo (M o F): ");
    sexo = scanner.nextLine();//llamamos a la variable scanner para pedir datos por consola
    
// Realizamos C�lculos y mostramos en pantalla
    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
      System.out.println("El valor de sexo introducido es incorrecto.\n"
          + "por favor, reenv�e el formulario.");
    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
      System.out.println("POSIBLE");
    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
       System.out.println("ACEPTADA");
    }else {
        System.out.println("NO ACEPTADA");
    }
    }
  }