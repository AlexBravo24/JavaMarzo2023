package com;

import java.util.Scanner;

public class Ciclos9_PRSC {

	public static void main(String[] args) {
		
		/*
		 * 9. Programa Java que lea dos números y muestre los números pares entre ellos
		 */
		
		int n;
		int m;
		int par;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese 2 números:");
		n = entrada.nextInt();
		m = entrada.nextInt();
		
		if (n<m) {
			for (int i=n; i<=m; i++ ) {
				par=i%2;
				if (par==0) {
				System.out.println(i);
				}
			}
		} else {
			for (int i=m; i<=n; i++) {
				par=i%2;
				if (par==0) {
				System.out.println(i);
				}
			}
		}
		
		
	}
}
