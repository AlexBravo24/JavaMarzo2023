package com;
import java.util.Scanner;

public class Ejercicio5_AKVB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota, edad;
		char sexo;
		
		System.out.println("Programa que analiza una solicitud "
				+ "y emite un estatus.");
			
		System.out.println("Ingrese los siguientes campos: ");
		System.out.println("NOTA: (Valor entre 1 y 10)");
		nota = entrada.nextInt();
		while(nota<1 || nota>10){
			System.out.println("FAVOR DE INGRESAR UNA NOTA VALIDA (1-10)");
			nota = entrada.nextInt();
		}
		System.out.println("Edad: (Valor entre 0 y 120)");
		edad = entrada.nextInt();
		while(edad<0 || edad>120){
			System.out.println("FAVOR DE INGRESAR UNA EDAD VALIDA (0-120)");
			edad = entrada.nextInt();
		}
		System.out.println("Sexo: (M o F)");
		sexo = entrada.next().charAt(0);
		while(sexo!='M' && sexo!='F'){
			System.out.println("FAVOR DE INGRESAR UNA OPCIÓN VÁLIDA (M-F)");
			sexo = entrada.next().charAt(0);
		}
		System.out.println("ANALIZANDO LA SOLICITUD...\n");
		if(nota<5){
			System.out.println("Solicitud NO ACEPTADA");
		}else {
			if(edad<18) {
				System.out.println("Solicitud NO ACEPTADA");
			}else {
				if(sexo == 'M')
				{
					System.out.println("Solicitud POSIBLE");
				}else {
					System.out.println("SOLICITUD ACEPTADA");
				}
			}
		}
		System.out.println("Me despido, saludos cordiales.");
		
		entrada.close();
	}

}
