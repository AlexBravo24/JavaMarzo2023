package com;

import java.util.Scanner;

public class Ejercicio3_EVVC {

	public static void main(String[] args) {
		/*Crea un programa que pida la usuario dos numeros y muestre el resultado de su divisi�n.
		 * Si el segundo n�mero es 0, debe mostrar un mensaje de error.
		 */
		double num1;
		double num2;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el numerador:");
		num1 = entrada.nextInt();
		
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Introduce el denominador:");
		num2 = entrada2.nextInt();
		
		if (num2==0) {
			System.out.println("���Error!!! ���Error!!!" + "\nIngrese un valor v�lido" );
		}else {
			
			System.out.println("El resultado de esta divisi�n es: " + num1/num2);
		}
		
	}

}
