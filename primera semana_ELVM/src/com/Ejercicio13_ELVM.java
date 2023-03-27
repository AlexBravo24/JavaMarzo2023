package com;

import java.util.Scanner;

public class Ejercicio13_ELVM {

	public static void main(String[] args) {
		/*
		 * 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
			centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
			y el resto se invierte en la bolsa.
			Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
			niños y el resto se invierte en la bolsa.
			La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		 */
		int Donacion=0;
		double Csalud=0;
		double Cniños=0;
		double Bolsa=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Proporcione la donacion realizada: ");
		Donacion=entrada.nextInt();
		
		
		if(Donacion>=10000) {
			Csalud=0.30*Donacion;
			Cniños=0.50*Donacion;
			Bolsa=0.20*Donacion;
			System.out.println("Dinero destinado al centro de salud: "+Csalud+" Dinero destinado al comedor de niños: "+Cniños+" Dinero destinado a la bolsa es: "+Bolsa);
		}else if(Donacion<10000) {
			Csalud=0.25*Donacion;
			Cniños=0.60*Donacion;
			Bolsa=0.15*Donacion;
			System.out.println("Dinero destinado al centro de salud: "+Csalud+" Dinero destinado al comedor de niños: "+Cniños+" Dinero destinado a la bolsa es: "+Bolsa);
		}else {
			System.out.println("ERROR");
		}
			
	}

}
