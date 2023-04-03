package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		//Como se puede dar una entrada de datos
		
		//Introducir datos desde el teclado
		//Declaro una variable donde quiero guardar el dato a introducir
		
		int numero; 
		
		//Llamo a mi clase Scanner para poder realizar una "escucha" desde teclado
		
		Scanner entrada = new Scanner(System.in); //Debes darle en java.util cuando re sale Scanner sub en rojo
		//Iniciamos nuestro objeto scanner para introducir valores por teclado
		System.out.println("Introduce un valor");
		//Mostramos un mensaje por pantalla para "enviarnos una instruccion
		numero= entrada.nextInt();
		//Guardamos el calor de lo que introducimos por teclado en la variable que corresponda
		
		//Una vez que tengo guardado el valor introducido en mi variable puedo hacer uso de ella para realizar alguna operación
		
		//System.out.println(numero+20); comentando lineas no se ejecutan
		System.out.println("La raíz cuadrada de "+numero+ " es " );
		//System.out.println(Math.sqrt(numero));
		
		System.out.printf("%.4f", Math.sqrt(numero));
		System.out.println();
		//Dandole formato a los decimales mostrados en pantalla
		
		
		//Comentando multiples líneas de código, seleccionando las líneas y apretando las teclas ctrl+7
		//Para descomentar le damos  ctrl+7 
		/*
		 * Operador de Modulo
		 */
		
		int n = 10;
		
		int resultado=n%4; // si ponemos el % indicaos que nos de el valor residual
		
		System.out.println(resultado);
		

	}//Cierre del main

}//Llave de cierre de la clase
