package com;

import java.util.Scanner;

public class Ejercicio13_ELVM {

	public static void main(String[] args) {
		/*
		 * 13. Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un 
			centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
			Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os 
			y el resto se invierte en la bolsa.
			Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
			ni�os y el resto se invierte en la bolsa.
			La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		 */
		int Donacion=0;
		double Csalud=0;
		double Cni�os=0;
		double Bolsa=0;
		Scanner entrada =new Scanner(System.in);
		System.out.println("Proporcione la donacion realizada: ");
		Donacion=entrada.nextInt();
		
		
		if(Donacion>=10000) {
			Csalud=0.30*Donacion;
			Cni�os=0.50*Donacion;
			Bolsa=0.20*Donacion;
			System.out.println("Dinero destinado al centro de salud: "+Csalud+" Dinero destinado al comedor de ni�os: "+Cni�os+" Dinero destinado a la bolsa es: "+Bolsa);
		}else if(Donacion<10000) {
			Csalud=0.25*Donacion;
			Cni�os=0.60*Donacion;
			Bolsa=0.15*Donacion;
			System.out.println("Dinero destinado al centro de salud: "+Csalud+" Dinero destinado al comedor de ni�os: "+Cni�os+" Dinero destinado a la bolsa es: "+Bolsa);
		}else {
			System.out.println("ERROR");
		}
			
	}

}
