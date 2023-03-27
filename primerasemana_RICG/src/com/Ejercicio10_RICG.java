package com;

import java.util.Scanner;

public class Ejercicio10_RICG {

	public static void main(String[] args) {
		int numero; 
		
		String m1= "Enero con 31  dias";
		String m2= "Febrero con 28 dias";
		String m3= "Marzo con 31 dias";
		String m4= "Abril con 30 dias";
		String m5= "Mayo con 31 dias";
		String m6= "Junio con 30 dias";
		String m7= "Julio con 31 dias";
		String m8= "Agosto con 31 dias";
		String m9= "Septiembre con 30 dias";
		String m10= "Octubre con 31 dias";
		String m11= "Noviembre con 30 dias";
		String m12= "Diciembre con 31 dias";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa un valor del 1 al 12");
		numero = entrada.nextInt();
		
		if (numero==1) {
			System.out.println("El primer mes es " + m1 );
			}else if(numero ==2) {
				System.out.println("El segundo mes es " + m2);	
				}else if(numero ==3) {
					System.out.println("El tecer me es  " + m3);
				}else if(numero ==4) {
					System.out.println("El cuarto mes es  " + m4);
				}else if(numero ==5) {
					System.out.println("El quinto mes es  " + m5);
				}else if(numero ==6) {
					System.out.println("El sexto mes es  " + m6);
				}else if(numero ==7) {
					System.out.println("El septimo mes es  " + m7);
				}else if(numero ==8) {
					System.out.println("El octavo mes es  " + m8);
				}else if(numero ==9) {
					System.out.println("El noveno mes es  " + m9);
				}else if(numero ==10) {
					System.out.println("El decimo mes es  " + m10);
				}else if(numero ==11) {
					System.out.println("El decimo primer mes es  " + m11);
				}else if(numero ==12) {
					System.out.println("El n es  " + m12);
				}
		
		
		
		
	}

}
