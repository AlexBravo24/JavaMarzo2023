package com;

import java.util.Scanner;

public class Ejercicio11_EVVC {

	public static void main(String[] args) {
		/*Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del 
		 * Norte, Am�rica Central, Am�rica del Sur, Europa y Asia. El costo por servicio de 
		 * transporte se basa en el peso del paquete y la zona a la que va dirigida. Lo anterior se 
		 * muestra en la siguiente tabla:
		 * Ubicaci�n / Costo por Kg
		 * America del norte: 24
		 * America central: 20
		 * America del sur: 21
		 * Europa: 10
		 * Asia: 18
		 * Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son 
		 * transportados, por cuestiones de log�stica y seguridad. Realiza un algoritmo para 
		 * determinar el cobro por la entrega de un paquete o, en su caso, el rechazo de la entrega.
		 */

		
		int ubicacion;
		double peso;
		double precio;
		
		Scanner entrada = new Scanner (System.in);
		System.out.println("�A d�nde env�as? \nSeleccione la opci�n correcta \n1 (Am�rica del Norte) \n2 (Am�rica Central) \n3 (Am�rica del Sur) \n4 (Europa) \n5 (Asia) ");
		ubicacion=entrada.nextInt();
		
		Scanner entrada2 = new Scanner (System.in);
		System.out.println("Introduce los kg que pesa tu paquete:");
		peso=entrada2.nextDouble();
		
		if (peso<=5) {
		switch (ubicacion) {
		case 1:
			precio=peso*24;
			System.out.println("El cobro de tu paquete con destino a Am�rica del Norte es de: " + precio);
			break;
		case 2:
			precio=peso*20;
			System.out.println("El cobro de tu paquete con destino a Am�rica Central es de: " + precio);
			break;
		case 3:
			precio=peso*21;
			System.out.println("El cobro de tu paquete con destino a Am�rica del Sur es de: " + precio);
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
				System.out.println("��ERROR!! \nIngresa un valor v�lido");
		}
		} else {
			System.out.println("Entrega rechazada \nPor cuestiones de log�stica y seguridad paquetes superiores a 5kg no pueden ser enviados");
		}
	}

}
