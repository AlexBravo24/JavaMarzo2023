package com;

import java.util.Scanner;

public class Arrays1_PRSC {

	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de n�meros con valores pedidos por teclado.
		 * Muestra por consola el �ndice y el valor al que corresponde.
		 */

		int [] n�meros = new int[10];
		int a,b,c,d,e,f,g,h,i,j;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa 10 n�meros");
		a = entrada.nextInt();
		b = entrada.nextInt();
		c = entrada.nextInt();
		d = entrada.nextInt();
		e = entrada.nextInt();
		f = entrada.nextInt();
		g = entrada.nextInt();
		h = entrada.nextInt();
		i = entrada.nextInt();
		j = entrada.nextInt();
		
		
		n�meros[0]=a;
		n�meros[1]=b;
		n�meros[2]=c;
		n�meros[3]=d;
		n�meros[4]=e;
		n�meros[5]=f;
		n�meros[6]=g;
		n�meros[7]=h;
		n�meros[8]=i;
		n�meros[9]=j;
		
		System.out.println("La posici�n 0 tiene el valor: " +n�meros[0]);
		System.out.println("La posici�n 1 tiene el valor: " +n�meros[1]);
		System.out.println("La posici�n 2 tiene el valor: " +n�meros[2]);
		System.out.println("La posici�n 3 tiene el valor: " +n�meros[3]);
		System.out.println("La posici�n 4 tiene el valor: " +n�meros[4]);
		System.out.println("La posici�n 5 tiene el valor: " +n�meros[5]);
		System.out.println("La posici�n 6 tiene el valor: " +n�meros[6]);
		System.out.println("La posici�n 7 tiene el valor: " +n�meros[7]);
		System.out.println("La posici�n 8 tiene el valor: " +n�meros[8]);
		System.out.println("La posici�n 9 tiene el valor: " +n�meros[9]);
		
		
		
	}

}
