package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		//Introducir datos desde el teclado.
//		//Declaro una variable donde quiero guardar el dato a introducir.
//		
//		int numero;
//		
//		//Llamo a mi clase Scanner para poder realizar una "escucha" desde el teclado.
//		
//		Scanner entrada = new Scanner(System.in); //Iniciamos nuestro objeto scanner para introducir valores por teclado.
//		System.out.println("Introduce un valor:"); //Mostramos un mensaje en pantalla para "enviarnos" una instrucción.
//		numero = entrada.nextInt(); //Guardamos el valor de lo que introducimos por teclado en la variable que corresponda.
//		
//		//Una vez que tengo guardado el valor introducido en mi variable puedo hacer uso de ella para realizar alguna operación.
//		
//		// System.out.println(numero + 20); (Comentando líneas no se ejecutan)
//		
//		System.out.println("La raíz cuadrada de " + numero + " es ");
//		//System.out.println(Math.sqrt(numero));
//		
//		//Dandole formato a los decimales mostrados en pantalla
//		System.out.printf("%.2f", Math.sqrt(numero));
//		
//		//Comentando multiples líneas de código, seleccionando las líneas y apretando las teclas Ctrl + 7
//		
		/*Operador de Modulo
		 * 
		 */
		
		int n = 10;
		int resultado = n%4;//Indicamos que nos de el valor residual de la división.
		
		System.out.println(resultado);

	}//Cierre del main

}//Cierre de la clase
