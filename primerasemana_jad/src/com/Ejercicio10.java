package com;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		int mes;
		Scanner entrada = new Scanner (System.in);
		System.out.println("introduzca el número del 1 al 12:");
		mes=entrada.nextInt();
		if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12) {
			System.out.println("este mes tiene 31 dias");
		}
		else if(mes==4 || mes==6 || mes==9 || mes==11) {
			System.out.println("este mes tiene 30 dias");
		}
		else if(mes==2) {
			System.out.println("este mes tiene 28 dias");
		}
		else {
			System.out.println("se equivoco de número");
		}

	}

}
