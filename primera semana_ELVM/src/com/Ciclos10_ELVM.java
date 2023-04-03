package com;

import java.util.Scanner;

public class Ciclos10_ELVM {

	public static void main(String[] args) {
		/*
		 * 10. Programa que lea 20 números e indique si son positivos o negativos y pares o
			impares y además muestre la sumatoria de los positivos y sumatoria de los impares. 
		 */
		int num1=0;
		int n=0;
		int sumapositiva=0;
		int sumanegativa=0;
		int total=0;
		Scanner entrada=new Scanner(System.in);
		while(n<=20) {
			System.out.println("dame el primer dumero");
			num1=entrada.nextInt();
			n++;
			
			if(num1>=0) {
				total=num1%2;
				sumapositiva=num1+sumapositiva;
				if(total==0) {
				System.out.println("positivo el numero: "+num1+" y es par");
				}else {
				System.out.println("positivo el numero: "+num1+" y es impar");	
				}
				
				
			}
			if(num1<0) {
				total=num1%2;
				sumanegativa=sumanegativa+num1;
				if(total==0) {
				System.out.println("negativo el numero: "+num1+" y es par");
				}else {
				System.out.println("negativo el numero: "+num1+" y es impar");	
				}
				
				
			}
		}
		System.out.println("la suma de los positivos fueron: "+sumapositiva);
		System.out.println("la suma de los positivos fueron: "+sumanegativa);
	
	}

}
