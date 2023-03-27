package com;

import java.util.Scanner;

public class Ejercicio6_EVVC {

	public static void main(String[] args) {
		/*. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva,
		 * la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la 
		 * venta del producto, �sta es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir�
		 * un productor por la uva que entrega en un embarque considerando lo siguiente:
		 *  Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 
		 *  30 c�ntimos si es de tama�o 2.
		 *  Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando 
		 *  es de tama�o 2.
		 *  Precio inicial se recibe desde teclado
		 */
		double pi;
		double kg;
		int ta;
		char ti;
		char tipoA='A';
		char tipoB='B';
		double pf;
		double pu;

		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduce el precio inicial por kilo de uva:");
		pi = entrada.nextDouble();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Introduce los kg por embarque:");
		kg = entrada2.nextDouble();
		
		Scanner entrada3 = new Scanner (System.in);
		System.out.println("Introduce el tama�o de la uva (1 o 2):");
		ta = entrada3.nextInt();
		
		Scanner entrada4 = new Scanner (System.in);
		System.out.println("Introduce el tipo de la uva (A o B):");
		ti = entrada4.next().charAt(0);
		
		if (ta == 1 && ti == tipoA) {
			pu=pi+0.20;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo A y Tama�o 1 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else if (ta == 1 && ti == tipoB) {
			pu=pi-0.30;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo A y Tama�o 2 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else if (ta == 2 && ti == tipoA ) {
			pu=pi+0.30;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo B y Tama�o 1 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else if (ta == 2 && ti == tipoB) {
			pu=pi-0.50;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo B y Tama�o 2 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else {
			System.out.println("��Error!! \nIngresa un valores v�lidos" );
		}
		



	}

}
