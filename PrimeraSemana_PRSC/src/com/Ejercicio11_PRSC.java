package com;

import java.util.Scanner;

public class Ejercicio11_PRSC {

	public static void main(String[] args) {
		/*
		 * 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
		 * Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		 * la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		 * ZONA UBICACIÓN COSTO/KILOGRAMO
		 * 1 América del Norte 24,00 euros
		 * 2 América Central 20, 00 euros
		 * 3 América del Sur 21,00 euros
		 * 4 Europa 10,00 euros
		 * 5 Asia 18,00 euros
		 * Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
		 * cuestiones de logística y seguridad.
		 * Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		 * de la entrega
		 */

		int peso;
		int ubicación;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica la ubicación de destino: \n 1. América del Norte \n 2. América Central \n 3. América del Sur \n 4. Europa \n 5. Asia");
		ubicación = entrada.nextInt();
		
		System.out.println("Ingresa el peso del paquete");
		peso = entrada.nextInt();
		
		if (peso>5) {
			System.out.println("Elpaquete no puede ser enviado"); 
		} else {
			switch (ubicación) {
			case 1:
				System.out.println("El costo del envío es: " + 24*peso );
				break;
			case 2:
				System.out.println("El costo del envío es: " + 20*peso );
				break;
			case 3:
				System.out.println("El costo del envío es: " + 21*peso );
				break;
			case 4:
				System.out.println("El costo del envío es: " + 10*peso );
				break;
			case 5:
				System.out.println("El costo del envío es: " + 18*peso );
				break;
			default:
				System.out.println("Ubicación no válida");
		}
		
		
	}
	}
}
