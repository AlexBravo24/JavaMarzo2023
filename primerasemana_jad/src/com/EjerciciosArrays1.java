package com;

import java.util.Scanner;

public class EjerciciosArrays1 {

	public static void main(String[] args) {
		int [] numeros = new int[10];
		 int i=0;
		Scanner entrada = new Scanner (System.in);
		do {
			System.out.println("introduzca un numero:");
			numeros[i]=entrada.nextInt();
			i++;
		}while(i<10);{
			
		}
		for(int j=0;j<10;j++) {
			System.out.println("numeros"+"["+j+"]"+"="+numeros[j]);
		}

	}

}
