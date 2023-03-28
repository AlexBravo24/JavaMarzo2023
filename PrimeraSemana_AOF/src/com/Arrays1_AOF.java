package com;

import java.util.Scanner;

public class Arrays1_AOF {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// TODO Auto-generated method stub
//. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		//Muestra por consola el índice y el valor al que corresponde.
		int [] num = new int [10];
		for(int i=0; i<num.length; i++) {
			System.out.println("ingrese posicion["+(i)+"]=");
			num[i]=entrada.nextInt();
		}

		
		
		
	}

}
