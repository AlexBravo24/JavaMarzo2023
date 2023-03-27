package com;

import java.util.Scanner;

//1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales.

public class Ejercicio1_LFEO {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int n1, n2;
		System.out.println("Ingrese el primer numero:");
		n1 = entrada.nextInt();
		System.out.println("Ingrese el segundo numero");
		n2 = entrada.nextInt();
		
		if(n1>n2) {
			System.out.println(" EL PRIMER NUMERO " +n1+ " ES MAYOR QUE EL SEGUNDO NUMERO " +n2);
		}else if(n1<n2) {
			System.out.println(" EL SEGUNDO NUMERO " +n2+ " ES MAYOR QUE EL PRIMER NUMERO " +n1);
		}else {
			System.out.println("AMBOS NUMEROS SON IGUALES " +n1+ " Y " +n2);
		}

	}

}
