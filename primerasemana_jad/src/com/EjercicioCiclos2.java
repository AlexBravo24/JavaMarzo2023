package com;

import java.util.Scanner;

public class EjercicioCiclos2 {

	public static void main(String[] args) {
		int tabla,i;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introzca el número de tabla:");
		tabla=entrada.nextInt();
		System.out.println("introduzca el iterador:");
		i=entrada.nextInt();
		for(int j=1;j<=i;j++) {
			System.out.println(tabla+"x"+j+"="+tabla*j);
		}

	}

}
