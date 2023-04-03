package com;

import java.util.Scanner;

public class EjercicioCiclos9 {

	public static void main(String[] args) {
		int a,b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el primer numero:");
		a=entrada.nextInt();
		System.out.println("introduzca el segundo numero:");
		b=entrada.nextInt();
		if(a<b) {
			for(int i=a+1;i<b;i++) {
				if(i%2==0) {
					System.out.println("los numeros pares son:"+i);
					
				}
			}
		}
		else if(a>b) {
			for(int i=b+1;i<a;i++) {
				if(i%2==0) {
					System.out.println("los numeros pares son:"+i);
					
				}
			}
		}

	}

}
