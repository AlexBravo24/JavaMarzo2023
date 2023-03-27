package com;
import java.util.Scanner;

public class Array3_AKVB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String cad_a;
		int size = 0 ;
		
		System.out.println("Programa que pasa una cadena a un array");
		System.out.println("Ingresar cadena...");
		cad_a = entrada.nextLine();
		size = cad_a.length();
		System.out.println("Tamaño: " + size);
		char [] cad_b = new char [size];	
		
		for(int i = 0 ; i < size ; i++) {
			cad_b[i] = cad_a.charAt(i);
//			System.out.println("cad_b["+ i +"]: " + cad_b[i]);
		}
		
		System.out.print("cad_b: ");
		for(int i = 0 ; i < size ; i++) {
//			cad_b[i] = cad_a.charAt(i);
			System.out.print(cad_b[i]);
		}
		
		entrada.close();
		}

}
