package com;

import java.util.Scanner;

public class Ejercicio11_LARZ {

	public static void main(String[] args) {
		// 11. Una compa��a de transporte internacional tiene servicio en algunos pa�ses de Am�rica del Norte, Am�rica
		//Central, Am�rica del Sur, Europa y Asia. El costo por servicio de transporte se basa en el peso del paquete y
		//la zona a la que va dirigida. 
		//Parte de su pol�tica implica que los paquetes con un peso superior a 5kg no son transportados, por
		//cuestiones de log�stica y seguridad.
		//Realiza un algoritmo para determinar el cobro por la entrega de un paquete o, en su caso, el rechazo
		//de la entrega. 
		System.out.println("Programa que determina el cobro para la entrega de su paquete.");
		System.out.println();
		
		int zona;
		Scanner entrada = new Scanner(System.in);
		System.out.println("1.- Am�rica del Norte");
		System.out.println("2.- Am�rica Central");
		System.out.println("3.- Am�rica del Sur");
		System.out.println("4.- Europa");
		System.out.println("5.- Asia\n");
		System.out.println("Escriba el n�mero a su zona correspondiente: ");
		zona = entrada.nextInt();
		
		double peso;
		Scanner entrada2 = new Scanner(System.in);
		System.out.println("Escriba el peso de su equipaje (en Kg): ");
		peso = entrada2.nextDouble();
		
		if (peso<=0) { 
			System.out.println("Error");	
		}else if (peso>5) {
			System.out.println("Su paquete no puede ser enviado debido a que sobrepasa el peso maximo establecido.");
	    }else if (zona==1) {
	    	System.out.println("Usted debe de pagar por su paquete:" + (peso*24));
	    }else if (zona==2) {
	    	System.out.println("Usted debe de pagar por su paquete:" + (peso*20));	
	    }else if (zona==3) {
	    	System.out.println("Usted debe de pagar por su paquete:" + (peso*21));
	    }else if (zona==4) {
	    	System.out.println("Usted debe de pagar por su paquete:" + (peso*10));
	    }else if (zona==5) {
	    	System.out.println("Usted debe de pagar por su paquete:" + (peso*18));
	    }
	}
}
