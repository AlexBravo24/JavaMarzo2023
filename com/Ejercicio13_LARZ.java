package com;

import java.util.Scanner;

public class Ejercicio13_LARZ {

	public static void main(String[] args) {
		// 13. Una institución benéfica recibe anualmente una donación proveniente de Europa 
		//y lo reparte entre un centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		//Si el monto de la donación es de $10000 o más: 
		//30% se destina al centro de salud, 50% al comedor de niños y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 
		//25% se destina al centro de salud, 60% al comedor de niños y el resto se invierte en la bolsa.
		//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		System.out.println("Programa que determina el dinero destinado a cada rubro anualmente.");
		System.out.println();
		
		double donacion;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Escriba el monto donado a la institucion: ");
		donacion = entrada.nextDouble();
		
		if (donacion<10000) {
			System.out.println("El monto destinado a cada institucion es: "+"\nCentro de salud: "+donacion*.25+"\nComedor de niños: "+
					donacion*.60+"\nInversion en Bolsa: "+donacion*.15);
		}else if (donacion>=10000) {
			System.out.println("El monto destinado a cada institucion es: "+"\nCentro de salud: "+donacion*.30+"\nComedor de niños: "+
					donacion*.50+"\nInversion en Bolsa: "+donacion*.20);
		}


	}
}
