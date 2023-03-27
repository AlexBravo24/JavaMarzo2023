package com;

import java.util.Scanner;

public class Ejercicio6_RICG {

	public static void main(String[] args) {
		
		
		int tamaño;
		int precioI;
		char tipo;
		int k;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("El precio inicial");
		precioI = entrada.nextInt();
		System.out.println("");
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Indica el tamaño de la uva (1) o (2)");
		tamaño = entrada1.nextInt();
		System.out.println("");
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Indica el Tipo de uva (A) o (B)");
		tipo = entrada2.nextLine().charAt(0);
		System.out.println("");
		
		Scanner entrada3 = new Scanner(System.in);
		System.out.println("Indica el numero de kilos");
		k = entrada3.nextInt();
		System.out.println("");
		
		precioI=precioI +20;
		precioI=precioI +30;
		precioI=precioI -30;
		precioI=precioI -50;
		
		if(tipo == 'A') {
		}else if(tamaño ==1) {
			System.out.println("Lo resultado de la uva tipo A tamaño 1 es =" +k+(k=precioI*k));
		}else if (tamaño ==2){
			System.out.println("El resultado de la uva tipo A, tamaño 2 es=" +k+(k=precioI*k));
		}else if (tamaño ==1){
			System.out.println("El resultado de la uva tipo B, tamaño 1 es=" +k+(k=precioI*k));
		}else {
			System.out.println("El resultado de la uva tipo B, tamaño 2 es=" +k+(k=precioI*k));
		}
		
			 
		
	}

}
