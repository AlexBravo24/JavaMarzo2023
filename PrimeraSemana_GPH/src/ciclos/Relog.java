package ciclos;
import java.util.*;
/*. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y segundos 
de un día desde las 00:00:00 horas hasta las 23:59:59 horas */


public class Relog {

	public static void main(String[] args) {
		Scanner T=new Scanner(System.in);
		System.out.println("Simulacion de relog Digital");
		
	for(int h = 00; h <=23; h++) {	
		
		for(int m=00; m <=59; m++) {
			for(int s=00; s <=29; s++) {
				System.out.println( h + ":"+ m+ ":"+ s);
				
			}
		}
	}
	}

	}


