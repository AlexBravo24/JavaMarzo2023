package com;

public class Ciclos5_EVVC {

	public static void main(String[] args) {
		/*Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
		 * de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		 */

//		int min=0;
//		int m=0;
//		int hor=0;
//		int h=0;
		
		for (int hor=0; hor<24 ; hor++) {
			for (int min =0; min<60 ; min++) {
				for (int seg=0; seg<60 ; seg++ ) {
					System.out.println(hor+" : "+ min+" : " +seg);
				}
			}
		}	
			
			
//			if (seg==59 && min<59) {
//				min=m+1;
//				seg=0;
//				m=min;
//				//System.out.println("mi"+min);
//				if (min==59 && hor<4) {
//					hor=h+1;
//					
//					m=0;
//					min=0;
//					//System.out.println("hor"+ hor);
//					
//				}
//				
//			}
		
		
	}

}
