package com;

import java.util.Scanner;

public class Ejercicio6_ELVM {
	public static void main(String[] args) {
	
		/*
		 * 6. La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo de uva, la cual se 
			clasifica en tipos (A y B), y adem�s en tama�os (1 y 2). Cuando se realiza la venta del producto, �sta 
			es de un s�lo tipo y tama�o, se requiere determinar cu�nto recibir� un productor por la uva que 
			entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si 
			es de tama�o 2.
		 * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y 50 c�ntimos cuando es de 
			tama�o 2.
			Precio inicial se recibe desde teclado
		 */
		int kilos;
		int tama�o;
		char tipo;
		double total;
		double precio;
		
		Scanner entrada= new Scanner(System.in);
		System.out.println("dame la catidad de kilos de uva");
		kilos=entrada.nextInt();
		System.out.println("dame el precio por kilo de la uva");
		precio=entrada.nextInt();
		System.out.println("es del tipo A o tipo B? : ");
		tipo=entrada.next().charAt(0);//de esta forma se usa el char osea asi se guarda un char que nos dan
		
		System.out.println("Que tipo de tama�o es 1 o 2?: ");
		tama�o=entrada.nextInt();
		
		if(tipo=='A') {
			if(tama�o==1) {
				precio=precio+0.20;
			}else {
				precio=precio+0.30;
			}
		}else if(tipo=='B') {
			if(tama�o==1) {
				precio=precio+0.30;
			}else {
				precio=precio+0.50;
			}
		}else {
			System.out.println("no se eligio bien el tipo o tama�o");
		}
		total=kilos*precio;
		System.out.println("el precio total ya incluyendo el tipo y tama�o es de: "+total);
		
	}

}
