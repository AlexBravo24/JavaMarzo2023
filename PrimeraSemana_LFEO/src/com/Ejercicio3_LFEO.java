package com;

import java.util.Scanner;

public class Ejercicio3_LFEO {
//3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el
//segundo número es 0, debe mostrar un mensaje de error.
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n1, n2, resultadodiv;
		
		System.out.println("INGRESE EL PRIMER NUMERO: ");
		n1 = entrada.nextInt();
		System.out.println("INGRESE EL SEGUNDO NUMERO: ");
		n2 = entrada.nextInt();
		
		
		
		if(n2 == 0) {
			System.out.println("Error.!!!");
		}else {
			resultadodiv = n1/n2;
			System.out.println("El resultado de la division de "+n1+ " entre " +n2+ " es: "+resultadodiv);
		}
		

	}

}
