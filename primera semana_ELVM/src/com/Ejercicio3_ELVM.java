package com;

import java.util.Scanner;

public class Ejercicio3_ELVM {

	public static void main(String[] args) {
		// 3.Crea un programa que pida al usuario dos números y muestre el resultado de su división. Si el 
		//segundo número es 0, debe mostrar un mensaje de error.
		int numero1=0;
		int numero2=0;
		int divicion=0;
		
		Scanner entrada =new Scanner(System.in);
		System.out.println("Dame el primer numero: ");
		numero1=entrada.nextInt();
		Scanner entrada2 =new Scanner (System.in);
		System.out.println("Dame el segundo numero: ");
		numero2=entrada2.nextInt();
		
		divicion=numero1/numero2;
		System.out.println("el resultado de la divicion del primero numero entre el segundo numero es: "+divicion);
		if(numero2==0) {
			System.out.println("Error de numero");
		}else {
			System.out.println("no hay error");
		}
		

	}

}
