package com;

import java.util.Scanner;

public class Ejercicio11_MVB {

	public static void main(String[] args) {
		// EJERCICIO 11.Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América
		//Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
		//la zona a la que va dirigida.
		// los paquetes con un peso superior a 5kg no son transportados, por
		//cuestiones de logística y seguridad.
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
		//de la entrega

		
		Scanner entrada = new Scanner (System.in);
		System.out.println("Ingrese el peso del paquete en kilogramos");
		double peso = entrada.nextDouble();
		
		if (peso <=5){
			System.out.println("Ingrese la zona a la que se dirige la entrega: ");
			System.out.println("1. América del Norte");
			System.out.println("2. America Central");
			System.out.println("3. América del Sur");
			System.out.println("4. Europa");
			System.out.println("5. Asia");
			
			int zona = entrada.nextInt();
			double costoPorKilo;
			
			switch (zona) {
			case 1:
				costoPorKilo = 24.00;
				break;
			case 2:
			    costoPorKilo= 20.00;
			break; 
			
			case 3:
				costoPorKilo = 21.00;
				break;
			case 4:
				costoPorKilo = 10.00;
				break;
			case 5:
				costoPorKilo = 18.00;
				break;
			default:
				System.out.println("La zona ingresada no es válida");
				return;
				
			}
			
			double costoTotal = peso * costoPorKilo;
			System.out.printf("El costo por entrega es del %.2f euros.\n", costoTotal);
		}else {
			System.out.println("El paquete no puede ser transportado debido a su peso");
		}

	}

}
