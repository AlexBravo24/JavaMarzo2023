package com;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
	int a;
	Scanner entrada= new Scanner(System.in);
	System.out.println("introduzca el numero:");
	a=entrada.nextInt();
	switch(a) {
	case 1:System.out.println("seis");
	break;
	case 2:System.out.println("cinco");
	break;
	case 3: System.out.println("cuatro");
	break;
	case 4:System.out.println("tres");
	break;
	case 5:System.out.println("dos");
	break;
	case 6:System.out.println("uno");
	break;
	default:System.out.println("ERROR, numero incorrecto");
	break;
	}

	}

}
