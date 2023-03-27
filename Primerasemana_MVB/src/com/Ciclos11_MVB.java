package com;
import java.util.Scanner;  
public class Ciclos11_MVB {

	public static void main(String[] args) {
	// Ejericio 11. Dibuja un cuadrado, con asteriscos dentro. 
	//introducir desde teclado el
	//ancho y el alto. Ejemplo: 8 x 8
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca alto:");
		int num1 = entrada.nextInt();
		System.out.println("Introduzca ancho: ");
		int num2 = entrada.nextInt();
		
		
		for (int i = 0; i< num1;i++) { //itera sobre la primera linea
		for(int j = 0; j < num2; j++) {
			System.out.print("*"); // se quita el salto de linea
		}
		System.out.println();
		}
	
		
		
		
	}//cierre del main

}//cierre de la clase
