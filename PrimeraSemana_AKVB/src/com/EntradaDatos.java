package com;

import java.util.Scanner;

public class EntradaDatos {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Introducir datos desde teclado
		
		//STEP 1: Declarar variable
		
		int numero;
		
		//STEP 2: Llamar a Scanner
		Scanner entrada = new Scanner(System.in);	//Objeto Scanner para introducir valores
		System.out.println("Type somthng mf (a number)");	//Mensaje para el usuario
		
		numero = entrada.nextInt();	//Se guarda un valor en numero
		
		entrada.close();
		//System.out.println(numero+20);
		System.out.println("La raiz cuadrada de " + numero + " es");	//Confirmación de valor
		//System.out.println(Math.sqrt(numero));
		System.out.printf("%.4f", Math.sqrt(numero));
		
		//Se pueden comentar múltiples líneas al seleccionarlas y presionar
		//Ctrl + 7

		int n = 10;
		
		int resultado = n/2;	//Operador de division
		int res = n%3;			//Operador de residuo
		
		System.out.println("\nResiduo: " + res);	//Imprime residuo
		
		
		System.out.println("\nMy finite life has come to an end. Perhaps my next iteration will be of more use. \n(The program finished running)");
	}//Cierre de main()

}//Cierre de clase
