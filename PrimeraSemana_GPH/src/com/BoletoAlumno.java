package com;

/**
El director de una escuela está organizando un viaje de estudios, y requiere determinar
cuánto debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio.
La forma de cobrar es la siguiente: 
si son 100 alumnos o más, el costo por cada alumno es de65 euros;
de 50 a 99 alumnos, el costo es de 70 euros, de 30 a 49, de 95 euros,
y si son menosde 30, el costo de la renta del autobús es de 4000 euros,
sin importar el número de alumnos. 
Realice un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
pagar cada alumno por el viaje.

*/
import java.util.Scanner;//importamos libreria Scaner
// Inicio del programa y declaración de variables:
public class BoletoAlumno {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); //llamamos a la variable scanner para pedir datos por consola
    int numeroAlumnos;

// Solicitud de datos al usuario
    System.out.println("Programa para calcular el precio a pagar por alumno en "
        + "el viaje del curso.:");
    System.out.print("Número de alumnos: ");
    numeroAlumnos = scanner.nextInt();//pedimos por consola el numero de alumnos con Scanner

// Realizamos Cálculos y mostramos en pantalla
    if (numeroAlumnos >= 100) {//si esl numero es mayor o igual a 100
      System.out.println("El pago a la compañía de viajes es de " + numeroAlumnos*65 + " "
          + "pesos y cada alumno debe pagar 65 pesos");
    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {//si no el numero esta entre 100 y 50
      System.out.println("El pago a la compañía de viajes es de " + numeroAlumnos*70 + " "
          + "pesos y cada alumno debe pagar 70 pesos");
    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {//si no el numero esta entre 50 y 300
      System.out.println("El pago a la compañía de viajes es de " + numeroAlumnos*95 + " "
          + "pesos y cada alumno debe pagar 95 pesos");
    } else {
      System.out.println("El coste del autobús es de 4000 pesos y cada alumno "
          + "debe pagar " + (4000/numeroAlumnos) + " pesos.");
    } 
  }
}