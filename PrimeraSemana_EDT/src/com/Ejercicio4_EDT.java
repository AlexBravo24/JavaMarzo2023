package com;
import java.util.Scanner;
public class Ejercicio4_EDT {
	
	public static void main(String[] args) {
		
		//4. Realiza un programa que lea una cadena por teclado y compruebe si es una letra mayúscula.
		
		Scanner my_scanner = new Scanner(System.in);
		
		System.out.println("Introduzca una frase");
		String text = my_scanner.nextLine();
		System.out.println("En tu frase tienes estas letras mayúsculas: ");
		String charr = String.valueOf(text.charAt(0));
		for (int i = 0; i < text.length(); i++) {

			if (String.valueOf(text.charAt(i)).equals(String.valueOf(text.charAt(i)).toUpperCase())) {
				System.out.println(text.charAt(i));
			}
			
		}
	}
}
