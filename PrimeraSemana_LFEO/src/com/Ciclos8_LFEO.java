package com;

import java.util.Scanner;

public class Ciclos8_LFEO {
	/*
	 * 8. Programa Java que lea dos números y muestre los números desde el menor hasta el 
        mayor
	 * */

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2; //declaramos variables a guardar los numeros ingresados
		
		System.out.println("INGRESE EL PRIMER NUMERO: ");
		n1 = entrada.nextInt(); //peimos los numeros y guardamos en sus respectivas variables
		
		System.out.println("INGRESE EL SEGUNDO NUMERO: ");
		n2 = entrada.nextInt(); //peimos los numeros y guardamos en sus respectivas variables
		
		if(n1<n2) { //si numero1 es menor que numero2
			for(int i=n1; i<=n2; i++) { //que inicie el clicl for de numero1 y se itere hasta numero2
				System.out.println(i);//se imprime
			}
		}else { //si no quiere decir que numero2 es menor que numero1
			for(int j=n2; j<=n1; j++) { //inicia el ciclo for de numero2 y se itera hasta numero1
				System.out.println(j); //se imprime
			}
		}
		

	}

}
