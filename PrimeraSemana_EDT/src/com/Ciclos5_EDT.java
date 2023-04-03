package com;
import java.util.Scanner;
public class Ciclos5_EDT {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner my_scanner = new Scanner(System.in);
		
		//5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		
		
		for (int i = 0; i < 24; i++) {
			
			for (int j = 0; j < 60; j++) {
				
				for (int k = 0; k< 60; k++) {
					
					System.out.println(i + ":" + j + ":" + k );
				}
			}
		
		}

		
	}
}
