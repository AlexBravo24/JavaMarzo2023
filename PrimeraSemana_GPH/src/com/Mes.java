package com;
/**

Escribe un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el 
mes correspondiente.
*/
import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaración de variables:
public class Mes {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);//nombramos a la variable scanner para pedir datos por consola
    int mes;
// Solicitud de datos al usuario creando un menu
    System.out.println("El programa te devuelve el número de días del mes seleccionando:");
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
    mes = scanner.nextInt();//llamamos a la variable scanner para pedir datos por consola
// Realizamos comparaciones y mostramos el resultado
    
    //ponemos en un grupo a los meses con 31 dias, a los de 30 y al unico de 28 
    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
      System.out.println("El mes seleccionado tiene 31 días");
    } else if (mes ==2){
      System.out.println("Febrero tiene 28 días");
    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11){
      System.out.println("El mes seleccionado tiene 30 días");
    } else {
      System.out.println("Error, el mes debe estar entre 1-12.");
    } 
  }
}