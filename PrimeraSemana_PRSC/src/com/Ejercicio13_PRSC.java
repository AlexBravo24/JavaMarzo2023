package com;

import java.util.Scanner;

public class Ejercicio13_PRSC {

	public static void main(String[] args) {
		/*
		 * 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
		 * centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		 * Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
		 * y el resto se invierte en la bolsa.
		 * Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		 * ni�os y el resto se invierte en la bolsa.
		 * La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente
		 */

		int donaci�n;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de su donaci�n");
		donaci�n = entrada.nextInt();
		
		if (donaci�n>=10000) {
			System.out.println("Al centro de salud se donar�n: " + donaci�n*.3 + "\n Al comedor de ni�os se donar�n: " + donaci�n*.5 + "\n En la bolsa se invertir�n: " + donaci�n*.2);
		} else if (donaci�n<10000) {
			System.out.println("Al centro de salud se donar�n: " + donaci�n*.25 + "\n Al comedor de ni�os se donar�n: " + donaci�n*.6 + "\n En la bolsa se invertir�n: " + donaci�n*.15);
		}
	}

}
