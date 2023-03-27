package com;

public class Ciclos5_AKVB {
	public static void main(String[] args) {
		System.out.println("Programa que imprime todas las horas.");
		for(int i = 0; i < 24; i++) {
//			System.out.println("HORA: " + i + ":00:00");
			for(int j = 0; j < 60; j++) {
//				if(j<10) {
//					System.out.println("MINUTO: " + i + ":0" + j + ":00");
//				}else {
//					System.out.println("MINUTO: " + i + ":" + j + ":00");
//				}
				for(int k = 0; k < 60; k++) {
					System.out.print("\nSEGUNDO: ");
					if(i<10) {
						System.out.print("0");
					}
					System.out.print(i + ":");
					if(j<10) {
						System.out.print("0");
					}
					System.out.print(j + ":");
					if(k<10) {
						System.out.print("0");
					}
					System.out.print(k);
				}
			}
		}
		
		
		
		
		System.out.println("\nMe despido, saludos cordiales.");
	}

}
