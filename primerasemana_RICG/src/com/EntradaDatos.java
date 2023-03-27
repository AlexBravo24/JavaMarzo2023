package com;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {	
		//Introducir datos desde el teclado
		
		//Declaro una variabe donde quieri guardar el dato a introducir
		
		int numero; 
		
		//llamo a mi clase Scanner para poder realizar una "escucha" desde el teclado
		
		Scanner entrada = new Scanner(System.in);//iniciamos nuestros objeto Scanner para introducir valores por teclado
		
		System.out.println("Introduce un valor");//mostramos un mensaje en pantalla para "enviarnos"una instrucción
		
		numero = entrada.nextInt();//guardamos el valor que insertamos de lo que introducimos por teclado en la variable que corresponda
		// una vez que tengo guardado el valor inroducido en mi variable puedo hacer uso de ella para realizar alguna operación
		
		// System.out.println(numero +20); (comentando lineas no se ejutan las instrucciones) 
		
		System.out.println("La raiz cuadrada de " + numero + " es " );
	    //System.out.println(Math.sqrt(numero));
		
		//dandole formato a los decimales mostrados en pantalla
		System.out.printf("%.4f", Math.sqrt(numero));
		
		//Para hacer multiples comentarios selecionamos y ponemos ctrl + 7
		
		
		/* 
		 * operador de modulo
		 */
		
		int n=10;
		int resultado =n%4;//indicamos que nos de el valor residual de la división
		System.out.println(resultado);
		
		
	}//Cierre del main

}//cierre de la clase 
