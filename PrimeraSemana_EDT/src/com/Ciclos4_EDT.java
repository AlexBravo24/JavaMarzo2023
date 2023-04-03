package com;
import java.util.Scanner;
public class Ciclos4_EDT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner my_scanner = new Scanner(System.in);
		
		//4.Programa que reciba una frase y una letra por teclado. Deberá retornar como resultado 
		//cuántas veces existe esa letra dentro de la frase. Si no existe, imprimir un mensaje 
		//“Carácter no encontrado”.
		System.out.println("Introduca una frase");
		String sentence = my_scanner.nextLine();
		System.out.println("Introduca una letra");
		String letter = my_scanner.next();
		
		int counter = 0;
		for (int i = 0; i < sentence.length(); i++) {
			
			if (String.valueOf(sentence.charAt(i)).equals(letter)) {
				counter+=1;
			}
		}
		System.out.println("La letra " + letter + " aparece " + counter + " veces en su frase.");
		
	}

}
