package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		
		//Introducir datos desde el teclado
		//Declarar la variable donde quiero guardar los datos a introducir
		
		int numero;
		
		//llamo a mi clase Scanner para poder realizar una "Escucha"
		//desde el teclado
		
		Scanner entrada = new Scanner(System.in) ;//Iniciamos objeto scaner para introducir valores de teclado
		System.out.println("Introduce el Valor");//Mostramos un mensaje en pantalla para enviarnos
		//una instruccion
		numero=entrada.nextInt();//guardamos el valor de lo que introducimos por teclado en la variable
		//que coresponde 
		
		//Una vez guardado el valor introducido en mi variable, puedo hacer uso de ella
		//para realizaralgunas operaciones
		
//		System.out.println(numero+20);
		
		//System.out.println("La raiz cuadrada de "+ numero + " es:");
		//System.out.println(Math.sqrt(numero));
		
		//Dandole formato de decimales mostrados en pantalla
		//System.out.printf("%.2f", Math.sqrt(numero));
		
		//Comentando multiples lineas de codigo, seleccionando las lineas y aprentando
		//las teclas Ctrl + 7
		
		/*
		 * Operadores de modulo
		 */
		
//		int n = 10; 
//		int resultado = n%4; //Indicamos que nos de el valor residual de la division 
//		
//		System.out.println(resultado);
		
			
	}//Cierre de main
}//Cierre de clase
