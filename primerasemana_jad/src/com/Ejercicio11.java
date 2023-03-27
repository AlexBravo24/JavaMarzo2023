package com;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		int lugar;
		float peso,pago;
		Scanner entrada=new Scanner (System.in);
		System.out.println("introduzca el peso en kg a enviar:");
		peso=entrada.nextFloat();
		if(peso<=5) {
			System.out.println("introduzca el lugar de destino:");
			lugar=entrada.nextInt();
			switch (lugar) {
			case 1:pago=peso*24;
			System.out.println("el monto a pagar es "+pago+" euros");
			break;
			case 2:pago=peso*20;
			System.out.println("el monto a pagar es "+pago+" euros");
			break;
			case 3:pago=peso*21;
			System.out.println("el monto a pagar es "+pago+" euros");
			break;
			case 4:pago=peso*10;
			System.out.println("el monto a pagar es "+pago+" euros");
			break;
			case 5:pago=peso*18;
			System.out.println("el monto a pagar es "+pago+" euros");
			break;
			}
			
		}else {
			System.out.println("no podemos enviar mas de 5 kg");
		}

	}

}
