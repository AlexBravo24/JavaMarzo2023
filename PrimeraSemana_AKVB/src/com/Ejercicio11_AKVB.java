package com;
import java.util.Scanner;

public class Ejercicio11_AKVB {

	public static void main(String[] args) {
		int zona=0;
		double peso=0,cost=0;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Programa que indica el costo de enviar un paquete basado en su peso.");
		System.out.println("PAQUETES MAYORES A 5KG NO SE ENVIAN.");
		System.out.println("Elija a qué zona quiere enviar su paquete...");
		System.out.println("   1. América del Norte ................. 24.00 euros/kg");
		System.out.println("   2. América Central ................... 24.00 euros/kg");
		System.out.println("   3. América del Sur ................... 24.00 euros/kg");
		System.out.println("   4. Europa ............................ 24.00 euros/kg");
		System.out.println("   5. Asia .............................. 24.00 euros/kg");
		
		zona = entrada.nextInt();
		while(zona < 1 || zona > 5){
			System.out.println("FAVOR DE ELEGIR UNA ZONA VÁLIDA");
			System.out.println("   1. América del Norte ................. 24.00 euros/kg");
			System.out.println("   2. América Central ................... 20.00 euros/kg");
			System.out.println("   3. América del Sur ................... 21.00 euros/kg");
			System.out.println("   4. Europa ............................ 10.00 euros/kg");
			System.out.println("   5. Asia .............................. 28.00 euros/kg");
			zona = entrada.nextInt();
		}
		System.out.println("Ingrese el peso de su paquete...");
		peso = entrada.nextDouble();
		while(peso < 0){
			System.out.println("Ingrese un peso válido.");
			peso = entrada.nextInt();
		}
		
		System.out.println("CALCULANDO EL COSTO DEL ENVÍO...");
		switch(zona) {
		case 1:
			cost = peso*24;
			break;
		case 2:
			cost = peso*20;
			break;
		case 3:
			cost = peso*21;
			break;
		case 4:
			cost = peso*10;
			break;
		case 5:
			cost = peso*18;
			break;
		default:
			break;
		}
		if(peso <= 5 ) {
			System.out.println(" ");
			System.out.printf("El costo de su envío es: "+ "%.2f", cost);
			System.out.println(" ");
		}else {
			System.out.println("PAQUETE RECHAZADO: Paquetes mayores a 5kg no son enviados por cuestiones de logística y seguridad.");
		}
		entrada.close();
		System.out.println("\nMe despido, saludos cordiales.");
	}

}
