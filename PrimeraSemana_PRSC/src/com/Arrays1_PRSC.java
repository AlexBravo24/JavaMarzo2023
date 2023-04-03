package com;

import java.util.Scanner;

public class Arrays1_PRSC {

	public static void main(String[] args) {
		/*
		 * 1. Crea un array de 10 posiciones de números con valores pedidos por teclado.
		 * Muestra por consola el índice y el valor al que corresponde.
		 */

		int [] números = new int[10];
		int a,b,c,d,e,f,g,h,i,j;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa 10 números");
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
		
		
		números[0]=a;
		números[1]=b;
		números[2]=c;
		números[3]=d;
		números[4]=e;
		números[5]=f;
		números[6]=g;
		números[7]=h;
		números[8]=i;
		números[9]=j;
		
		System.out.println("La posición 0 tiene el valor: " +números[0]);
		System.out.println("La posición 1 tiene el valor: " +números[1]);
		System.out.println("La posición 2 tiene el valor: " +números[2]);
		System.out.println("La posición 3 tiene el valor: " +números[3]);
		System.out.println("La posición 4 tiene el valor: " +números[4]);
		System.out.println("La posición 5 tiene el valor: " +números[5]);
		System.out.println("La posición 6 tiene el valor: " +números[6]);
		System.out.println("La posición 7 tiene el valor: " +números[7]);
		System.out.println("La posición 8 tiene el valor: " +números[8]);
		System.out.println("La posición 9 tiene el valor: " +números[9]);
		
		
		
	}

}
