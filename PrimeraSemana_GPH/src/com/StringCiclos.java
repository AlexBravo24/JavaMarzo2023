package com;

public class StringCiclos {

	public static void main(String[] args) {
/** Los ciclos o tambien llamados Bucles son estructuras
 * que permiten repetir sentencias o procesos
 * 
 * While (Mientras se cumpla una determinada condicion)
 * nos apoyamos de una variable que nos permita tener un indicador o control
 * 
 * */
	
		int x=1;
		
		while (x<4) { //Mientras -condicion -x sea menor a 4
			System.out.println("Hello Word");
			x++;
		}
		
	//do- while (ejecuta 1 vez mientras...)
		
		int e=1;
		do {
			System.out.println("Hello word0");
			e++;
			}while (e<6);
//For es para repetir un numero de veces un ciclo
		for(int i=5; i<10; i++) {
			System.out.println("Hello word0" +i);
		}
		
		
		
		
		

	}

}
