package com;

import java.util.Scanner;

public class Numero_Par_Impar {
   public static void main(String[] args) {
	int a;
	Scanner entrada = new Scanner(System.in);
	System.out.println("introdusca el numero");
	a=entrada.nextInt();
	if(a%2==0) {
		System.out.println("el numero es par");
	}
	else {
		System.out.println("el numero es impar");
	}
}
}
