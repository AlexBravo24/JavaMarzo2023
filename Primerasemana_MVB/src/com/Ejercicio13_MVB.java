package com;

public class Ejercicio13_MVB {

	public static void main(String[] args) {
		//EJERCICIO 13. . Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un
		//centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
	    //Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños
	//y el resto se invierte en la bolsa.
		//Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de
		//niños y el resto se invierte en la bolsa.
	//La institución desea saber cuánto de dinero destinará a cada rubro anualmente.
		
		
		
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
		System.out.println("El centro de salud recibirá: $" + centroSalud);
        System.out.println("El comedor de niños recibirá: $" + comedorNinos);
        System.out.println("La inversión en la bolsa será de: $" + inversionBolsa);

	}

}
