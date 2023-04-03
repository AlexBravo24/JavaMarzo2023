package com;

import java.util.Scanner;

public class Ejercicio14_RICG {

	public static void main(String[] args) {
		
		double hora;
		double extra;
		double resul;
		double resul1;
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de horas trabajadas");
		hora= entrada.nextDouble();
		
		Scanner entrada1 = new Scanner(System.in);
		System.out.println("Ingresa la cantidad de horas extra trabajadas");
		extra= entrada1.nextDouble();
		
		resul= hora *16;
		resul1= (hora*16)+(extra*20);
		
		if(hora <=40 && extra ==0 ) {
			System.out.println("El total de tu pago es = " + resul);
		}else if(hora >=40 && hora >=0) {
			System.out.println("El total de tu pago con horas extras es = " + resul1);
		}
		
		
		
	}

}
