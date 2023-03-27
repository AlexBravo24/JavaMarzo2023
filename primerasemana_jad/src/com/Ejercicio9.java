package com;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		int a;
		Scanner entrada =new Scanner (System.in);
		System.out.println("escribe el numero del dia:");
		a=entrada.nextInt();
		switch(a) {
		case 1:System.out.println("LUNES");
		break;
		case 2:System.out.println("MARTES");
		break;
		case 3:System.out.println("MIERCOLES");
		break;
		case 4:System.out.println("JUEVES");
		break;
		case 5:System.out.println("VIERNES");
		break;
		case 6:System.out.println("SABADO");
		break;
		case 7:System.out.println("DOMINGO");
		break;
		default:System.out.println("ERROR");
		break;
		}

	}

}
