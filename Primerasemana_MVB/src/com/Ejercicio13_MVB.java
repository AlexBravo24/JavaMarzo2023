package com;

public class Ejercicio13_MVB {

	public static void main(String[] args) {
		//EJERCICIO 13. . Una instituci�n ben�fica recibe anualmente una donaci�n proveniente de Europa y lo reparte entre un
		//centro de salud, un comedor de ni�os y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	    //Si el monto de la donaci�n es de $10000 o m�s: 30% se destina al centro de salud, 50% al comedor de ni�os
	//y el resto se invierte en la bolsa.
		//Si el monto de la donaci�n es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		//ni�os y el resto se invierte en la bolsa.
	//La instituci�n desea saber cu�nto de dinero destinar� a cada rubro anualmente.
		
		
		
		double donacion = 15000.0;
		double centroSalud, comedorNinos, inversionBolsa;
		
		if (donacion >= 10000) {
			centroSalud = donacion * 0.3;
			comedorNinos = donacion * 0.5;
            inversionBolsa = donacion - centroSalud - comedorNinos;
		}else {
			centroSalud = donacion * 0.25;
            comedorNinos = donacion * 0.6;
            inversionBolsa = donacion - centroSalud - comedorNinos;
		}
		System.out.println("El centro de salud recibir�: $" + centroSalud);
        System.out.println("El comedor de ni�os recibir�: $" + comedorNinos);
        System.out.println("La inversi�n en la bolsa ser� de: $" + inversionBolsa);

	}

}
