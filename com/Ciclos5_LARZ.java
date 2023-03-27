package com;

import java.util.Scanner;

public class Ciclos5_LARZ {

	public static void main(String[] args) throws InterruptedException {
		// 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		System.out.println("Programa que simular el comportamiento de un reloj digital");
		System.out.println();
		
		int segundos=0;
		int minutos = 0;
		int horas = 0;
		
		while (true) {
			
			if (horas<10) {
				System.out.print("0");
			} System.out.print(horas+":");
			
			if (minutos<10) {
				System.out.print("0");
			} System.out.print(minutos+":");
			
			if (segundos<10) {
				System.out.print("0");
			} System.out.println(segundos);
		
				segundos++;
		 
			if (segundos == 60) {
				segundos=0;
				minutos++;
				
			if (minutos==60) {
				minutos=0;
				horas++;
				
			if (horas==24) {
				System.exit(0);
				
			}
			}
			}
			Thread.sleep(1);
		} 
	}

}
