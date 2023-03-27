package com;

import java.util.Scanner;

public class Ejercicio11_PRSC {

	public static void main(String[] args) {
		/*
		 * 11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica 
		 * Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
		 * la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
		 * ZONA UBICACI�N COSTO/KILOGRAMO
		 * 1 Am�rica del Norte 24,00 euros
		 * 2 Am�rica Central 20, 00 euros
		 * 3 Am�rica del Sur 21,00 euros
		 * 4 Europa 10,00 euros
		 * 5 Asia 18,00 euros
		 * Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por 
		 * cuestiones de log�stica y seguridad.
		 * Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
		 * de la entrega
		 */

		int peso;
		int ubicaci�n;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Indica la ubicaci�n de destino: \n 1. Am�rica del Norte \n 2. Am�rica Central \n 3. Am�rica del Sur \n 4. Europa \n 5. Asia");
		ubicaci�n = entrada.nextInt();
		
		System.out.println("Ingresa el peso del paquete");
		peso = entrada.nextInt();
		
		if (peso>5) {
			System.out.println("Elpaquete no puede ser enviado"); 
		} else {
			switch (ubicaci�n) {
			case 1:
				System.out.println("El costo del env�o es: " + 24*peso );
				break;
			case 2:
				System.out.println("El costo del env�o es: " + 20*peso );
				break;
			case 3:
				System.out.println("El costo del env�o es: " + 21*peso );
				break;
			case 4:
				System.out.println("El costo del env�o es: " + 10*peso );
				break;
			case 5:
				System.out.println("El costo del env�o es: " + 18*peso );
				break;
			default:
				System.out.println("Ubicaci�n no v�lida");
		}
		
		
	}
	}
}
