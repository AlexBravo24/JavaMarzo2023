package com;

import java.util.Scanner;

public class Ejercicio6_EVVC {

	public static void main(String[] args) {
		/*. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva,
		 * la cual se clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la 
		 * venta del producto, ésta es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá
		 * un productor por la uva que entrega en un embarque considerando lo siguiente:
		 *  Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 
		 *  30 céntimos si es de tamaño 2.
		 *  Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando 
		 *  es de tamaño 2.
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
		System.out.println("Introduce el tamaño de la uva (1 o 2):");
		ta = entrada3.nextInt();
		
		Scanner entrada4 = new Scanner (System.in);
		System.out.println("Introduce el tipo de la uva (A o B):");
		ti = entrada4.next().charAt(0);
		
		if (ta == 1 && ti == tipoA) {
			pu=pi+0.20;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo A y Tamaño 1 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else if (ta == 1 && ti == tipoB) {
			pu=pi-0.30;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo A y Tamaño 2 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else if (ta == 2 && ti == tipoA ) {
			pu=pi+0.30;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo B y Tamaño 1 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else if (ta == 2 && ti == tipoB) {
			pu=pi-0.50;
			pf=kg*(pu);
			System.out.println("El precio por kg de uva Tipo B y Tamaño 2 es de: " + pu);
			System.out.println("El precio total por embarque de " + kg + " kg. es de " + pf);
		}else {
			System.out.println("¡¡Error!! \nIngresa un valores válidos" );
		}
		



	}

}
