package com;

import java.util.Scanner;

public class EjercicioArrays3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String palabra;
		System.out.println("ingrese una frase:");
		palabra=entrada.nextLine();
		char[] arreglo =new char[palabra.length()];
		for(int i=0;i<palabra.length();i++) {
			arreglo[i]=palabra.charAt(i);
		}
		for(int i=0;i<arreglo.length;i++) {
			System.out.print(arreglo[i]+" ");
		}

	}

}
