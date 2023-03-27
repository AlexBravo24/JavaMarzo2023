package com;

public class Ciclo5_RICG {

	public static void main(String[] args) {
		//Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		//de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
	
//		
    	int hora = 23;
		int minutos = 59;
		int segundos = 59;		
		
		
		
		for(int i= 00; i<=hora; i++) {
			
		for(int j = 00; j<=minutos; j++) {
				
			for(int k =00; k<=segundos; k++) {
				System.out.println("La hora es " + i+ ":" + j + ":" +k);
			}
			
		}
		}
	}

}
