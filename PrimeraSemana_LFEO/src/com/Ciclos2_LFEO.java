package com;

import java.util.Scanner;

public class Ciclos2_LFEO {
	/*
	 * 2.- Programa un algoritmo que realice la tabla de multiplicar de un numero introducido 
       desde teclado, hasta la iteración deseada por el usuario. Ejemplo, tabla de 23 hasta el 95. 
       23 x 95 = ??
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero, iteracion, multiplicacion; //declaramos variables vacias donde se almcenara cada dato de tipo entero
		
		System.out.println("INGRESE EL NUMERO QUE DESEA REALIZAR LA TABLA DE MULTIPLICAR"); 
		numero = entrada.nextInt(); //pedimos que se ingrese el numero que se desea multiplicar y se guarda en la variable nu,ero
		System.out.println("ENGRESE HASTA QUE NUMERO DESEA QUE SE REALICE LA ITERACION");
		iteracion = entrada.nextInt(); //se pide que se ingresa hasta que numero se desea iterar la multiplicacion y se guarda en iteracion
		
		for(int i =0; i<=iteracion; i++) { //iniciamos el cliclo for con la variable i iniciando de 0 y que se itere hata el valor que dio el usuario
		multiplicacion = numero*i; //se realiza la multiplicaion del numero por la posicion de la i (iteracion ) y se guarda en la variable multiplicacion
		System.out.println("LA MULTIPLICACION DE  "+numero+ " x " +i+ " ES = " +multiplicacion); // se imprime el resultado
		}

	}

}
