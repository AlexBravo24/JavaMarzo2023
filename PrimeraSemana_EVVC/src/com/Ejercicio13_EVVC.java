package com;

import java.util.Scanner;

public class Ejercicio13_EVVC {

	public static void main(String[] args) {
		/*Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte
		 * entre un centro de salud, un comedor de niños y una parte lo invierte en la bolsa de 
		 * acuerdo a lo siguiente: 
		 * Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al
		 * comedor de niños y el resto se invierte en la bolsa.
		 * Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al
		 *  comedor de niños y el resto se invierte en la bolsa.
		 *  La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		 */

		double dr;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Cuál fue la donación de este año?");
		dr=entrada.nextDouble();
		
		if (dr >= 10000) { 
			System.out.println("La cantidad que se destina al centro de salud es: " + dr*.3);
			System.out.println("La cantidad que se destina al comedor de niños es " + dr*0.5);
			System.out.println("La cantidad que se destina a la bolsa es: " + dr*0.2);
			
		}else if (dr<10000) {
			System.out.println("La cantidad que se destina al centro de salud es: " + dr*.25);
			System.out.println("La cantidad que se destina al comedor de niños es " + dr*0.6);
			System.out.println("La cantidad que se destina a la bolsa es: " + dr*0.15);
			
		}
		
	}

}
