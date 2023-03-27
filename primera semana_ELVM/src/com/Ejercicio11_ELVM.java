package com;

import java.util.Scanner;

public class Ejercicio11_ELVM {

	public static void main(String[] args) {
		/*
		 * 11. Una compañía de transporte internacional tiene servicio en algunos países de América del Norte, América 
			Central, América del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y 
			la zona a la que va dirigida. Lo anterior se muestra en la siguiente tabla:
			ONA UBICACIÓN        COSTO/KILOGRAMO
			1 América del Norte  24,00 euros
			2 América Central    20, 00 euros
			3 América del Sur    21,00 euros
			4 Europa             10,00 euros
			5 Asia               18,00 euros
			Parte de su política implica que los paquetes con un peso superior a 5kg no son transportados, por 
			cuestiones de logística y seguridad.
			Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo 
			de la entrega
		 */

		
		int AmericaN=2400;
		int AmericaC=2000;
		int AmericaS=2100;		
		int Eu=1000;
		int Asia=1800;
		
		int zona=0;
		int kilos;
		int precio=0;
		
		Scanner entrada =new Scanner(System.in);
		System.out.println("A QUE ZONA VA? : \n 1.- America del norte \n 2.-America central \n 3.-America del Sur \n 4.-Europa \n 5.-Asia \n");
		System.out.println(" ");
		zona=entrada.nextInt();
		System.out.println("Cuantos kilos de sea subir: ");
		kilos=entrada.nextInt();
		
		
		if(kilos>5) {
			
			switch (kilos) {
			case 1:
				precio=AmericaN*kilos;
				System.out.println(" El precio de su transporte de equipaje es: "+precio);
				break;
			case 2:
				precio=AmericaC*kilos;
				System.out.println(" El precio de su transporte de equipaje es: "+precio);
				break;
			case 3:
				precio=AmericaS*kilos;
				System.out.println(" El precio de su transporte de equipaje es: "+precio);
				break;
			case 4:
				precio=Eu*kilos;
				System.out.println(" El precio de su transporte de equipaje es: "+precio);
				break;
			case 5:
				precio=Asia*kilos;
				System.out.println(" El precio de su transporte de equipaje es: "+precio);
				break;
			
			default:
				System.out.println("desconocido,ERROR");
			}
			
			
			
			
		}else {
			System.out.println("No puede ser transportado");
		}
		
		
		
		
	}

}
