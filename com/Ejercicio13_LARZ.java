package com;

import java.util.Scanner;

public class Ejercicio13_LARZ {

	public static void main(String[] args) {
		// 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa 
		//y lo reparte entre un centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donaci�n es de $10000 o m�s: 
		//30% se destina al centro de salud, 50% al comedor de ni�os y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000: 
		//25% se destina al centro de salud, 60% al comedor de ni�os y el resto se invierte en la bolsa.
		//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		
		System.out.println("Programa que determina el dinero destinado a cada rubro anualmente.");
		System.out.println();
		
		double donacion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba el monto donado a la institucion: ");
		donacion = entrada.nextDouble();
		
		if (donacion<10000) {
			System.out.println("El monto destinado a cada institucion es: "+"\nCentro de salud: "+donacion*.25+"\nComedor de ni�os: "+
					donacion*.60+"\nInversion en Bolsa: "+donacion*.15);
		}else if (donacion>=10000) {
			System.out.println("El monto destinado a cada institucion es: "+"\nCentro de salud: "+donacion*.30+"\nComedor de ni�os: "+
					donacion*.50+"\nInversion en Bolsa: "+donacion*.20);
		}


	}
}
