package com;

import java.util.Scanner;

public class Ejercicio6_PRSC {

	public static void main(String[] args) {
		/*
		 * . La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
		 * clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
		 * es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
		 * entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
		 * es de tama�o 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
		 * tama�o 2.
		 * Precio inicial se recibe desde teclado
		 */

		double precio;
		int tama�o;	
		char tipo;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce el precio inicial");
		precio = entrada.nextDouble();
		
		System.out.println("Selecciona el tama�o: 1 o 2");
		tama�o = entrada.nextInt();
		
		System.out.println("Introduce el tipo: A o B");
		tipo = entrada.next().charAt(0);
		
		char a = 'A';
		char b = 'B';
		
		if (tama�o==1 && tipo==a) {
			System.out.printf("%.2f", precio+.20);
	    } else if (tama�o==2 && tipo==a) {
		    System.out.printf("%.2f", precio+.30);
        } else if (tama�o==1 && tipo==b) {
        	System.out.printf("%.2f", precio-.30);
        } else if (tama�o==2 && tipo==b) {
        	System.out.printf("%.2f", precio-.50);
        }

}
}