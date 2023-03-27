package com;
import java.util.Scanner;
public class Arrays3_MVB {

	public static void main(String[] args) {
		// Ejercicio 3. Pide al usuario por teclado una frase y pasa sus caracteres a un array de
		//caracteres.

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Ingrese una frase: ");
		String frase = myscanner.nextLine();
		
		char[] caracteres = frase.toCharArray();
		
		for (int i = 0; i< caracteres.length;i++) {
			System.out.println("El caracter en la posicion"+ i +" es: "+caracteres[i]);
		}
		
		
		
		
	}//cierredelmain

}//cierredelaclase
