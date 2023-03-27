package com;

import java.util.Scanner;

public class Ejercicio11_EVVC {

	public static void main(String[] args) {
		/*Una compañía de transporte internacional tiene servicio en algunos países de América del 
		 * Norte, América Central, América del Sur, Europa y Asia. El costo por servicio de 
		 * transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se 
		 * muestra en la siguiente tabla:
		 * Ubicación / Costo por Kg
		 * America del norte: 24
		 * America central: 20
		 * America del sur: 21
		 * Europa: 10
		 * Asia: 18
		 * Parte de su política implica que los paquetes con un peso superior a 5kg no son 
		 * transportados, por cuestiones de logística y seguridad. Realiza un algoritmo para 
		 * determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
		 */

		
		int ubicacion;
		double peso;
		double precio;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿A dónde envías? \nSeleccione la opción correcta \n1 (América del Norte) \n2 (América Central) \n3 (América del Sur) \n4 (Europa) \n5 (Asia) ");
		ubicacion=entrada.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Introduce los kg que pesa tu paquete:");
		peso=entrada2.nextDouble();
		
		if (peso<=5) {
		switch (ubicacion) {
		case 1:
			precio=peso*24;
			System.out.println("El cobro de tu paquete con destino a América del Norte es de: " + precio);
			break;
		case 2:
			precio=peso*20;
			System.out.println("El cobro de tu paquete con destino a América Central es de: " + precio);
			break;
		case 3:
			precio=peso*21;
			System.out.println("El cobro de tu paquete con destino a América del Sur es de: " + precio);
			break;
		case 4:
			precio=peso*10;
			System.out.println("El cobro de tu paquete con destino a Europa es de: " + precio);
			break;
		case 5:
			precio=peso*18;
			System.out.println("El cobro de tu paquete con destino a Asia es de: " + precio);
			break;
			default :
				System.out.println("¡¡ERROR!! \nIngresa un valor válido");
		}
		} else {
			System.out.println("Entrega rechazada \nPor cuestiones de logística y seguridad paquetes superiores a 5kg no pueden ser enviados");
		}
	}

}
