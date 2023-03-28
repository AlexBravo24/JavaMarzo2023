package com;
/**
Realiza un programa que pida el d�a de la semana (del 1 al 7) y escriba el d�a 
correspondiente.
Si introducimos otro n�mero nos da un error.

*/
import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaraci�n de variables:
public class Semana {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//nombramos a la variable scanner para pedir datos por consola
    int dia;//creamos las variables
// Solicitud de datos al usuario creando un menu
    System.out.println("El programa te devuelve el d�a de la semana seleccionando:");
    System.out.println("1.- Lunes.");
    System.out.println("2.- Martes.");
    System.out.println("3.- Mi�rcoles.");
    System.out.println("4.- Jueves.");
    System.out.println("5.- Viernes.");
    System.out.println("6.- S�bado.");
    System.out.println("7.- Domingo.");
    dia = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
// Realizamos comparaciones y mostramos el resultado
    switch (dia) {// se inicia el switch para poder usar el menu en forma de casos, 
    //siendo mas practico que "else if"
    case 1:
      System.out.println("El d�a seleccionado es LUNES");
      break;//cuando se inicia un caso se tiene que romper
    case 2:
      System.out.println("El d�a seleccionado es MARTES");
      break;
    case 3:
      System.out.println("El d�a seleccionado es MI�RCOLES");
      break;
    case 4:
      System.out.println("El d�a seleccionado es JUEVES");
      break;
    case 5:
      System.out.println("El d�a seleccionado es VIERNES");
      break;
    case 6:
      System.out.println("El d�a seleccionado es S�BADO");
      break;
    case 7:
      System.out.println("El d�a seleccionado es DOMINGO");
      break;
    default:
      System.out.println("ERROR: n�mero incorrecto.");
    }
  }
}