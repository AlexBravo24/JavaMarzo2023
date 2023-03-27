package com;

import java.util.Scanner;

public class Ejercicio6_PRSC {

	public static void main(String[] args) {
		/*
		 * . La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
		 * es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
		 * entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
		 * es de tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
		 * tamaño 2.
		 * Precio inicial se recibe desde teclado
		 */

		double precio;
		int tamaño;	
		char tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio inicial");
		precio = entrada.nextDouble();
		
		System.out.println("Selecciona el tamaño: 1 o 2");
		tamaño = entrada.nextInt();
		
		System.out.println("Introduce el tipo: A o B");
		tipo = entrada.next().charAt(0);
		
		char a = 'A';
		char b = 'B';
		
		if (tamaño==1 && tipo==a) {
			System.out.printf("%.2f", precio+.20);
	    } else if (tamaño==2 && tipo==a) {
		    System.out.printf("%.2f", precio+.30);
        } else if (tamaño==1 && tipo==b) {
        	System.out.printf("%.2f", precio-.30);
        } else if (tamaño==2 && tipo==b) {
        	System.out.printf("%.2f", precio-.50);
        }

}
}