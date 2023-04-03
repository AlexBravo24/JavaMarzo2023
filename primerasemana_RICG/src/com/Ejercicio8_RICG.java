package com;

import java.util.Scanner;

public class Ejercicio8_RICG {

	public static void main(String[] args) {
		
		int resultado; 
		String a1= "uno";
		String a2= "dos";
		String a3= "tres";
		String a4= "cuatro";
		String a5= "cinco";
		String a6= "seis";
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Ingresa el resultado del 1 al 6");
		resultado = entrada.nextInt();
		
		if(resultado == 1) {
			System.out.println("La cara es = " + a6 );	
		}else if(resultado == 2) {
			System.out.println("La cara es =" + a5);
		}else if(resultado ==3) {
			System.out.println("La cara es =" + a4);
		}else if(resultado == 6) {
			System.out.println("La cara es =" + a1);
		}else if(resultado == 5) {
			System.out.println("La cara es =" + a2);
		}else if(resultado == 4) {
			System.out.println("La cara es =" + a3);
		}else if(resultado >=7 ) {//&& resultado <=0 ) {
			System.out.println("ERROR numero incorrecto");
		}else if(resultado <=0) {
			System.out.println("ERROR numero incorrecto");
		}

	}

}
