package com;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		float a,b,div;
		Scanner entrada=new Scanner(System.in);
		System.out.println("introduszca el primer numero");
		a=entrada.nextFloat();
		System.out.println("introduzca el segundo numero");
		b=entrada.nextFloat();
		if(b==0) {
		System.out.println("error");
		}
		else {
			div=a/b;
			System.out.println("el resultado es:"+div);
		}

	}

}
