package com;
import java.util.Scanner;


public class Ciclos11_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		11.Dibuja un cuadrado, como en la imagen que acompaña, introducir desde teclado el 
//		ancho y el alto. Ejemplo: 8 x 8 
		
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca filas");
		int num1 = my_scanner.nextInt();
		System.out.println("Introduzca columas");
		int num2 = my_scanner.nextInt();
		
		for (int i = 0; i <  num1; i++) {
			System.out.println();
			for (int j = 0; j < num2; j++) {
				System.out.print("*");
			}
		}
	}

}
