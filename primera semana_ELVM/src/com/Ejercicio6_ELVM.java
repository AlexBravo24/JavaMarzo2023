package com;

import java.util.Scanner;

public class Ejercicio6_ELVM {
	public static void main(String[] args) {
	
		/*
		 * 6. La asociación de vinicultores tiene como política fijar un precio inicial al kilo de uva, la cual se 
			clasifica en tipos (A y B), y además en tamaños (1 y 2). Cuando se realiza la venta del producto, ésta 
			es de un sólo tipo y tamaño, se requiere determinar cuánto recibirá un productor por la uva que 
			entrega en un embarque considerando lo siguiente:
		 * Si es de tipo A, se le cargan 20 céntimos al precio inicial cuando es de tamaño 1 y 30 céntimos si 
			es de tamaño 2.
		 * Si es de tipo B, se rebajan 30 céntimos cuando es de tamaño 1, y 50 céntimos cuando es de 
			tamaño 2.
			Precio inicial se recibe desde teclado
		 */
		int kilos;
		int tamaño;
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
		
		System.out.println("Que tipo de tamaño es 1 o 2?: ");
		tamaño=entrada.nextInt();
		
		if(tipo=='A') {
			if(tamaño==1) {
				precio=precio+0.20;
			}else {
				precio=precio+0.30;
			}
		}else if(tipo=='B') {
			if(tamaño==1) {
				precio=precio+0.30;
			}else {
				precio=precio+0.50;
			}
		}else {
			System.out.println("no se eligio bien el tipo o tamaño");
		}
		total=kilos*precio;
		System.out.println("el precio total ya incluyendo el tipo y tamaño es de: "+total);
		
	}

}
