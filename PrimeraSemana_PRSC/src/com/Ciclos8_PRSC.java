package com;

import java.util.Scanner;

public class Ciclos8_PRSC {

	public static void main(String[] args) {
		/*
		 * 8. Programa Java que lea dos n�meros y muestre los n�meros desde el menor hasta el 
		 * mayor
		 */

		int n;
		int m;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese 2 n�meros:");
		n = entrada.nextInt();
		m = entrada.nextInt();
		
		if (n<m) {
			for (int i=n; i<=m; i++ ) {
				System.out.println(i);
			}
		} else {
			for (int i=m; i<=n; i++) {
				System.out.println(i);
			}
		}
		
	}

}
