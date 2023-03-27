package com;

import java.util.Scanner;

public class Ejercicio9_RICG {

	public static void main(String[] args) {
		
		
		int valor; 
		String d1= "uno";
		String d2= "dos";
		String d3= "tres";
		String d4= "cuatro";
		String d5= "cinco";
		String d6= "seis";
		String d7= "siete";
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un valor del 1 al 7");
		valor = entrada.nextInt();
		
		if (valor==1) {
			System.out.println("El primer dia de la semana es  " + d1);
			}else if(valor ==2) {
				System.out.println("El segundo dia de la semana es " + d2);	
				}else if(valor ==3) {
					System.out.println("El tecer dia de la semana es  " + d3);
				}else if(valor ==4) {
					System.out.println("El cuarto dia de la semana es  " + d4);
				}else if(valor ==5) {
					System.out.println("El quinto dia de la semana es  " + d5);
				}else if(valor ==6) {
					System.out.println("El sexto dia de la semana es  " + d6);
				}else if(valor ==7) {
					System.out.println("El septimo dia de la semana es  " + d7);
				}else if (valor <=0 || valor >=7) {
					System.out.println("ERROR");
				}
		

	}

}
