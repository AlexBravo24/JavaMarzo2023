package com;

import java.util.Scanner;

public class Ejercicio13_PRSC {

	public static void main(String[] args) {
		/*
		 * 13. Una institución benéfica recibe anualmente una donación proveniente de Europa y lo reparte entre un 
		 * centro de salud, un comedor de niños y una parte lo invierte en la bolsa de acuerdo a lo siguiente:
		 * Si el monto de la donación es de $10000 o más: 30% se destina al centro de salud, 50% al comedor de niños 
		 * y el resto se invierte en la bolsa.
		 * Si el monto de la donación es menor que $10000: 25% se destina al centro de salud, 60% al comedor de 
		 * niños y el resto se invierte en la bolsa.
		 * La institución desea saber cuánto de dinero destinará a cada rubro anualmente
		 */

		int donación;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de su donación");
		donación = entrada.nextInt();
		
		if (donación>=10000) {
			System.out.println("Al centro de salud se donarán: " + donación*.3 + "\n Al comedor de niños se donarán: " + donación*.5 + "\n En la bolsa se invertirán: " + donación*.2);
		} else if (donación<10000) {
			System.out.println("Al centro de salud se donarán: " + donación*.25 + "\n Al comedor de niños se donarán: " + donación*.6 + "\n En la bolsa se invertirán: " + donación*.15);
		}
	}

}
