package com;

import java.util.Scanner;

public class EjercicioCiclos8 {

	public static void main(String[] args) {
		int a,b;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el primer numero:");
		a=entrada.nextInt();
		System.out.println("introduzca el segundo numero:");
		b=entrada.nextInt();
		if(a<b) {
			for(int i=a;i<=b;i++) {
				System.out.println(i);
			}
		}
		else if(a>b){
			for(int i=b;i<=a;i++) {
				System.out.println(i);
			}
		}
		else {
			System.out.println("los numeros son iguales");
		}

	}

}
