package com;

public class Ciclos5_LFEO {
	/*
	 * 5. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
     de un día desde las 00:00:00 horas hasta las 23:59:59 horas
	 * */

	public static void main(String[] args) {
		
		for(int h=1; h<=23; h++) {  //P
			
			for(int m=0; m<60; m++) {
				
				
				for(int s=0; s<60; s++) {
					
					System.out.println("H : "+h+ " M : "+m+ " S : "+s);
				}
			}
			
		}
		
		

	}

}
